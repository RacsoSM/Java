import javax.swing.JOptionPane;

/*Construir un programa que calcule el area y el perimetro de un cuadrilatero dada la longitud de sus dos lados
 * Los valores de la longitud deberán leerse del usuario. Si es un cuadrado, solo se proporcionara la longitud 
 * de uno de sus lados al constructor.
 */

public class Cuadrilatero {
    //Atributos
    private float lado1;
    private float lado2;

    //Metodos

    //Constructor para cuando NO es un cuadrado
    public Cuadrilatero (float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Constructor para cuando SI es un cuadrado
    public Cuadrilatero (float lado1){
        this.lado1 = this.lado2 = lado1;
    }

    //Metodo para obtener el area del cuadrilatero/cuadrado
    public float getArea (){
        float area = lado1*lado2;
        return area;
    }

    //Metodo para obtener el perimetro del cuadrilatero/cuadrado
    public float getPerimetro(){
        float perimetro = 2*(lado1+lado2);
        return perimetro;
    }


    public static void main(String[] args) {
        //Declaramos c1 de tipo Cuadrilatero pero aun no llamamos al constructor
        Cuadrilatero c1;
        float lado1,lado2;


        //Pedimos el valor de los lados mediante el JOptionPane
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado 1: "));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del lado 2: "));


        //Comparamos si el lado1 es igual al lado2, si es true, llamamos al constructor del cuadrado, caso contrario al del cuadrilatero
        //esto se pudo hacer con un if else pero asi se optimiza mas
       c1 = (lado1==lado2) ? new Cuadrilatero (lado1) : new Cuadrilatero(lado1, lado2);
        
       //Mostramos el area
       System.out.println("El area es: "+c1.getArea());
       //Mostramos el perimetro
       System.out.println("El perimetro es: "+c1.getPerimetro());
    }
}
