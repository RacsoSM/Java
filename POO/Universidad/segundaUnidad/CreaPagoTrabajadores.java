package segundaUnidad;

import java.util.Scanner; 	//importamos la clase scanner para leer datos
public class CreaPagoTrabajadores {

	
	
	public static void main(String[] args) {
		String direccion,nombre,nss,puesto,telefono;
		int horas,sueldo,contadorTrabajadores=1;
		double tarifaxhora;
		
		Scanner sc = new Scanner(System.in);
		Trabajador [] arregloTrabajadores = new Trabajador [5];	//declaramos un array de tipo Trabajador de 5 posiciones
		
		
		for(int i=0;i<arregloTrabajadores.length;i++){	//recorremos el array
		
			System.out.println("\n\nIngrese los datos del trabajador numero "+(i+1));//pedimos las caracteristicas del trabajador al usuario
			
			System.out.print("Direccion del trabajador: ");
			direccion=sc.nextLine();
			

			System.out.print("Nombre del trabajador: ");
			nombre=sc.nextLine();

			
			System.out.print("Numero de seguro social del trabajador: ");
			nss=sc.nextLine();
			

			System.out.print("Puesto del trabajador: ");
			puesto=sc.nextLine();
			

			System.out.print("Telefono del trabajador: ");
			telefono=sc.nextLine();
			

			if(i>2){		//si i>2, obligamos al programa a pedir las caracteristicas de un consultor, haciendo que haya 2 consultores y 3 empleados sueldo fijo
				System.out.print("Horas trabajadas del empleado: ");
				horas=sc.nextInt();
				sc.nextLine();	//con esta linea arreglamos un error del scanner que hace que el programa se quede pegado

				System.out.print("Tarifa por hora del empleado: ");
				tarifaxhora=sc.nextDouble();
				sc.nextLine();
				
				arregloTrabajadores[i]=new Consultor(direccion, nombre, nss, puesto, telefono, horas, tarifaxhora); //le damos los datos recolectados al consultor y lo inicializamos
			}
			else{	//en caso de que i<2, el empleado sera uno de sueldo fijo, por lo que le pedimos el sueldo
				System.out.print("Sueldo del empleado: ");
				sueldo=sc.nextInt();
				sc.nextLine();

				arregloTrabajadores[i]=new EmpleadoSueldoFijo(direccion, nombre, nss, puesto, telefono, sueldo, 0);//le damos los datos recolectados al empleado y lo inicializamos
				

			}
			
	
			
		}

		for (Trabajador trabajador : arregloTrabajadores) {	//recorremos todo el array de trabajadores
			System.out.println("\n\nDatos del trabajador numero "+contadorTrabajadores); //contador para decir en que trabajador estamos
			trabajador.mostrarDatos();	//llamamos al metodo mostrarDatos que tienen los trabajadores
			System.out.println("El pago de este trabajador es de: "+trabajador.CalcularPago());	//calculamos el pago
			contadorTrabajadores++;
		}
		

		
		

		
		
		
	}
}
