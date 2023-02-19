package tienda_v1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tienda_v1.domain.Cliente;

public interface ClienteDao extends JpaRepository<Cliente,Long> {
    
}
