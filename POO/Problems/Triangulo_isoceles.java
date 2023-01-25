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

    public static int maxArea (double [] areas){ //Metodo para sacar el area maxima de los triangulos
        int index = 0;
        double max = 0;

        for(int i=0;i<areas.length;i++){
            if(areas[i]>max){       //comparamos el area del triangulo con el maximo hasta el momento
                max=areas[i];
                index=i;    //guardamos el index
            }
        }
        return index;       //retornamos el index
    }



     
   
}
