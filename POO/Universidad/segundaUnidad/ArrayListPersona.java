package segundaUnidad;

import java.util.*;

public class ArrayListPersona {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Persona2> listaDePersonas = new ArrayList<Persona2>(); //creamos el arraylist de tipo Persona2
		Scanner sc = new Scanner (System.in); //declaramos el scanner
		
		String nombre,personaJoven="";
		int edad,contadorMujeres=0,contadorMenoresEdad=0,contadorEdadTotal=0,k=1000,contadorAdultosMayores=0;
		double promedioEdad=0;
		char sexo;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Datos de la persona numero "+(i+1)); //pedimos los datos de la persona
			
			
			System.out.print("Ingrese el nombre: ");
			nombre=sc.nextLine();
			
			System.out.print("Ingrese el sexo: ");
			sexo=sc.nextLine().charAt(0);
			
			System.out.print("Ingrese la edad: ");
			edad=sc.nextInt();
			sc.nextLine();
			System.out.println("\n\n");
			
			Persona2 persona = new Persona2 (nombre,sexo,edad);	//creamos el objeto
			listaDePersonas.add(persona);	//agregamos a la persona al arraylist
			
			if(persona.getSexo()=='m'||persona.getSexo()=='M')	//contamos cuantas mujeres hay 
				contadorMujeres++;
			
			if(persona.getEdad()<=17 && persona.getEdad()>0)	//contamos cuantos menores de edad hay (0-17)
				contadorMenoresEdad++;
			
			contadorEdadTotal+=persona.getEdad(); //sumamos todas las edades
			
			if(persona.getEdad()<k){	//buscamos a la persona con menor edad
				k=persona.getEdad();	//si entra a este for, actualizamos la edad mas joven bajo la variable k
				personaJoven = persona.getNombre();	//guardamos en el String personaJoven el nombre de esta persona
			}
			
			if(persona.getEdad()>=60)	//contamos a los adultos mayores
				contadorAdultosMayores++;
			
		}
		promedioEdad = contadorEdadTotal/listaDePersonas.size(); //dividimos la edad total entre cuantas personas hay
		
		//mostramos resultados
		System.out.println("El total de mujeres es de: "+contadorMujeres);
		System.out.println("Total de menores de edad (0-17 años): "+contadorMenoresEdad);
		System.out.println("Promedio de edades: "+promedioEdad);
		System.out.println("Persona mas joven: "+personaJoven);
		System.out.println("Total de adultos mayores: "+contadorAdultosMayores);
		
		

	}

}
