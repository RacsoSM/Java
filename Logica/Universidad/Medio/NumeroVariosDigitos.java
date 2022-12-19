package Medio;

public class NumeroVariosDigitos {

	public static void main(String[] args) {
	
		int num=0,i=0,z=0,acu=0;
		String numero="",y="",a="";
		
		System.out.println("Ingrese el número: ");
		num=Leer.datoInt(); //NUMERO EN INT
		
		numero= String.valueOf(num); //NUMERO EN STRING
		

		for ( i =0; i<numero.length();i++){
		y=numero.substring(i,i+1);
		z=Integer.parseInt(y);
		acu=acu+z;
		}
		System.out.println("El numero tiene "+numero.length()+" digitos");
		System.out.println("La suma de los digitos "+acu);

		
		for ( i =1; i<numero.length()+1;i++){	
		a=numero.substring(numero.length()-i,numero.length()-i+1);
		System.out.print(a);	
		}
	}

}
