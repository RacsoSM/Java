package Basico;
//SANTACRUZ MALDONADO OSCAR SAID 
//EXAMEN UNIDAD 2
public class ExamenUnidad2 {

	public static void main(String[] args) {
		
		int dias,enf,edad;
		double costodiario=0,subtotal=0,extra=0,total=0;
		
		System.out.println("Ingrese el tipo de enfermedad (Valores permitidos 1-4): ");
		enf=Leer.datoInt();
		
		System.out.println("Ingrese la edad del paciente: ");
		edad=Leer.datoInt();

		System.out.println("Ingrese los dias internado: ");
		dias=Leer.datoInt();
		
		switch(enf){
		case 1: costodiario=25; break;
		case 2: costodiario=16; break;
		case 3: costodiario=20; break;
		case 4: costodiario=22; break;
		default:System.out.println("ERROR, SU NUMERO NO ESTA EN EL RANGO PERMITIDO DE 1-4");
		}
		
		subtotal=costodiario*dias;
		
		if(edad>70){
			extra=subtotal*.10;
		}
		
		total=subtotal+extra;
		System.out.println("El costo total del paciente por estar internado fue de: $"+total);
	}

}
