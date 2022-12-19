package Arreglos;

public class MatrizCuadrada {

	public static void main(String[] args) {
		
		System.out.println("==== USA UNA MATRIZ CUADRADA ====");
		System.out.println("Tamaño de la matriz: ");
		int suma=0,c=0,x=0,j=0;
		int T=Leer.datoInt();
		
		int [][] Mat= new int [T][T]; //CREA MATRIZ DE T*T
		
		for (int Ren = 0; Ren < T; Ren++) { //CUENTA LOS RENGLONES
			
				for (int Col = 0; Col < T; Col++) { //CUENTA LAS COLUMNAS
					
					Mat[Ren][Col]=(int)(Math.random()*10); //GUARDA EL DATO EN LA MATRIZ
					System.out.print(Mat[Ren][Col]+" "); //IMPRIME DATO EN LA POSICION 
					
						
				}
				//MI SOLUCION
				//suma+=Mat[j][j];
				//j++;
				
			System.out.println();
		}
		for (int i = 0; i < T; i++) {  //PROFE
			suma+=Mat[i][i];
		}
		System.out.println("\nSuma de la diagonal: "+suma);
		
		
		System.out.println("\n");
		System.out.println("Diagonal inversa:");
		for (int z = T-1; z >= 0; z--) {  
			
				System.out.print(Mat[x][z]+",");
			x++;
			
		}
	}
}
