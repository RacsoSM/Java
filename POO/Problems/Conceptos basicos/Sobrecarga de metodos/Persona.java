public class Persona {
    //Atributos
    String nombre;
    int edad;
    String curp;

    //Metodo constructor 
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //Otro metodo constructor para provocar la sobrecarga
    //Java los diferencia unicamente por su cantidad de parametros
    public Persona (String curp){
        this.curp = curp;
    }



    //Tenemos mas de un metodo correr, por lo que es una sobrecarga, solo la diferenciamos por la cantidad de parametros o el tipo de parametros.
    public void correr (){
        System.out.println("Soy "+nombre+" tengo "+edad+" años y estor corriendo un maraton");
    }
    public void correr (int km){
        System.out.println("He corrido "+km+" kilometros");
    }
}
