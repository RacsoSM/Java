package Arreglos;
//SANTACRUZ MALDONADO OSCAR SAID
public class Reto {

	public static void main(String[] args) {
		
		int n=0;
		System.out.println("¿Cuantos numeros enteros va a guardar?: ");
		n=Leer.datoInt();
		
		String [] sub= new String [n];
		String [] p= new String [n];
		int [] vec= new int[n];
		int [] primer= new int[n];
		int []cont= new int [10];
		
		
		System.out.println("VECTOR DE NUMEROS");
			for (int i = 0; i < n; i++) {
				vec [i]=(int)(Math.random()*100);
				System.out.println(vec[i]);
				
				p[i]= String.valueOf(vec[i]); //CONVERTIMOS EL NUMERO A STRING
				sub[i]=p[i].substring(0,1);   //EXTRAEMOS EL PRIMER DIGITO DEL NUMERO
				primer[i]=Integer.parseInt(sub[i]); //LO CONVERTIMOS A INT DE NUEVO PARA PODER MANIPULARLO
				
				
					if(vec[i]<10){ //CASO ESPECIAL PARA NUMEROS MENORES A 10 
						cont[0]+=1;
					}
					else{ //EN CUALQUIER OTRO CASO LE SUMAMOS 1 AL VALOR DEL VECTOR EN LA POSICION DEL PRIMER DIGITO DEL NUMERO
						cont[primer[i]]+=1;
					}
					
			}
			
			System.out.println("\n");
			System.out.println("VECTOR DE CONTADORES");
			for (int j = 0; j < cont.length; j++) {
				System.out.println(cont[j]); //IMPRIMIMOS EL VECTOR DE CONTADORES
			}
}
}
