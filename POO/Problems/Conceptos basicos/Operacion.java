import javax.swing.JOptionPane;

public class Operacion {


    //Metodos

    //Metodo para pedirle al usuario que nos digite 2 numeros
    public void leerNumeros(){
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
    }

    //Metodo para sumar ambos numeros
    public int sumar(int num1, int num2){ //Ya estamos usando parametros
       int suma = num1+num2;
       return suma;
    }

    //Metodo para restar ambos numeros
    public int restar(int num1, int num2){
        int resta = num1-num2;
        return resta;
    }

    //Metodo para multiplicar ambos numeros
    public int multiplicar(int num1, int num2){
        int multiplicacion = num1*num2;
        return multiplicacion;
    }

    
    //Metodo para dividir ambos numeros
    public int dividir(int num1, int num2){
        
    int division =  num1/num2 ;
    return dividir;
    }

    //Metodo para mostrar resultados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }


    
}
