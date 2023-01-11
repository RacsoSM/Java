package Pruebas;
import java.text.DecimalFormat;
import Basico.Leer;
import java.util.Arrays;

public class prueba {

	public static void main(String[] args) {
	
		int arr [] = { 10,11,12,13,14,15,16,17,18,19};
		int num = 5;

		for(int i=num;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		
		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]);
		}


		/*
		DESPLAZAR EL ARRAY UNA POSICION HACIA ABAJO DE MODO QUE EL PRIMER ELEMENTO PASA A SER EL SEGUNDO,
		EL SEGUNDO AL TERCERO Y ASI SUCESIVAMENTE, EL ULTIMO PASA A SER EL PRIMERO
		
		int arr [] = { 10,11,12,13,14,15,16,17,18,19};
		int k = arr[arr.length-1];
		for(int i=arr.length-2;i>-1;i--){
			arr[i+1]=arr[i];

		}
		arr[0]=k;
		for(int i:arr){
			System.out.println(i);
		}*/











		/*











		 * DecimalFormat Mascara=new DecimalFormat("$###,###.##");
		 * System.out.println("La propina que usted dejara es de: "+Mascara.format(tip)+"\n\n");
		 */
		
		/*COMPARAR DOS CARACTERES O CADENAS
		 * EQUALS IGNORE CASE
		 * String SN=("");
		 * 
		 * SN.equalsIgnoreCase("S")
		 * 
		 */
		
		/* DECIMAL FORMAT 
	
		double z=55,a=250;
		z=55*0.08;
		
		DecimalFormat df = new DecimalFormat("###,###.00"); // los ceros son los decimales a mostrar
		
		System.out.println("El numero es "+df.format(z));
		 */
		
		
		
		/*MOSTRAR CONTENIDO DEL ARRAY
		String [] array = {"Javier", "Luis", "Lucas", "Jose", "Ana"};
		
		
		System.out.println("Mostrar todos los elementos del array con for:");
		
		for (int i = 0; i<array.length;i++){
			System.out.println(" "+ i +" "+ array[i]);
		}
		
		System.out.println("\n\n\n");
		System.out.println("Mostrar los elementos del array con metodo toString"+"\n"+ Arrays.toString(array)); //solo con java.util.arrays
		*/
		
		
		
		
		/*PROBANDO ARRAYS
		 String array[];
		array= new String [3];
		array[0] = "banana";
		array[1] = "manzana";
		array[2] = "pera";
		
		
		
		System.out.println("El valor fue "+array[2]);
		System.out.println("El valor fue "+array[1]);
		System.out.println("El valor fue "+array[0]);
		*/
		
		
		
		
		
		
		
		
		/*PROBANDO ARRAYS
		 int array[];
		array = new int [3];
		array[0] = 2;
		array[1] = 8;
		array[2] = 1;
		
		System.out.println("El valor fue "+array[2]);
		System.out.println("El valor fue "+array[1]);
		System.out.println("El valor fue "+array[0]);
		
		*/
	}

}
