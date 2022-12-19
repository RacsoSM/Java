package Basico;

public class numerosreto {

	public static void main(String[] args) {
		int n1,n2,n3,n4,n5,may = 0,men = 0,prom,tot;

		System.out.println("Ingresa el primer numero: ");
		n1=Leer.datoInt();
		
		System.out.println("Ingresa el segundo numero: ");
		n2=Leer.datoInt();
		
		System.out.println("Ingresa el tercer numero: ");
		n3=Leer.datoInt();
		
		System.out.println("Ingresa el cuarto numero: ");
		n4=Leer.datoInt();
		
		System.out.println("Ingresa el quinto numero: ");
		n5=Leer.datoInt();
		tot=n1+n2+n3+n4+n5;
		
		if(n1>n2 && n1>n3 && n1>n4 && n1>n5){
			System.out.println("El numero mayor es "+n1);
			may=n1;
			 
		}
		if(n2>n1 && n2>n3 && n2>n4 && n2>n5){
			System.out.println("El numero mayor es "+n2);
			may=n2;
		}
		if(n3>n1 && n3>n2 && n3>n4 && n3>n5){
			System.out.println("El numero mayor es "+n3);
			may=n3;
		}
		if(n4>n1 && n4>n2 && n4>n3 && n4>n5){
			System.out.println("El numero mayor es "+n4);
			may=n4;
		}
		if(n5>n1 && n5>n2 && n5>n3 && n5>n4){
			System.out.println("El numero mayor es "+n5);
			may=n5;
		}
		
		
		if(n1<n2 && n1<n3 && n1<n4 && n1<n5){
			System.out.println("El numero menor es "+n1);
			men=n1;
		}
		
		if(n2<n1 && n2<n3 && n2<n4 && n2<n5){
			System.out.println("El numero menor es "+n2);
			men=n2;
		}
		if(n3<n1 && n3<n2 && n3<n4 && n3<n5){
			System.out.println("El numero menor es "+n3);
			men=n3;
		}
		if(n4<n1 && n4<n2 && n4<n3 && n4<n5){
			System.out.println("El numero menor es "+n4);
			men=n4;
		}
		if(n5<n1 && n5<n2 && n5<n3 && n5<n4){
			System.out.println("El numero menor es "+n5);
			men=n5;
		}
		
		prom=(tot-may-men)/3;
		System.out.println("El promedio de los tres numeros restantes es: "+prom);
		
		
	}

}
