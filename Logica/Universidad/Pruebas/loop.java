package Pruebas;

public class loop {

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

		/*Escribir un programa que pida al usuario un nmero entero y muestre por pantalla un tringulo rectngulo como el de mñs abajo, de altura el nñmero introducido.

		*
		**
		***
		****
		*****

		
		
		int num;
		String x="*";
		System.out.println("Ingrese un numero entero: ");
		num=Leer.datoInt();
		
		for(int i=1; i<=num; i++){
			
			for(int y=1; y<=i;y++)
				
				System.out.print(x);
				System.out.println("");
		}
		
		/*
		
		
		
		
		
		
		
		
		/*Escribir un programa que pregunte al usuario una cantidad a invertir, el interñs anual y el nñmero
		de años, y muestre por pantalla el capital obtenido en la inversiñn cada año que dura la inversiñn.
		int cant,interes,años,ganancia = 0,tot = 0;
		System.out.println("Ingrese la cantidad a invertir:");
		cant=Leer.datoInt();
		System.out.println("Ingrese el interes anual: (%)");
		interes=Leer.datoInt();
		System.out.println("Ingrese el numero de años:");
		años=Leer.datoInt();
		tot=cant;
		for(int i=1;i<=años;i++){
			
			ganancia=cant+(tot*interes/100);
			System.out.println("La ganancia del año numero "+i+" fue de: $"+ganancia);
			tot=ganancia+tot;
		}
		System.out.println("La ganancia total de la inversion fue de $"+tot);
		
		/*
		
		
		
		
		
		
		
		/*Escribir un programa que pida al usuario un nñmero entero positivo y muestre por pantalla la cuenta atrñs desde
		ese nñmero hasta cero separados por comas.
		int num;
		System.out.println("Ingrese un numero entero positivo");
		num=Leer.datoInt();
		
		for( int i=0; i<=num;num--){
			System.out.print(num+",");
		
		}
		/*
		
		
		
		
		
		
		
		
		
		/*Escribir un programa que pida al usuario un nñmero entero positivo y muestre por pantalla todos
		los nñmeros impares desde 1 hasta ese nñmero separados por comas.
		
		int num;
		System.out.println("Ingrese un numero entero positivo");
		num=Leer.datoInt();
		
		for(int i=1; i<=num;i++){
			if(i%2 != 0){
				System.out.print(i+",");
			}
		}
		
		*/
		
		
		
		
/*MUESTRA TODOS LOS AñOS CUMPLIDOS HASTA EL MOMENTO
	 * int ed,i=1 ;
System.out.println("Cuantos años tienes?");
		ed=Leer.datoInt();
		
		
		do{
			System.out.println(i+ " años");
			i++;
		}while(i<=ed);
		*/
	}

}
