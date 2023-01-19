public class Persona {
    //Atributos
    String nombre;
    int edad;

    //Metodos

    //Metodo constructor
    /*Este metodo nos sirve para inicializar nuestros atributos y debemos darle como parametros los atributos y dentro del mismo inicializarlos como se ve a continuacion.
     * La palabra this sirve para que java no se confunda con que nombre debe tomar para que valor.
     */
   public Persona(String nombre, int edad){ 
    this.nombre = nombre; //El que tiene this es el atributo y el que no tiene this es el parametro
    this.edad = edad;
   }

   public void mostrarDatos(){
    System.out.println("El nombre es: "+nombre);
    System.out.println("La edad es: "+edad);
   }
}
