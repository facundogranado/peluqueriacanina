package logica;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        
         Controladora control = new Controladora();
         
         Cliente cliente0 = new Cliente ("Blanca", "Mestiza", "Blanco", Boolean.TRUE, Boolean.FALSE, "Facundo", "65412", "");
        
         control.crearCliente(cliente0);
    }
    
}
