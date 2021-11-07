package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia(); 
    
    public void crearCliente (Cliente clie){
        control.crearCliente(clie);
    }
    
}
