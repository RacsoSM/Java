public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    /*protected String nombre;
    protected String apellido;
    protected int edad;*/
    //protected es un modificador de acceso que sirve para que los atributos puedan ser accedidos tanto por la clase como por los hijos de esta

    //Metodos
    //Constructor
    Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //getter de nombre
    public String getNombre (){
        return nombre;
    }

    //getter de apellido 
    public String getApellido (){
        return apellido;
    }

    //getter de edad
    public int getEdad (){
        return edad;
    }

}

