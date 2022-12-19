package Metodos;

public class Par_Impar {

	
	public static void main(String[] args) {
		int x=0;
		System.out.println("Cuantos numeros desea generar?: ");
		int n=Leer.datoInt();
		int num [] = new int [n],pares[]= new int [n],imp[]= new int [n];
		
			for (int i = 0; i < n; i++) {
				num [i]=(int)(Math.random()*10);
			}
		
		x=Copia(num,pares,imp);
		Imprimir(num,pares,imp,x);
		System.out.println(suma(num,pares,imp)); //IMPRIMIMOS LAS SUMAS DE LOS PARES E IMPARES EN MAIN
		
		
		//ImprimeInt(pares);

	}
	
		public static int Copia (int [] num, int[]pares,int[]imp){ //METODO QUE COPIA EL NUMERO A SU RESPECTIVO VECTOR, PAR O IMPAR
			int x=0,y=0;
					for (int i = 0; i < num.length; i++) {
							if(num [i]%2==0){pares[x]=num[i];x++;}
							else {imp[y]=num[i];y++;}
					}
			return x;
		}

		public static void Imprimir (int [] num,int[]pares,int[]imp,int x){//METODO PARA IMPRIMIR EL VECTOR CORRESPONDIENTE
			System.out.println("\nORIGINAL");//MOSTRAMOS VECTOR ORIGINAL
				for (int i = 0; i < num.length; i++) {
					System.out.println("["+num[i]+"] Pos "+i);
				}
				
				System.out.println("\nPARES");//MOSTRAMOS VECTOR DE PARES COMPRIMIDO
				for (int i = 0; i < x; i++) {
					System.out.println("["+pares[i]+"] Pos "+i);
				}
				
				System.out.println("\nIMPARES"); //MOSTRAMOS VECTOR DE IMPARES COMPRIMIDO
				for (int i = 0; i < num.length-x; i++) {
					System.out.println("["+imp[i]+"] Pos "+i);
				}
		 }
	
	public static String suma (int []num,int []pares,int []imp) {
		int sumap=0,sumai=0;
		for (int i = 0; i < num.length; i++) {

			sumap+=pares[i];
			sumai+=imp[i];
		}
		
		String total="\nLa suma de los pares es de "+sumap+" y la suma de los impares es de "+sumai;
		return total;
		
	}
	
	public static void ImprimeInt(int [] V){
		for (int i = 0; i < V.length; i++) {
			if (V[i]>0) {
				System.out.println("["+V[i]+"]"+" POS "+ i);
			}
		}
	}
	
	public static void ImprimeString(String [] V){
		for (int i = 0; i < V.length; i++) {
			if (!V[i].equals("")) {
				System.out.println("["+V[i]+"]"+" POS "+ i);
			}
		}
	}
	
	public static void ImprimeChar(char [] V){
		for (int i = 0; i < V.length; i++) {
			if (V[i]>0) {
				System.out.println("["+V[i]+"]"+" POS "+ i);
			}
		}
	}
	
	
	

	
}
