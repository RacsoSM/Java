import java.util.Scanner;

public class Operador_Ternario {
    public static void main(String[] args) {
        
        //este operador es un if else mas simplificado, si el valor de la condición
        //es verdadero, toma el valor 1, en caso contrario, toma el valor 2.


        //SINTAXIS:
        //valor = (condicion) ? valor1 : valor 2;


        //Usar operador ternario para comprobar si un numero es par o no.

        Scanner sc = new Scanner (System.in);
        int numero=0;
        String mensaje ="";

        System.out.println("Ingrese un numero: "); numero=sc.nextInt();

        mensaje = (numero%2==0) ? "Es par" : "Es impar";
        //Si la condicion es true, toma el primer valor y si es false, toma el segundo valor

        System.out.println(mensaje);
    }   
    
}
