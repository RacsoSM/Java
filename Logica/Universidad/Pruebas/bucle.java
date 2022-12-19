package Pruebas;



public class bucle {

	public static void main(String[] args) {
		
		
		
		/*Escribir un programa en el que se pregunte al usuario por una frase y una letra, y
		   muestre por pantalla el número de veces que aparece la letra en la frase.
		
		
		int c=0;
		String f="",x="",l="";
		
		
		System.out.println("Ingrese su frase: ");
		f=Leer.dato();
		
		System.out.println("Ingrese su letra: ");
		l=Leer.dato();
		
		for (int i=1;i<f.length()+1;i++){
			x=f.substring(f.length()-i,f.length()-i+1);
			
			if (x.equals(l)){
				c++;
			}
		}
		System.out.println("La letra "+l+" se encontro "+c+" veces en la frase");
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Escribir un programa que pida al usuario una palabra y luego muestre por pantalla una a una las 
		 letras de la palabra introducida empezando por la última.
		 
		String a="",s="";
		System.out.println("Ingrese la palabra: ");
		a=Leer.dato();
		
		for (int i=1;i<a.length()+1;i++){
			s=a.substring(a.length()-i,a.length()-i+1);
			System.out.println(s);
		}
		
		
		
		/*
		
		
		

		
		
		
		
		/*Escribir un programa que pida al usuario un número entero y muestre por pantalla si es un número primo o no.
		int n=0,c=0;
		String a="";
	
		
		do{
			c=0;
			System.out.println("Ingrese su numero");
			n=Leer.datoInt();
		if(n==0) System.exit(0);
	for (int i=1;i<=100;i++){
	
		if (n%i==0){
			c++;
		}
	}

	
	if(c>2) System.out.println("El numero NO es primo");
	if(c==2) System.out.println("El numero SI es primo");
		}while(n!=133333333);
		/*
		 
		 
		
		
		
		
		
		/*Escribir un programa que almacene la cadena de caracteres contraseña en una variable, 
		pregunte al usuario por la contraseña hasta que introduzca la contraseña correcta.
		
		int i=0;
		String c="contraseña",u="";
		do{
			System.out.println("Ingrese la contraseña");
			u=Leer.dato();
			if(u.equals(c))i++;
			else System.out.println("Contraseña incorrecta, intentelo de nuevo\n");
		}while(i<=0);
		System.out.println("Contraseña correcta, felicidades");
		
		*/
		
		
		
		
		
		
		/*SIN RESOLVER
		 * Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo
		  como el de más abajo. de altura el numero pedido

1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
		
		int num=0,a=1;
		System.out.println("Ingrese el numero");
		num=Leer.datoInt();
		
		for (int i=1; i<=num;i++){
			for(int y=1;i>y;y=y+2){
				System.out.print(a);
				a=a+y;
				
			}
			System.out.println("");
		}*/

		
		
	}

}
