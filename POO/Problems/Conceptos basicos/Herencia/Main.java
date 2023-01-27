public class Main {
   public static void main(String[] args) {
    Estudiante estudiante = new Estudiante("Oscarino", "Santander",18, 22170820, 91.80); //Creamos el objeto y lo llenamos de sus datos

    estudiante.mostrarDatos();//Mostramos todos los datos del estudiante.
   }
    

    

}
/*La herencia es como su nombre lo indica, heredar atributos y metodos de una clase ya hecha en una nueva, esto
 * para ahorrarnos codigo
 * 
 * extends es la palabra con la que le indicamos a java que una clase es hija de otra
 * 
 * super es la palabra con la que le indicamos al constructor de la clase hija que atributos esta heredando de la clase padre
 */