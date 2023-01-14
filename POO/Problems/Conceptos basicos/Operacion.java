import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
        int num1,num2,suma,resta,multiplicacion,division;


    //Metodos

    //Metodo para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }

    //Metodo para sumar ambos numeros
    public void sumar(){
        suma = numero1+numero2;
    }

    //Metodo para restar ambos numeros
    public void restar(){
        resta = numero1-numero2;
    }

    //Metodo para multiplicar ambos numeros
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }

    
    //Metodo para dividir ambos numeros
    public void dividir(){
    division = numero1/numero2;
    }


    
}
