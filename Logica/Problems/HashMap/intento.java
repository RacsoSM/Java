import java.util.*;


public class intento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //declaramos scanner
        String nombres[] = new String[10];  //declaramos el array de los nombres (aqui le puse 10 pa no batallar pero deberia de ser 20)

        Map<String, Integer> frecuencia = new HashMap<>();  //declaramos un mapa q nos dirá la frecuencia de cada nombre

        for (int i = 0; i < nombres.length; i++) {      //pedimos todos los nombres
            System.out.println("Dame el nombre numero " + (i + 1));
            nombres[i] = sc.nextLine();
        }

        for (String nombre : nombres) { //recorremos el mapa
            int anterior = 0;   //reiniciamos el iterador de anterior cada vuelta
            // obtener el conteo anterior
            if (frecuencia.get(nombre) != null) {   //obtenemos el conteo de las frecuencias q lleva cada nombre y lo guardamos en anterior (solo si el valor es diferente a null)
                anterior = frecuencia.get(nombre);      //asignamos a anterior la frecuencia q lleva cada nombre
            }
            frecuencia.put(nombre, anterior + 1);   //agregamos al mapa el nombre de la persona y el valor anterior +1 ya que tiene una frecuencia mas que la ves pasada pq acaba de aparecer

        }

        Integer[] frecuenciasAltas = frecuencia.values().toArray(new Integer[0]);   //convertimos todas las frecuencias a un array de integer llamado frecuenciasAltas
        Arrays.sort(frecuenciasAltas, Collections.reverseOrder());  //lo ordenamos para q queden las frecuencias mas altas x delante
        //el problema aqui es que no se como vincular los nombres con las frecuencias :(
        
       
        

        

        TreeMap<String, Integer> frecuenciaOrdenada = new TreeMap<>(); //para mostrar los nombres ordenados x alfabeto, si conviertes el mapa en un tree map, lo hace solo, asi q eso hacemos aqui

        frecuenciaOrdenada.putAll(frecuencia);  //le pasamos todas las frecuencias q tenia el mapa

        System.out.println("ordenado de forma ascendente ");
        for (String key : frecuenciaOrdenada.keySet()) {    //mostramos el valor de este tree map con un for iterador
            System.out.println("Nombre: " + key + "\t\t Frecuencia: " + frecuenciaOrdenada.get(key));   //imprimimos la key (nombre de la persona ) y el valor (frecuencia de esa persona)
        }

       
   
       

        System.out.println("las frecuencias y nombres son: ");
        System.out.println(frecuencia); //esta linea muestra el valor actual del mapa, te dirá quien tiene cuanta cosa pero no se como ordenarlo x valores

    }

}
