public class Persona {
    //Atributos
    String nombre;
    int edad;

    //Metodos

    //Metodo constructor
    /*Este metodo nos sirve para inicializar nuestros atributos y debemos darle como parametros los atributos y dentro del mismo inicializarlos como se ve a continuacion. */
   public Persona(String _nombre, int _edad){ 
    nombre = _nombre; //
    edad = _edad;
   }

   public void mostrarDatos(){
    System.out.println("El nombre es: "+nombre);
    System.out.println("La edad es: "+edad);
   }
}
