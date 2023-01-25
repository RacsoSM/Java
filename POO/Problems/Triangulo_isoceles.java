/*Diseñar un programa para trabajar con triangulos isosceles. Para ello defina los atributos necesarios que se requieren
 * , proporcione metodos de consulta, un metodo constructor e implemente metodos para calcular el perimetro y el area de un 
 * triangulo ademas implementar un metodo que a partir de un arreglo de triangulos devuelva el area del triangulo de mayor 
 * superficie.
 */
import java.util.Scanner;
import java.lang.Math;

public class Triangulo_isoceles {
  //Atributos
  private double base;
  private double lado;

    //Metodo constructor
    public Triangulo_isoceles(double base, double lado){
        this.base = base;
        this.lado = lado;
    }

    public double calcularPerimetro(){
        double perimetro=0;
        perimetro = base + (2*lado);
        return perimetro;
    }

    public double calcularArea(){
       double area = 0;              //Calcular area del triangulo, formula b* raiz de a cuadrada-b cuadrada / 4 y todo /2
       area=(base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
        return area;
    }


     
   
}
