/*Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y actualice su posicion
 * dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA Y DERECHA. Tras cada movimiento el programa
 * mostrará la nueva dirección elegida y las coordenadas de situacion del objeto dentro del tablero
 */
import java.util.Scanner;

public class Movimiento_tablero {
    //ATRIBUTOS
    private int x = 4;
    private int y = 4;

    //METODOS
    public int moveUp (){
        if(y>0 && y<9)     y--;
        else               y=8;
        return y;
    }

    public int moveDown (){
        if(y>0 && y<9) y++;
        else           y=1;
        return y;
    }

    public int moveLeft (){
        if(x>0 && x<9) x--;
        else           x=8;
        return x;
    }

    public int moveRight (){
        if(x>0 && x<8) x++;
        else           x=1;
        return x;
    }

    
    public static void main(String[] args) {
        Movimiento_tablero ob = new Movimiento_tablero();//Declaramos el objeto de la clase Movimiento_tablero

        int tablero [][] = new int [9][9];
        Scanner sc = new Scanner(System.in);
        char move=0;
        System.out.println("S = ABAJO  ");
        System.out.println("A = IZQUIERDA  ");
        System.out.println("D = DERECHA ");
        System.out.println("X = SALIR ");

        do{
         
            System.out.print("Ingrese su siguiente movimiento:  ");
            move= sc.next().charAt(0); //Leemos el char que ingrese el usuario

            System.out.print("\033[H\033[2J");  //Con estas dos lineas limpiamos la pantalla
            System.out.flush();  

            System.out.println("\n\n\nW = ARRIBA  "); //Dando indicaciones de que hara cada letra
            System.out.println("S = ABAJO  ");
            System.out.println("A = IZQUIERDA  ");
            System.out.println("D = DERECHA ");
            System.out.println("X = SALIR ");
    
           switch(move){    //Detectamos que hacer en caso de que el usuario toque que letra
            case 'w' :  ob.moveUp(); //Restamos una unidad en y
                        System.out.println("Usted se ha movido hacia ARRIBA");
                        break; 
            case 's' :  ob.moveDown();//Sumamos una unidad en y
                        System.out.println("Usted se ha movido hacia ABAJO");
                        break; 
            case 'a' :  ob.moveLeft();//Restamos una unidad en x
                        System.out.println("Usted se ha movido hacia la IZQUIERDA");
                        break;
            case 'd' :  ob.moveRight();//Sumamos una unidad en x
                        System.out.println("Usted se ha movido hacia la IZQUIERDA");
                        break;
            case 'x' : System.out.println("Usted ha salido con exito, gracias por jugar :)");
                                             System.exit(0); break;
            default : System.out.println("\nE R R O R");
           }


            //MOSTRAR TABLERO
        //Mostramos el tablero con la posicion graficamente
        for(int i=0;i<9;i++){
            for(int y=0;y<9;y++){
                if(y==ob.x && i==ob.y){ //Si la posicion es igual a la posicion en la que va el bucle, mostramos una O que es nuestro objeto, caso contrario una X que son las casillas
                    System.out.print("O ");
                }
                else{
                    System.out.print("T ");
                }
            }
            System.out.println();
        }
           System.out.println("\nTu posicion actual es: "+ob.x+","+ob.y); //Mostramos las coordenadas actuales que son atributos del objeto

        }while(move != 'x'); //Repetimos este proceso hasta que el usuario quiera salir 
    }
}
