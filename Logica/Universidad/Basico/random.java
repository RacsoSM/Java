package Basico;

public class random {

	public static void main(String[] args) {
		System.out.println("Numeros aleatorios");
		int n=0,num=0, c=1;
		System.out.print("Cuantos numeros quieres?: ");
		n=Leer.datoInt();
		do{
			//num=(int) convierte el valor a entero
			num=(int)(Math.random()*100);//GENERA NUMERO ALEATORIO 
			if(num<10)continue;			//SI num<10 REGRESA A PRINCIPIO DEL CICLO
			//continue hace que regresemos al principio del ciclo
			System.out.println(num);
			c=c+1;
		}while(c<=n);
	}

}
