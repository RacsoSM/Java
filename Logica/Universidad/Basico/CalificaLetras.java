package Basico;
//SANTACRUZ MALDONADO OSCAR SAID
public class CalificaLetras {

	public static void main(String[] args) {
		
		int c;
		char l=0;
		
		System.out.println("Califica Letras\n");
		System.out.println("Ingrese la calificacion del alumno");
	    c=Leer.datoInt();
		
	    if(c<=69)
	    {
	    	l='D';
	    }
	    if(c>=70 && c<=79)
	    {
	    	l='C';
	    }
	    if(c>=80 && c<=89)
	    {
	    	l='B';
	    }
	    if(c>=90 && c<=100)
	    {
	    	l='A';
	    }
	    if(c>100 || c<0)
	    {
	    	System.out.println("Ingrese un numero valido del rango  0 - 100");
	    }
	    
	    System.out.println("La calificación "+c+" corresponde a la letra "+l);
	}

}
