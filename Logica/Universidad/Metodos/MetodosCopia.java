package Metodos;

public class MetodosCopia {

	public static void main(String[] args) {
int tot,w;
		System.out.println("Cuantos numeros desea generar?: ");
		int n=Leer.datoInt();
		int num [] = new int [n];
		
			for (int i = 0; i < n; i++) {
				num [i]=(int)(Math.random()*(80-10+1)+10);
			}
			imprime.ImprimeInt(num); //METODO DE OTRA CLASE PARA IMPRIMIR VECTORES
			w=Elimina(num); // METODO QUE ELIMINA NUMEROS DUPLICADOS
			tot=num.length-w; //CALCULO PARA NUMEROS QUE NO SE REPITEN
			
			System.out.println("Los numeros que NO se repiten son "+tot);
			
	}
	
	public static int Elimina (int[]num) {
		int copia[]=new int[num.length];
	int y=0,x=0,w=0;
	boolean al;
		for (int i = 0; i < num.length; i++) {
			al=false; y=0;
					while(al==false && y<x){
							if(num[i] == copia[y]){
								al=true;
								w++;
							}
							y++;				
					}
				if(al==false){
				copia[x]=num[i];
				x++;
				}
		}

		System.out.println("\nVECTOR SIN DUPLICADOS");
		imprime.ImprimeInt(copia);//METODO DE OTRA CLASE PARA IMPRIMIR VECTORES
		
		return w;
	}
	
}
