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

        Operacion op = new Operacion();

       
    }
}

