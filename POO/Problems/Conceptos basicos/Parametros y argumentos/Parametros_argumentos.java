import javax.swing.JOptionPane;

public class Parametros_argumentos {
    //Parametros: es una declaracion de variable u objeto
    //Argumentos: es un valor que se envia


    /*Declaracion de metodo:  
     public void metodo (int a, String b){ //PARAMETRO
        //lineas de codigo
    } 
    //Invocacion de metodo:
    objeto.metodo(1,"Hola"); //ARGUMENTO
    */


    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        Operacion op = new Operacion(); //El objeto se crea con el nombre de la clase de la cual declaramos los atributos que en este caso es operacion.

        System.out.println("El resultado de la suma es: "+ op.sumar(n1,n2));
        System.out.println("El resultado de la resta es: "+ op.restar(n1,n2));
        System.out.println("El resultado de la multiplicacion es: "+ op.multiplicar(n1,n2));
        System.out.println("El resultado de la division es: "+ op.dividir(n1,n2));
        
       
       

       
    }
}

