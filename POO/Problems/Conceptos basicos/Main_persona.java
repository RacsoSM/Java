public class Main_persona {
    public static void main(String[] args) {
         /*Cuando se crea un objeto ocurren 3 cosas: 
     * Se asigna memoria para el objeto.
     * Se inicializan los atributos de ese objeto.
     * Se invoca al constructor de la clase que puede ser uno entre varios.
     * 
     * Persona p1 = new Persona();
     *                  Contructor = Persona()
     * 
     * Caracteristicas de los contructores:
     * Tienen el mismo nombre de la clase
     * No devuelve ningun valor
     * Debe declararse como publico
     */
    Persona p1 = new Persona("Oscar",18); //Como en Persona le dijimos al constructor que tendria dos parametros, aqui se los pasamos.

    p1.mostrarDatos();
    }
    
   
}
