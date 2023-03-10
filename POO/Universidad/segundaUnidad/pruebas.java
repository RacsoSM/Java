package segundaUnidad;
import java.util.*;

public class pruebas {

	public static void main(String[] args) {
		ArrayList<Persona2> lista = new ArrayList<Persona2>();
		Scanner sc = new Scanner (System.in); //declaramos el scanner
		
		String nombre,personaJoven="";
		int edad,contadorMujeres=0,contadorMenoresEdad=0,contadorEdadTotal=0,k=1000,contadorAdultosMayores=0,agregar=1,i=0;
		double promedioEdad=0;
		char sexo;
		
		
		do{
			
			System.out.println("Datos de la persona numero "+(i+1)); //pedimos los datos de la persona
			i++;
			
			System.out.print("Ingrese el nombre: ");
			nombre=sc.nextLine();
			
			System.out.print("Ingrese el sexo: ");
			sexo=sc.nextLine().charAt(0);
			
			System.out.print("Ingrese la edad: ");
			edad=sc.nextInt();
			sc.nextLine();
			System.out.println("\n\n");
			
			Persona2 persona = new Persona2 (nombre,sexo,edad);	//creamos el objeto
			lista.add(persona);	//agregamos a la persona al arraylist
			
			System.out.println("Desea agregar a una persona mas? (0 = NO, 1 = SI) ");
			agregar=sc.nextInt();
			sc.nextLine();
		}while (agregar!=0);
		
		
		System.out.println(lista.toString());
	}
}
