//PROFE NO SE NI QUE HICE PERO EL PROGRAMA FUNCIONA :)))))))))
package Arreglos;

public class CadenaVector {

	public static void main(String[] args) {
		String oracion="";
		int cont=0,x=0,s=0,blanco=0;

		System.out.println("Ingrese la cadena: ");
		oracion=Leer.dato();
		
	
		char[] letras= new char [oracion.length()];
		char[] tran= new char [oracion.length()];
		String [] vec = new String [oracion.length()];
		
		
			for (int w = 0; w < oracion.length(); w++) {
				tran[w]='x';
			}
			
		System.out.println("\n");
		System.out.println("VECTOR ORIGINAL");
			for (int i = 0; i < oracion.length(); i++) {
					letras[i]=oracion.charAt(i);
					vec[i]=oracion.substring(i,i+1);
					System.out.println("["+letras[i]+"]" +" POSICION  "+i);
						
						if(vec[i].equals(" ")){
							blanco++;
						}
						if(vec[i].equals("a")||vec[i].equals("e")||vec[i].equals("i")||vec[i].equals("o")||vec[i].equals("u")){
							cont++;
							tran[i]=oracion.charAt(i);
						}
						if(vec[i].equals("A")||vec[i].equals("E")||vec[i].equals("I")||vec[i].equals("O")||vec[i].equals("U")){
							cont++;
							tran[i]=oracion.charAt(i);
						}
			}
			
			
			char[]vocales= new char[cont];
			char[]original=new char[oracion.length()-cont-blanco];
		
			for (int i = 0; i < oracion.length(); i++) {
						if(tran[i]!='x'){ 
							vocales[x]=tran[i];
							x++;
						}
						if(tran[i]=='x' && !vec[i].equals(" ")){
							original[s]=letras[i];
							s++;
						}
			}
			
			
			System.out.println("\n ");
			System.out.println("VECTOR DE VOCALES");
			for (int i = 0; i < vocales.length; i++) {
				System.out.println("["+vocales[i]+"]"+ " POSICION "+i);
			}
			
			System.out.println("\n ");
			System.out.println("VECTOR ORIGINAL SIN VOCALES");
			for (int i = 0; i < original.length; i++) {
				System.out.println("["+original[i]+"]"+ " POSICION "+i);
			}	
		
	}
}