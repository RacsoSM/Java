public class Estudiante extends Persona{//Con extends y el nombre de la clase le decimos a java que estudiante hereda todo de persona
    
    //Agregamos los atributos unicos de estudiante que persona NO tiene
   private int codigoEstudiante;
   private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante,float notaFinal){
        super(nombre, apellido, edad); //Con esta linea le decimos a java que nombre, apellido y edad ya estan inicializados dentro de Persona
    }
    
}
