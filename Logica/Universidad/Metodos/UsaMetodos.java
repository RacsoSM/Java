package Metodos;

public class UsaMetodos {

		public static void main(String[] args) {
			
			System.out.println("========= USANDO METODOS ==========");
			String frase="",x="";
			System.out.println("Ingresa una frase"); frase=Leer.dato();
			x=imprime.Reemplaza(frase);
			System.out.println(x);
			
			System.out.println("Tamaño del vector: ");
			int N=Leer.datoInt();
			int Num [] = new int [N];
			int Cuenta=0;
		
			
			GeneraVector(Num,N);
			ImprimeVec(Num);
			Cuenta=CuentaPar(Num);
			System.out.println("En el vector hay "+Cuenta+" numeros pares");
			
			System.out.println("METODO IMPRIME DE OTRA CLASE");
			imprime.ImprimeInt(Num); //LLAMAMOS A UN METODO DE OTRA CLASE QUE LEE VECTORES DE TIPO INT
		}
	
	
		public static int CuentaPar(int [] V){
				int C=0;
					for (int P = 0; P < V.length; P++) {
						if(V[P]%2==0) C++;
					}
					return C;
					/*
					 * En el return solo se pone la variable que queremos que regrese
					 * void es vacio y en el public static se pone el metodo que querramos
					 * regresar*/
		}
	
	
		public static void GeneraVector(int [] Num, int N){
			for (int P = 0; P < N; P++) {
				Num[P]=(int)(Math.random()*10);
			}
		}
		
		
		public static void ImprimeVec(int [] V){ 
			for (int P = 0; P < V.length; P++) {
				System.out.println("["+V[P]+"] Pos "+P);
			}
		}
		
		//LAS VARIABLES SE USAN DE FORMA LOCAL EN LOS METODOS, NO IMPORTA EL NOMBRE QUE RECIBA EL 
		//PARAMETRO POR LO QUE NO IMPORTA EL NOMBRE DE LA VARIABLE SI NO EL VALOR, EL ORDEN Y EL TIPO
		//DE LA VARIABLE
		

}
