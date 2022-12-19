package Basico;
//SANTACRUZ MALDONADO OSCAR SAID
public class NumerosAleatorios {

	public static void main(String[] args) {
		System.out.println("Numeros aleatorios");
		int n=0,num=0, c=1,suma=0,may=0,comp=0;
		System.out.print("Cuantos numeros quieres?: ");
		n=Leer.datoInt();
		do{
			num=(int)(Math.random()*100);
			if(num<10)continue;	
			
				if(num<30){
					 suma= suma+num;
				}
				if(num>70){
					 may=may+1;
				}
				if(num>40 && num<50){ //NO TOME EN CUENTA EL 40 Y EL 50, SOLO DEL 41 AL 49
					 comp=comp+1;
				}		 
			
			System.out.println(num);
			c=c+1;
			
		}while(c<=n);
		
		System.out.println("La suma de todos los numeros menores a 30 fue de: "+suma);
		System.out.println("Hubo un total de "+may+" numeros mayores de 70");
		System.out.println("Hubo un total de "+comp+" numeros entre 40 y 50");

	}

}
