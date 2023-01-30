import javax.swing.JOptionPane;
import java.lang.Math.*;
public class calcv1 {

    private double n1;
    private double n2;
    private double n3;

    public calcv1 (double n1, double n2){
        this.n1=n1;
        this.n2=n2;
    }
    public calcv1 (double n3){
        this.n3=n3;
    }

    public void suma (double n1, double n2){
        double suma=n1+n2;
        javax.swing.JOptionPane.showMessageDialog(null, "La suma es "+suma); 
    }

    public void resta (double n1, double n2){
        double resta=n1-n2;
        javax.swing.JOptionPane.showMessageDialog(null, "La resta es "+resta); 
    }

    public void multiplicacion (double n1, double n2){
        double multiplicacion=n1*n2;
        javax.swing.JOptionPane.showMessageDialog(null, "La multiplicacion es "+multiplicacion); 
    }

    public void division (double n1, double n2){
        double division=n1/n2;
        javax.swing.JOptionPane.showMessageDialog(null, "La division es "+division); 
    }

    public void numCuadrado (double n3){
        double numCuad = n3*n3;
        javax.swing.JOptionPane.showMessageDialog(null, "El numero al cuadrado es "+numCuad); 
    }

    public void numCubo (double n3){
        double numCubo = n3*n3*n3;
        javax.swing.JOptionPane.showMessageDialog(null, "El numero al cubo es "+numCubo); 
    }

    public void raizCuadrado (double n3){
        double raizCuad = Math.sqrt( n3 );
        javax.swing.JOptionPane.showMessageDialog(null, "La raiz del numero es "+raizCuad); 
    }

    


    public static void main(String[] args) {
        calcv1 ob1;
        double n1=0,n2=0,n3=0;

        int option = Integer.parseInt(javax.swing.JOptionPane.showInputDialog( " Ingrese que desea hacer:\n 1.- Suma (+)\n 2.- Resta (-)\n 3.- Multiplicacion (*)\n 4.- Division (/)\n5.-Numero al cuadrado (x²)\n 6.-Numero al cubo (x³)\n 7.-Raiz cuadrada (√x)")); 
        
        if(option>4){
             n3 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( "Digite el numero: ")); //LEER UN DOUBLE
             ob1 = new calcv1(n3);
        }
        else{
             n1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( "Digite el primer numero: ")); //LEER UN DOUBLE
             n2 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog( "Digite el segundo numero: ")); //LEER UN DOUBLE
             ob1 = new calcv1(n1, n2);
        }

        switch(option){
            case 1: ob1.suma(n1, n2); break;
            case 2: ob1.resta(n1, n2); break;
            case 3: ob1.multiplicacion(n1, n2); break;
            case 4: ob1.division(n1, n2); break;
            case 5: ob1.numCuadrado(n3); break;
            case 6: ob1.numCubo(n3); break;
            case 7: ob1.raizCuadrado(n3); break;
            default: System.out.println("EL NUMERO QUE USTED INGRESO NO ES VALIDO");
        }
      



    }
}
