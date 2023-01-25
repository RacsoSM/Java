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

      

}
