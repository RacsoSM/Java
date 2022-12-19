package Pruebas;

public class Cadenas {

	public static void main(String[] args) {
	
		/*
		 * DecimalFormat Mascara=new DecimalFormat("$###,###.##");
		 * System.out.println("La propina que usted dejara es de: "+Mascara.format(tip)+"\n\n");
		 */
		
		
		/*
		  CONSEGUIR LA POSICION DE CIERTA LETRA EN EL STRING.
		 */
		
		String cadena="";
		System.out.println("Ingrese la cadena: "); cadena=Leer.dato();
				
		for (int i = 0; i < cadena.length(); i++) {
			
			if (cadena.charAt(i)=='a') {//AQUI CAMBIAR EL VALOR DE a POR EL QUE QUERRAMOS
				System.out.println("Posicion de la letra = "+i);
			}
			
		}

	
	}
	
	public static String Reemplaza(String V){  // CONSEGUIR LA POSICION DE CIERTA LETRA EN EL STRING.
		 
        System.out.println("Original String is ': " + V);
        System.out.println("String after replacing: 'hola' with 'cambio':  " + V.replace("hola", "cambio")); //CAMBIA AQUI LAS PALABRAS
        System.out.println("String after replacing all 'a' with 'x':  " +V.replace('a', 'x'));//CAMBIA AQUI LAS LETRAS
        
        V=V.replace("hola","cambio");//SE CAMBIAN AQUI, PARA PALABRAS COMILLAS DOBLES, PARA CARACTERES COMILLAS SIMPLES
        return V;
}

}
