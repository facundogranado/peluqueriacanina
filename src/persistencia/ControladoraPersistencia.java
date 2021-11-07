package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;

public class ControladoraPersistencia {
    
    ClienteJpaController clienteJPA = new ClienteJpaController();
    
    public void crearCliente(Cliente clie){
        
        try {
            clienteJPA.create(clie);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
