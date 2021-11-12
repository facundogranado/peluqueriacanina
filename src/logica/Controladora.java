package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia control = new ControladoraPersistencia(); 
    
        public void crearCliente (String nombre,String raza,String color,Boolean alergico,Boolean especial,String nombreduenio, String celduienio,String observa){
            Cliente clie = new Cliente(nombre, raza, color, alergico, especial, nombreduenio, celduienio, observa);
            control.crearCliente(clie);
    }
    
    
    public void crearCliente (Cliente clie){
        control.crearCliente(clie);
    }
    
}
