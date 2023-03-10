package tienda_v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tienda_v1.domain.Cliente;
import tienda_v1.services.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var clientes = clienteService.getClientes(); 
        model.addAttribute("clientes",clientes);
        return "/cliente/listado";
    }
    
    @GetMapping("/eliminar/{idCliente}")
    public String eliminaCliente(Cliente cliente) {
        clienteService.deleteCliente(cliente);
        return "redirect:/cliente/listado";
    }

    @GetMapping("/nuevo")
    public String nuevoCliente(Cliente cliente){
        return "/cliente/modifica";
    }
    
    @PostMapping("/guardar")
    public String guardarCliente(Cliente cliente){
        clienteService.saveCliente(cliente);
        return "redirect:/cliente/listado";
    }
    
    @GetMapping("/modificar/{idCliente}")
    public String modificaCliente(Cliente cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "/cliente/modifica";
    }
    
}
