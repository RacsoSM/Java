package Basico;
//SANTACRUZ MALDONADO OSCAR SAID
public class DiaSemana {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Ingrese un numero del 1-7");
        n=Leer.datoInt();
        
	        switch(n) {
	        case 1: System.out.println("El dia es lunes ");		 break;
	        case 2: System.out.println("El dia es martes");		 break;
	        case 3: System.out.println("El dia es miercoles"); 	 break;
	        case 4: System.out.println("El dia es jueves");		 break;
	        case 5: System.out.println("El dia es viernes");     break;
	        case 6: System.out.println("El dia es sabado"); 	 break;
	        case 7: System.out.println("El dia es domingo"); 	 break;
	        default: System.out.println("Su numero no esta en el rango permitido de 1-7");
	        }
	        
	}

}
