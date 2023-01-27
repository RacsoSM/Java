public class Estudiante extends Persona{//Con extends y el nombre de la clase le decimos a java que estudiante hereda todo de persona
    
    //Agregamos los atributos unicos de estudiante que persona NO tiene
   private int codigoEstudiante;
   private double notaFinal;


   //Constructor de una clase hija, ponemos de parametros los atributos que heredó y tambien los propios
   //Los heredados no los debemos inicializar de nuevo, por lo cual ponemos super y dichos atributos
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante,double notaFinal){
        super(nombre, apellido, edad); //Con esta linea le decimos a java que nombre, apellido y edad ya estan inicializados dentro de Persona
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    //Mostrando todos los datos del estudiante
    public void mostrarDatos(){
        System.out.println("Mostrando los datos del estudiante: ");
        System.out.println("Nombre: "+getNombre()+  //se usan los getters por que los atributos estan encapsulados
            "\nApellido: "+getApellido()+
            "\nEdad: "+getEdad()+
            "\nCodigo de estudiante: "+codigoEstudiante+    //estos atributos ya no estan encapsulados
            "\nNota final: "+notaFinal);
    }
    
}
