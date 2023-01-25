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



    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double base=0,lado=0,perimetro=0,area=0;
        int numeroTriangulos;

        System.out.println("Ingrese la cantidad de triangulos: "); //Pedimos la cantidad de triangulos
        numeroTriangulos = sc.nextInt();

        Triangulo_isoceles triangulos[] = new Triangulo_isoceles [numeroTriangulos];    //creamos un array de la clase triangulos del tamaño que nos dijo el usuario
        double areas [] = new double [numeroTriangulos];                                //creamos otro array de puras areas



        
        for(int i=0;i<triangulos.length;i++){
            System.out.println("\nIngrese las caracteristicas del triangulo "+(i+1)); //Pedimos las caracteristicas del objeto al usuario
            System.out.print("\nBase del triangulo: ");
            base = sc.nextDouble();

            System.out.print("Lado del triangulo: ");
            lado = sc.nextDouble();

            triangulos[i] = new Triangulo_isoceles(base, lado); //Guardamos los datos en el objeto segun su posicion en el array

           
           perimetro = triangulos[i].calcularPerimetro();   
           area = triangulos[i].calcularArea();

           areas[i]=area;   //guardamos las areas de todos los triangulos en otro array

           System.out.println("\nEl perimetro es: "+perimetro);
           System.out.println("El area es: "+area);

          
            
        }

        
        System.out.println("\n\nEl area maxima es: "+areas[Triangulo_isoceles.maxArea(areas)]); //Llamamos al array de areas en la posicion del indice del mayor area.
        


    }




     
   
}
