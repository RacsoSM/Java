public class c1 {
    
    private int edad;
    private String nombre;
    /*El encapsulamiento es, cuando tenemos un atributo private poderlo modificar mediante estos metodos accesores para que no se puedan modificar por ninguna otra clase que no sean
     * las mismas de la clase original.
     */


    //Metodo setter: establecemos la edad.
    public void setEdad(int edad){
        this.edad=edad;
    }

    //Metodo getter: mostramos la edad.
    public int getEdad(){
        return edad;
    }


    public void setNombre(String nombre){
        this.nombre=nombre;
    }
   
    public String getNombre(){
        return nombre;
    }
}
