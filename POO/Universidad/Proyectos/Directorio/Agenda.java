package Directorio;

import java.util.*;



public class Agenda {
	static ArrayList<Contacto> listaContactos = new ArrayList<Contacto>(); //arraylist de los contactos
	static Scanner sc = new Scanner (System.in); //scanner para leer datos
	
	public static void main(String[] args) {
		
		Telefono t1 = new Telefono ('M',"+52","6673017019");
		Persona p1 = new Persona ("Oscar", "Santacruz", 'H',"Inge oscarin");
		Contacto c1 = new Contacto (p1,t1);
		listaContactos.add(c1);
		
		Telefono t2 = new Telefono ('C',"+52","6671177524");
		Persona p2 = new Persona ("Denisse", "Rendón", 'M',"Lic twin bonita gymrat churrera dotora");
		Contacto c2 = new Contacto (p2,t2);
		listaContactos.add(c2);
		
		Telefono t3 = new Telefono ('O',"+12","4412557812");
		Persona p3 = new Persona ("Laura", "Astorga", 'M',"Gorda");
		Contacto c3 = new Contacto (p3,t3);
		listaContactos.add(c3);
		
		//System.out.println(Contacto.getCantidadContactos()+" contactos ");
	
		System.out.println("Agenda Telefónica");
		
		int opcion=0;
		
		while(true){
			
			System.out.println("1. Imprimir todo el directorio");
			System.out.println("2. Imprimir listado");
			System.out.println("3. Agregar una persona");
			System.out.println("4. Buscar una persona");
			System.out.println("5. Eliminar una persona");
			System.out.println("6. Consultar");
			System.out.println("7. Ordenar");
			System.out.println("8. Salir ");
			
			System.out.print("\nIngrese una opción ");
			opcion = sc.nextInt();
			
			switch(opcion){
			case 1: //metodo para imprimir todo el directorio
			case 2: //metodo para imprimir listado
			case 3: //metodo para agregar una persona
			case 4: //metodo para buscar una persona
			case 5: //metodo para eliminar una persona
			case 6: //metodo para consultar
			case 7: //metodo para ordenar
					System.out.println("Esta opción aun no esta disponible"); break;
			case 8: System.exit(0); break;
			default: System.out.println("Opción no valida");
			}
			
		System.out.println("\n");
			
			
		}
		
	}
}
