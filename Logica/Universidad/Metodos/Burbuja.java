package Metodos;
//SANTACRUZ MALDONADO OSCAR SAID
public class Burbuja {

	public static void main(String[] args) {
		int v=0,suma=0,prom=0;
		System.out.println("Defina el tamaño del vector: ");
		v=Leer.datoInt();
		int vec[]= new int [v];
		
		for (int i = 0; i < vec.length; i++) {
			vec[i]=(int)(Math.random()*(99-10+1)+10);
		}
		System.out.println("\n=================VECTOR ORIGINAL================");
		imprime.ImprimeInt(vec); //METODO REUTILIZADO DE OTRO PROGRAMA QUE IMPRIME VECTORES INT
		burbuja(vec);
		System.out.println("\n=================VECTOR ORDENADO================");
		imprime.ImprimeInt(vec); //METODO REUTILIZADO DE OTRO PROGRAMA QUE IMPRIME VECTORES INT
		
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
	imprime.ImprimeInt(copia);//METODO REUTILIZADO DE OTRO PROGRAMA QUE IMPRIME VECTORES INT

	}
}
