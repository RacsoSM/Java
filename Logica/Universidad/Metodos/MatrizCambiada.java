package Metodos;

public class MatrizCambiada {

	public static void main(String[] args) {
		int n=0,m=0,x=0;
		System.out.println("Ingrese los renglones de la matriz: ");
		n=Leer.datoInt();
		System.out.println("Ingrese las columnas de la matriz: ");
		m=Leer.datoInt();
		int [][] matriz= new int [n][m];
		int [][] aux= new int [m][n];
		for (int Ren = 0; Ren < n; Ren++) { //CUENTA LOS RENGLONES
			for (int Col = 0; Col < m; Col++) { //CUENTA LAS COLUMNAS
				matriz[Ren][Col]=(int)(Math.random()*10); //GUARDA EL DATO EN LA MATRIZ		
			}
		}
		ImpMatriz(matriz,n,m);
		Traspuesta(matriz,aux,n,m);
		CambiarElemento(aux);
		x=SumaOrilla(aux,n,m);
		
		System.out.println("La suma de las orillas es de: "+x);
	}
	
	
	public static void ImpMatriz(int [][] matriz,int n, int m){
		System.out.println("\n\nMATRIZ ORIGINAL");
		for (int Ren = 0; Ren < n; Ren++) { //CUENTA LOS RENGLONES
			for (int Col = 0; Col < m; Col++) { //CUENTA LAS COLUMNAS
				System.out.print(matriz[Ren][Col]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void Traspuesta(int [][] matriz,int [][] aux, int n, int m){
		System.out.println("\n\nMATRIZ TRASPUESTA");
		for (int Ren = 0; Ren < m; Ren++) {
			for (int Col = 0; Col < n; Col++) { 
				aux[Ren][Col]= matriz[Col][Ren];
				System.out.print(aux[Ren][Col]+" ");
			}
			System.out.println();
		}
	}
	
	public static void CambiarElemento(int[][]aux){
		int R=0,C=0,dato=0;
		System.out.println("\n\n¿Que coordenada desea cambiar?: ");
		System.out.print("R: ");R=Leer.datoInt();
		System.out.print("C: ");C=Leer.datoInt();
		System.out.println("¿Que dato desea colocar?: "); dato=Leer.datoInt();
		aux[R][C]=dato;
	}
	
	public static int SumaOrilla(int[][]aux,int n, int m){
		int suma=0;
		
		for (int Ren = 0; Ren < m; Ren++) {
				for (int Col = 0; Col < n; Col++) { 
					if(Ren==m-1 || Ren ==0){
						suma=suma+aux[Ren][Col];
					}
					if((Col==0 || Col == n-1 ) && (Ren !=0 && Ren != m-1)){
						suma=suma+aux[Ren][Col];
					}	
				}
		}
		return suma;
	}

}
