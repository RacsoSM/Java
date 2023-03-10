package segundaUnidad;
import java.util.Scanner;

public class UsaAlumno {
	
	/*hacer 2 objetos para el alumno, 2 objetos para el maestro , pedirlos por teclado y mostrarlos, terminar el toString
	 *  del alumno. y mostrar los datos de c/u con el toString Hay que mostrar por pantalla los 4 objetos (usando toString)*/

	
	public static void main(String[] args) {
		//ALUMNO 
		AlumnoPrimaria [] arregloAlumnos = new AlumnoPrimaria [2]; //CREAMOS ARRAY DE ALUMNOS PRIMARIA
		pedirAlumno(arregloAlumnos);
		
		//MAESTRO
		Maestro [] arregloMaestros = new Maestro [2]; //CREAMOS ARRAY DE ALUMNOS PRIMARIA
		pedirMaestro(arregloMaestros);
		

		//MOSTRAMOS RESULTADOS
	System.out.println("\nAlumno 1:\n"+arregloAlumnos[0].toString()); //MOSTRAMOS LOS DATOS DEL ALUMNO 1
	System.out.println("\nAlumno 2: \n"+arregloAlumnos[1].toString()); //MOSTRAMOS LOS DATOS DEL ALUMNO 2
		
	System.out.println("\n\nMaestro 1:\n"+arregloMaestros[0].toString()); //MOSTRAMOS LOS DATOS DEL ALUMNO 1
	System.out.println("\nMaestro 2: \n"+arregloMaestros[1].toString()); //MOSTRAMOS LOS DATOS DEL ALUMNO 2
	}
	
	
	public static void pedirAlumno(AlumnoPrimaria [] arregloAlumnos){
		Scanner sc = new Scanner(System.in);
		String nombre;
		int numAlumno;
		byte edad;
		byte grado;
		char grupo;
		
		for(int i=0;i<arregloAlumnos.length;i++){		//PEDIMOS LOS DATOS DEL ALUMNO
			System.out.println("Datos del alumno numero "+(i+1));
			System.out.println("Ingrese el nombre del alumno: ");
			nombre=sc.nextLine();
	
			
			System.out.println("Ingrese el numero de control del alumno: ");
			numAlumno=sc.nextInt();
		
			
			System.out.println("Ingrese la edad del alumno: ");
			edad=sc.nextByte();
			sc.nextLine(); //ARREGLAMOS EL ERROR DE PEGADO DEL SCANNER
			
				if(i!=0){ //PEDIMOS DATOS EXTRA SI NO ES EL PRIMER ALUMNO
					System.out.println("Ingrese el grado del alumno: ");
					grado=sc.nextByte();
					sc.nextLine(); //ARREGLAMOS EL ERROR DE PEGADO DEL SCANNER
					
					System.out.println("Ingrese el grupo del alumno");
					grupo=sc.nextLine().charAt(0); 
					
					arregloAlumnos[i] = new AlumnoPrimaria(numAlumno,edad,nombre,grado,grupo);
					System.out.println();
					continue; //SI ENTRA A ESTE IF, TERMINAMOS LA VUELTA DEL BUCLE AQUI
				}
			arregloAlumnos[i] = new AlumnoPrimaria(numAlumno,nombre,edad); //EN CASO DE QUE EL IF NO SE CUMPLA, ESTE SERA EL ALUMNO	
			System.out.println();
		}
	}
	
	public static void pedirMaestro(Maestro [] arregloMaestros){
		Scanner sc = new Scanner(System.in);
		String nombre;
		String horarioo;
		int idmaestro;
		byte grado;
		char grupo;
		
		System.out.println("\n");
		for(int i=0;i<arregloMaestros.length;i++){		//PEDIMOS LOS DATOS DEL MAESTRO
			System.out.println("Datos del maestro numero "+(i+1));
			System.out.println("Ingrese el nombre del maestro: ");
			nombre=sc.nextLine();
	
			
			System.out.println("Ingrese el id del maestro: ");
			idmaestro=sc.nextInt();
			sc.nextLine(); //ARREGLAMOS EL ERROR DE PEGADO DEL SCANNER
			
			System.out.println("Ingrese el horario del maestro: ");
			horarioo=sc.nextLine();
			
			
				if(i!=0){ //PEDIMOS DATOS EXTRA SI NO ES EL PRIMER MAESTRO
					System.out.println("Ingrese el grado asignado del maestro: ");
					grado=sc.nextByte();
					sc.nextLine(); //ARREGLAMOS EL ERROR DE PEGADO DEL SCANNER
					
					System.out.println("Ingrese el grupo asignado del maestro");
					grupo=sc.nextLine().charAt(0); 
					
					
					arregloMaestros[i] = new Maestro(nombre,horarioo,idmaestro,grado,grupo);
					System.out.println();
					continue; //SI ENTRA A ESTE IF, TERMINAMOS LA VUELTA DEL BUCLE AQUI
					
				}
			arregloMaestros[i] = new Maestro(nombre,horarioo,idmaestro); //EN CASO DE QUE EL IF NO SE CUMPLA, ESTE SERA EL CONSTRUCTOR
			System.out.println();
		}
	}


}
