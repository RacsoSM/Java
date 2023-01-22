public class Estatico {

    //La palabra static hace que los atributos o metodos no pertenezcan a los objetos si no a la clase, por lo que ya no podriamos llamarlos mediante un objeto pero si mediante el mismo nombre
    //de la clase, ejemplo "Estatico.frase;"
    //Esto causa que cualquier cambio que le hagamos al atributo mediante el objeto, todos los objetos tomen ese valor en ese atributo
    private static String frase = "Primera frase";



  




   public static void main(String[] args) {

    Estatico ob1 = new Estatico();
    Estatico ob2 = new Estatico();


    ob2.frase="Segunda frase";

   

    System.out.println(ob1.frase);
    System.out.println(ob2.frase);
   }
    
}
