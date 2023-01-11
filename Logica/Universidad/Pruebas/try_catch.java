public class try_catch {
    public static void main(String[] args) {
        
        /*
         El metodo try catch sirve para capturar problemas del lenguaje, se utiliza de la siguiente forma:

         try{
            //sentencias si el programa se ejecuta correctamente
         }catch(tipo de problema a capturar){
            //sentencias si se encuentra el error
         }

         en caso de no encontrarse problemas o errores, solo se ejecutará el metodo try, si se encuentra el problema se ejecutará el metodo catch.
         */

         String cadena ="pedro julian";//dato que nos dará error en el try por lo tanto se ejecutará el catch
         int numero;

         try{
            numero=Integer.parseInt(cadena); //ERROR DE TIPO NumberFormatException, lo podemos ver ejecutando el programa
            System.out.println("Dato convertido: "+numero);
         }catch(NumberFormatException e){
            System.out.println("No es un numero, es una cadena");
         }

       /*Para identificar el tipo de error que podemos tener, el programa al ejecutarlo nos lo dice
        * en un texto tipo main error in : "nombre del errror", ese es el que meteremos en el catch
        */



    }
}
