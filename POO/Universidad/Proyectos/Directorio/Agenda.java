package Directorio;

import java.util.*;



public class Agenda {
	static ArrayList<Contacto> listaContactos = new ArrayList<Contacto>(); //arraylist de los contactos
	static Scanner sc = new Scanner (System.in); //scanner para leer datos
	
	public static void main(String[] args) {
		
		String [] nombres = {"Oscar","Denisse","Laura"};
		String [] apellidos = {"Santacruz","Rendón","Astorga"};
		String [] alias = {"Inge oscar", "Rubia", "Gorda"};
		char [] sexos = {'H','M','M'};
		
		char [] tipoTel = {'M','M','O'};
		String [] clavePais = {"+52","+52","+12"};
		String [] telefono = {"6673017019","6671177524","4412557812"};
		
		for (int i = 0; i < 3; i++) {
			Telefono t = new Telefono(tipoTel[i],clavePais[i],telefono[i]);
			Persona p = new Persona(nombres[i],apellidos[i],sexos[i],alias[i]);
			Contacto c = new Contacto(p,t);
			listaContactos.add(c);
		}
		
		int opcion=0;
		
		System.out.println("Agenda Telefónica");
		
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
			System.out.println("\n");
			
			switch(opcion){
			case 1: //metodo para imprimir todo el directorio 
					System.out.println(Contacto.getCantidadContactos()+" contactos\n");
					for(Contacto contacto : listaContactos) {
						System.out.println(contacto.toString());
					}
					break;
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
