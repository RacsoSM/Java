
//NECESARIO IMPORTAR
import java.util.HashMap;
public class basico {

    /*Un HashMap es un tipo de Map que se basa en dar una clave (key) y un valor (value) a algo
    Sintaxis: 
    HashMap<String,Integer> hash = new HashMap <> ();
    Le tenemos que dar como parametros entre los primeros diamantes <> primero, el tipo de dato que será la key y luego el valor (Solo clases primitivas). 
     * 
     * put = ingresa un valor al hashmap
     * get = muestra un valor al nosotros ingresarle la key
     * containsKey = muestra si el hashmap contiene cierta llave, regresa un boolean
     */
    public static void main(String[] args) {
        HashMap<String,Integer> empIds = new HashMap <> (); //HashMap de key String y value Integer de nombre empIds

        empIds.put("John", 12345); //Agregamos la key John con el valor 12345
        empIds.put("Carl",24123);
        empIds.put("Jerry",98765);

        System.out.println(empIds); //Mostramos el contenido del HashMap

        System.out.println(empIds.get("Jerry")); // Valor de Jerry

        System.out.println(empIds.containsKey("Jerry"));//Nos muestra si el hashmap tiene una key especifica, devolviendonos un boolean, aqui devuelve true
        System.out.println(empIds.containsKey("Fernandinho")); //devuelve false ya que la key Fernandinho no existe

        System.out.println(empIds.containsValue(24123)); //Nos muestra si el hashmap tiene un valor especifico, devolviendonos un boolean, aqui devuelve true
        System.out.println(empIds.containsValue(243)); //devuelve false ya que el valor 243 no existe
    }
    
}
