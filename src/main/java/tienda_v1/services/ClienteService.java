package tienda_v1.services;

import java.util.List;
import tienda_v1.domain.Cliente;

public interface ClienteService {
    //lista registros tabla cliente y coloca en lista de objetos cliente
    public List<Cliente> getClientes();
    //obtiene registro de la tabla cliente que tiene el id pasado por el obj
    public Cliente getCliente(Cliente cliente);
    //elimina registro de la tabla cliente que tiene el id pasado por el obj
    public void deleteCliente (Cliente cliente);
    //se crea si no existe o es nulo se crea nuevo en la tabla
    //si existe se modifica
    public void saveCliente (Cliente cliente);
    
}
