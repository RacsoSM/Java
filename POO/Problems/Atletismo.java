import java.util.Scanner;

/*Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas
 * caracterizados por su numero de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los 
 * datos del atleta ganador de la carrera
*/
public class Atletismo {
    //ATRIBUTOS
    private int numeroAtleta;
    private String nombreAtleta;
    private float tiempoAtleta;



    //METODOS 
    //Constructor con datos
    public Atletismo (int numeroAtleta, String nombreAtleta, float tiempoAtleta){
        this.numeroAtleta = numeroAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempoAtleta = tiempoAtleta;
    }

    //Metodo para obtener el tiempo del atleta
    public float getTiempo(){
        return tiempoAtleta;
    }

    //Metodo para mostrar los datos del ganador
   public String mostrarDatos(){
    return "Nombre del atleta: "+nombreAtleta+"\nNúmero del atleta: "+numeroAtleta+"\nTiempo del atleta: "+tiempoAtleta;
   }

   //Metodo para determinar al ganador de la carrera
   public static int indiceMenorTiempo(Atletismo atletas []){
    int indice =0;
    float tiempo=0;

    tiempo = atletas[0].getTiempo(); //Le damos a tiempo el valor del primer espacio del array del tiempo

    for(int i=1;i<atletas.length;i++){  //for para sacar el menor tiempo del array
        if(atletas[i].getTiempo()<tiempo){   //comparamos el atleta de la posicion i con el que tenemos
            tiempo=atletas[i].getTiempo();  
            indice=i;
        }
    }

    return indice;
   }








      
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroAtleta,cantidadAtletas;
    String nombreAtleta;
    float tiempoAtleta;

    System.out.println("Ingrese la cantidad de atletas: ");
    cantidadAtletas = sc.nextInt();

    //Creamos array de todos los atletas de clase Atletismo
    Atletismo atletas [] = new Atletismo[cantidadAtletas];

    for(int i=0;i<atletas.length;i++){
        
        System.out.println("\n\nIngrese las caracteristicas del atleta "+(i+1));
        System.out.println("Ingrese el numero del atleta ");
        numeroAtleta = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del atleta ");
        nombreAtleta = sc.nextLine();

        System.out.println("Ingrese el tiempo del atleta en segundos");
        tiempoAtleta = sc.nextFloat();
    }



   }
}
