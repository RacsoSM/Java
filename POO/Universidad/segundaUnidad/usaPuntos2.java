package segundaUnidad;
import java.util.*;

public class usaPuntos2 {

	public static void main(String[] args) {
		int x,y,k=0;
		
		Scanner sc = new Scanner (System.in); //declaramos el scanner para leer datos
		Punto [] arrayPuntos = new Punto [10]; //creamos el array de puntos
		
		
		for (int i = 0; i < arrayPuntos.length; i++) {
			System.out.print("Ingrese el valor x del punto "+(i+1)+": ");//pedimos datos
			x=sc.nextInt();
			System.out.print("Ingrese el valor y del punto "+(i+1)+": ");
			y=sc.nextInt();
			
			arrayPuntos[i] = new Punto (x,y); //creamos el objeto en el array de puntos
			System.out.println();
		}
		

		System.out.println(Arrays.toString(arrayPuntos)); //nos muestra las REFERENCIAS de el objeto en cada posicion (Object)
		
		for (int i = 0; i < arrayPuntos.length; i++) {
			System.out.print(arrayPuntos[i].toString(k));//nos muestra lo que establecimos en el toString de la clase Punto(Punto)
		}

		System.out.println("\nEl total de puntos es: "+Punto.getTotalPuntos()); //muestra el total de puntos con el metodo estatico
		
		
	}
	/*Este resultado sucede ya que en la línea 24 estamos llamando al método toString de Object, por lo que imprime las referencias,
	 al nosotros agregarle un parámetro en el método toString de la clase Punto, lo estamos sobrecargando y debemos colocarlo
	 de forma explícita para poder utilizarlo, en el for de la línea 27, eso es lo que hacemos por lo cual, en la ejecución
	 podemos ver que se imprimen las referencias de los objetos (línea 24) y justo abajo se imprimen los valores que 
	 definimos en el método toString de la clase Punto (línea 27). */

}
