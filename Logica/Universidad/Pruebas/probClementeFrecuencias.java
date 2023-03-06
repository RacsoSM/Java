package basic;
import java.util.*;

public class probClementeFrecuencias {
	//crear un programa que pida nombres por teclado, muestre con que frecuencia salieron cada uno
	//los ordene x numero de frecuencia y por alfabeto.

	public static void main(String[] args) {
		int x=0,k=0,contadorDuplicados=0,nombresSinRepetir;
		boolean flag=false;
		
		Scanner sc = new Scanner (System.in);// creamos scanner
	
		String[] arrNombres = new String [5]; //tomamos 5 nombres
		
		
		System.out.println("Ingrese los nombres: ");
		
		for (int i = 0; i < arrNombres.length; i++) { //pedimos los nombres
			System.out.println("Ingrese el nombre numero "+(i+1));
			arrNombres[i]=sc.nextLine();
		}
		
	
		
		//Determinamos cuantas copias hay en el array para asi crear uno de no repetidos con los espacios justos
		for (int i = 0; i < arrNombres.length; i++) {
			
				for (int j = i; j < arrNombres.length; j++) {//se hizo asi el iterador por que queremos que cada vez, se compare solo contra los nombres que no se ha comparado
					//pues se supone que los nombres anteriores al valor de i actual ya fueron detectados y agregados al contador
					
					//si el array en la posicion j es igual al array en la posicion i y aparte i es distinta de j,se le agrega un contador a los duplicados,
					//luego restaremos el total de longitud del array a este contador, ademas rompemos el bucle pues sabemos que ya existe minimamente una copia
					if(arrNombres[j].equalsIgnoreCase(arrNombres[i])&&i!=j){ 
						contadorDuplicados++;
						break;
					}		
				}
		}
		nombresSinRepetir = arrNombres.length-contadorDuplicados; //restamos de la cantidad total de nombres, los duplicados
		System.out.println("NOMBRES SIN REPETIR: "+nombresSinRepetir);
		
		
		
		String[] arrNoRepetidos = new String [nombresSinRepetir]; //creamos el array de nombres no repetidos con el calculo que obtuvimos
				//Creamos el array sin copias o repetidos
				for (int i = 0; i < arrNombres.length; i++) {
					for (int j = 0; j < arrNoRepetidos.length; j++) {
						
						if(arrNoRepetidos[j]==null){ //si la posicion actual del array sin copias es nula, le damos el nombre actual
							arrNoRepetidos[x]=arrNombres[i];
							x++;//añadimos 1 a la posicion del array sin copias
							break;//rompemos el for
						}
						
						if(arrNoRepetidos[j].equalsIgnoreCase(arrNombres[i])){//si en el bucle interno del array sin copias es igual al nombre
							break; //rompemos el for
						}
					}
				}
				
				
				//ponemos las frecuencias a su respectivo array
		int[] arrFrecuencias = new int [nombresSinRepetir];
		
				for (int i = 0; i < arrNoRepetidos.length; i++) {//el bucle grande se repetira el numero de veces de los nombres no repetidos
					//if(arrNoRepetidos[i]==null) contadorDuplicados++;
					
					for (int j = 0; j < arrNombres.length; j++) {//el bucle pequeño se repetira el numero de nombres totales
						
						if(arrNombres[j].equalsIgnoreCase(arrNoRepetidos[i])){//si el nombre actual es igual al nombre no repetido, se
														//le suma uno mas al array de frecuencias, en la posicion i, por que i solo tiene los 
														//nombres NO repetidos, este for dará las vueltas necesarias para hacerlo
							arrFrecuencias[i]++;
						}
					}
					
				}
				
		
		//este for nos muestra el nombre con la frecuencia que salio.
				System.out.println("\n\nNOMBRES Y FRECUENCIAS: ");
		for (int i = 0; i < arrFrecuencias.length; i++) {
			System.out.print("Nombre: "+arrNoRepetidos[i]+ " Frecuencia: ");
			System.out.print(arrFrecuencias[i]);
			System.out.println();
		}
		
		
		
	
		//acomodamos por frecuencias con un metodo burbuja, solo que al momento de cambiar las frecuencias tambien
		//cambiamos la posicion del nombre, nomas copiamos la estructura del burbuja.
		 int auxFrecuencias[]= new int [arrNoRepetidos.length];
		String auxNombres[]= new String [arrNoRepetidos.length];
		

		for(int i=0;i<arrFrecuencias.length;i++){
			
			for(int y=0;y<arrFrecuencias.length-1;y++){
				if(arrFrecuencias[y]>arrFrecuencias[y+1]){
					auxFrecuencias[y]=arrFrecuencias[y];	//sustituimos el metodo burbuja con nuestros valores y cada que se hace un cambio en las frecuencias
					auxNombres[y]=arrNoRepetidos[y];		//tambien cambiamos el nombre para que se vayan juntos
					
					arrFrecuencias[y]=arrFrecuencias[y+1];
					arrNoRepetidos[y]=arrNoRepetidos[y+1];
					
					arrFrecuencias[y+1]=auxFrecuencias[y];
					arrNoRepetidos[y+1]=auxNombres[y];
				}
			}
		}
		
		System.out.println("\n\nNOMBRES Y FRECUENCIAS ORDENADOS POR FRECUENCIA: ");
		for (int i =arrFrecuencias.length-1; i>-1; i--) {	//mostramos los nombres por su frecuencia, el burbuja los acomodo en orden descendente, mostramos al revez
			System.out.print("Frecuencia - "+arrFrecuencias[i]);//con el iterador del for al revez
			System.out.print(" Nombre - "+arrNoRepetidos[i]);
			System.out.println();										
			
		
		}

		
	}

}
