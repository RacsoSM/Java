package Trabajadores;

import java.util.Scanner;
public class CreaPagoTrabajadores {

	
	
	public static void main(String[] args) {
		String direccion,nombre,nss,puesto,telefono;
		int horas,sueldo,contadorTrabajadores=1;
		double tarifaxhora;
		
		Scanner sc = new Scanner(System.in);
		Trabajador [] arregloTrabajadores = new Trabajador [5];
		
		
		for(int i=0;i<arregloTrabajadores.length;i++){
		
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
			

			if(i>2){
				System.out.print("Horas trabajadas del empleado: ");
				horas=sc.nextInt();
				sc.nextLine();

				System.out.print("Tarifa por hora del empleado: ");
				tarifaxhora=sc.nextDouble();
				sc.nextLine();
				
				arregloTrabajadores[i]=new Consultor(direccion, nombre, nss, puesto, telefono, horas, tarifaxhora);
			}
			else{
				System.out.print("Sueldo del empleado: ");
				sueldo=sc.nextInt();
				sc.nextLine();

				arregloTrabajadores[i]=new EmpleadoSueldoFijo(direccion, nombre, nss, puesto, telefono, sueldo, 0);
				

			}
			arregloTrabajadores[i].CalcularPago();
	
			
		}

		for (Trabajador trabajador : arregloTrabajadores) {
			System.out.println("\n\nDatos del trabajador numero "+contadorTrabajadores);
			trabajador.mostrarDatos();
			System.out.println("El pago de este trabajador es de: "+trabajador.CalcularPago());
			contadorTrabajadores++;
		}
		

		
		

		
		
		
	}
}
