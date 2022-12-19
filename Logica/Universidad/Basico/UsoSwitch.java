package Basico;

public class UsoSwitch {

	public static void main(String[] args) {
		int r;
	
		System.out.println("EL LENGUAJE JAVA ES:\n");
		System.out.println("1.- UN LENGUAJE HABLADO AL SUR DE FRANCIA.\n");
		System.out.println("2.- UTILIZADO SOLO PARA ESCRIBIR GRANDES PROGRAMAS DE COMPUTADORA.\n");
		System.out.println("3.- UN LENGUAJE COMPILADO, DE FACIL PORTABILIDAD A VARIOS SISTEMAS \n");
		System.out.println("4.- NINGUNA DE LAS ANTERIORES\n\n");
		
			System.out.println("Ingrese su respuesta:");
			r=Leer.datoInt();

				switch(r){
				case 1: System.out.println("Lo siento, está equivocado al sur de Francia hablan Pascal."); break;
				case 2: System.out.println("Lo siento, JAVA puede ser usado para escribir programas de cualquier tipo y tamaño."); break;
				case 3: System.out.println("Muy bien, su respuesta es la correcta. El lenguaje JAVA está compilado y puede ser utilizado en gran variedad de equipos."); break;
				case 4: System.out.println("Lo siento, la respuesta correcta es 3."); break;
				default: System.out.println("Contestó usted con un numero fuera del rango de 1 a 4");
				}
	}

}
