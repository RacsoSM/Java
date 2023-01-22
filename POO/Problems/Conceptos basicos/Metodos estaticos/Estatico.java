public class Estatico {

    //La palabra static hace que los atributos o metodos no pertenezcan a los objetos si no a la clase, por lo que ya no podriamos llamarlos mediante un objeto pero si mediante el mismo nombre
    //de la clase, ejemplo "Estatico.frase;"
    //Esto causa que cualquier cambio que le hagamos al atributo mediante el objeto, todos los objetos tomen ese valor en ese atributo
    private static String frase = "Primera frase";


    //final es una palabra que hace que un atributo se vuelva constante. 
    /* private final String nombre;
     * esa linea hace que despues de que le demos un valor a nombre, no se pueda cambiar por lo que se vuelve una constante y no una variable, no lo podremos cambiar ni con un metodo setter
     */

    //Como este metodo es static, lo tendremos que llamar de la siguiente manera: Estatico.sumarNumeros(parametro1,parametro2);
    public static int sumarNumeros (int n1,int n2){
        int suma = n1+n2;
        return suma;
    }



   public static void main(String[] args) {

    //Creamos 2 objetos de tipo Estatico
    Estatico ob1 = new Estatico();
    Estatico ob2 = new Estatico();

    //Llamamos al metodo sumarNumeros
    System.out.println("La suma es: "+Estatico.sumarNumeros(3, 4));

    //Mostramos la frase desde la clase, ya que ahora le pertenece a esta y no a los objetos por el static
    System.out.println(Estatico.frase);

    //Al cambiar en cualquier objeto el atributo frase, todos los objetos lo tomaran como su valor
    ob2.frase="Segunda frase";

    System.out.println(ob1.frase);
    System.out.println(ob2.frase);
   }
    
}
