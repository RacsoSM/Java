
//NECESARIO IMPORTAR
import java.util.HashMap;
public class basico {

    /*Un HashMap es un tipo de Map que se basa en dar una clave (key) y un valor (value) a algo
    Sintaxis: 
    HashMap<String,Integer> hash = new HashMap <> ();
    Le tenemos que dar como parametros entre los primeros diamantes <> primero, el tipo de dato que será la key y luego el valor (Solo clases primitivas). 
     * 
     * put = ingresa un valor al hashmap
     */
    public static void main(String[] args) {
        HashMap<String,Integer> empIds = new HashMap <> (); //HashMap de key String y value Integer de nombre empIds

        empIds.put("John", 12345); //Agregamos la key John con el valor 12345
        empIds.put("Carl",24123);
        empIds.put("Jerry",98765);
    }
    
}
