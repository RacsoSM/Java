package Metodos;
import Pruebas.Leer;
import java.util.Scanner;
//SANTACRUZ MALDONADO OSCAR SAID
public class Burbuja {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int v=0,suma=0,prom=0;
		System.out.println("Defina el tamaño del vector: ");
		v=sc.nextInt();
		int vec[]= new int [v];
		
		for (int i = 0; i < vec.length; i++) {
			vec[i]=(int)(Math.random()*(99-10+1)+10);
		}
		System.out.println("\n===============VECTOR ORIGINAL================");
		imprime.ImprimeInt(vec);
		System.out.println("\n\n=============VECTOR ORDENADO================");
		bubble(vec);
		imprime.ImprimeInt(vec);
		/*burbuja(vec);
		
		imprime.ImprimeInt(vec);*/



		suma=suma(vec);
		System.out.println("\nLa suma del vector es de: "+suma);
		
		prom=promedio(vec,suma);
		System.out.println("\nEl promedio del vector es de: "+prom);
		
		copiarmay(vec,prom);
	}
	
	
	public static void burbuja (int [] vec){ //METODO QUE ORDENA
		int aux[]= new int [vec.length];
		int x=0;
		boolean c=false;
	
			while(c==false){
				x=0;
				for (int p = 0; p < vec.length-1; p++) {
						if(vec[p]<vec[p+1]){
							aux[p]=vec[p];
							vec[p]=vec[p+1];
							vec[p+1]=aux[p];	
						}
						else x++;
				}
				if(x==vec.length-1) c=true;	
			}	
	}
	
	public static void bubble (int [] vec){ //METODO QUE ORDENA
		int aux[]= new int [vec.length];
	

		for(int i=0;i<vec.length;i++){
			
			for(int y=0;y<vec.length-1;y++){
				if(vec[y]>vec[y+1]){
					aux[y]=vec[y];
					vec[y]=vec[y+1];
					vec[y+1]=aux[y];
				}
			}
		}
	
	
		
				
	}
	
	
	public static int suma (int [] vec){ //METODO QUE SUMA
		int suma=0;
		for (int i = 0; i < vec.length; i++) {
			suma+=vec[i];
		}
		return suma;
	}
	
	
	public static int promedio (int [] vec, int suma){ //METODO QUE PROMEDIA
		int prom=0;
		prom=suma/vec.length;
		return prom;
	}
	
	
	public static void copiarmay (int [] vec, int prom){ //METODO QUE COPIA LOS MAYORES A OTRO VECTOR
	int [] copia = new int [vec.length];
	int x=0;
	for (int i = 0; i < vec.length; i++) {
		if(vec[i]>prom){
			copia[x]=vec[i];
			x++;
		}
	}
	System.out.println("\nLos numeros mayores al promedio son: ");
	imprime.ImprimeInt(copia);
	}
}
