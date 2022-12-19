package Pruebas;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		/*
		 * DecimalFormat Mascara=new DecimalFormat("$###,###.##");
		 * System.out.println("La propina que usted dejara es de: "+Mascara.format(tip)+"\n\n");
		 */
		
		//num[i]=(int)(Math.random()*(150-20+1)+20);
		//EL PRIMER NUMERO ES EL MAXIMO, EL SEGUNDO EL MINIMO Y EL TERCERO ES PARA AGREGARLOS
		//TAMBIEN, COPIAR TAL CUAL Y MOVER EL PRIMER, SEGUNDO Y 4TO NUM
		
		
		
		////num[i]=(int)(Math.random()*(80)+10);
		//tambien funciona este ya que el maximo seria 80 y el minimo 10
		
		
		
		
		
		
		
		
		//ORDENAR ARRAYS   IMPORTAR java.util
		/*
		  int arr [] = new int [5];
		int p=1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Ingrese el numero "+p+" del array"); arr[i]=Leer.datoInt();
			p++;
		}
		Arrays.sort(arr);
		System.out.println("ARRAY ORDENADO");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		int arr []= new int [15];
		Arrays.fill(arr,2); //PONEMOS CON LO QUE QUEREMOS QUE SE LLENE EL ARRAY
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String frase="",f="",let="";
		int c=0;
		System.out.println("Ingrese una oracion: ");
		frase=Leer.dato();
		System.out.println("Ingrese la letra a buscar: ");
		let=Leer.dato();
		String [] letra = new String[frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			letra[i]= frase.substring(i,i+1);
			f=letra[i];
			if(f.equals(let)){
				c++;
			}
			
		}
		System.out.println("La letra "+let+" aparecio un total de "+c+ " veces en la oracion");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int t=0,r=0,busc=0,c=0;
		System.out.println("Tamaño del vector");
		t=Leer.datoInt();
		System.out.println("Que numero deseas buscar? (0-9)");
		busc=Leer.datoInt();
		int [] num = new int [t];
		
		for (int i = 0; i < t; i++) {
			r=(int)(Math.random()*10);
			num [i] = r;
			System.out.print(r+" ");
			if(num[i]==busc){
				c++;
			}
		}
		System.out.println();
		System.out.println("El numero "+busc+" aparece un total de "+c+" veces en el vector");
*/
	}

}
