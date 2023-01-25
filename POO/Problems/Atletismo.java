/*Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas
 * caracterizados por su numero de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los 
 * datos del atleta ganador de la carrera
*/
public class Atletismo {
    //Atributos de la clase
    private int numeroAtleta;
    private String nombreAtleta;
    private float tiempoAtleta;

    //Constructor con datos
    public Atletismo (int numeroAtleta, String nombreAtleta, float tiempoAtleta){
        this.numeroAtleta = numeroAtleta;
        this.nombreAtleta = nombreAtleta;
        this.tiempoAtleta = tiempoAtleta;
    }

}
