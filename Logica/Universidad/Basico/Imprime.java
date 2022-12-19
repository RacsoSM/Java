package Basico;

public class Imprime {

	public static void main(String[] args) {
	
		System.out.println("COMO IMPRIMIR EN JAVA");
		System.out.println("--------------------------------------------------------");
		
		//IMPRIMIR TODOS LOS NUMEROS MENORES DE 20
		int N=0;
		do{
			System.out.print(N+" ");
			N=N+1;
			if(N==10){
				System.out.println();
				System.out.println("Ya son 10 numeros");
			}
		}while(N<20);
		
		System.out.println();
		System.out.println("Esos son todos los numeros");
		
		//atajo
		//Syso + ctrl + barra espaciadora = System.out.println(); 
		

		
		
		/*
		 char comillas simples
		 las cadenas se concatenan con "+"
		 es de tipado fuerte (distingue entre mayusculas y minusculas)
		 tiene muchas palabras reservadas q no se pueden usar como identificadores
		 
		 */
	}

}
