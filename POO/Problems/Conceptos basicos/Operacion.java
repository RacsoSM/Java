import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
        int num1,num2,suma,resta,multiplicacion,division;


    //Metodos

    //Metodo para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros(){
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }

    //Metodo para sumar ambos numeros
    public void sumar(){
        suma = num1+num2;
    }

    //Metodo para restar ambos numeros
    public void restar(){
        resta = num1-num2;
    }

    //Metodo para multiplicar ambos numeros
    public void multiplicar(){
        multiplicacion = num1*num2;
    }

    
    //Metodo para dividir ambos numeros
    public void dividir(){
        
    division =  num1/num2 ;
    }

    //Metodo para mostrar resultados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }


    
}
