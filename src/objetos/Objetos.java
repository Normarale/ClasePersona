
package objetos;


public class Objetos {

    public static void main(String[] args) {
        // TODO code application logic here
        Persona miPersona = new Persona();
        miPersona.setNombre("Norma");
        miPersona.setEdad(46);
        miPersona.setTelefono("3512182546");
        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getTelefono());
        
    }
    
    
 
}

    class Persona{
        private String Nombre;
        private int Edad;
        private String Telefono;

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public int getEdad() {
            return Edad;
        }

        public void setEdad(int Edad) {
            this.Edad = Edad;
        }

        public String getTelefono() {
            return Telefono;
        }

        public void setTelefono(String Telefono) {
            this.Telefono = Telefono;
        }
        
        
    }