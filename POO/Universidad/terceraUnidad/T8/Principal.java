package T8;
import java.text.DecimalFormat;
/*Santacruz Maldonado Oscar Said
 *Marrujo Garcia Angel Antonio
 *Proyecto 2 Nomina 2023
 *Programación Orientada a Objetos    Dra Maria Lucia Barron Estrada
 *Esta es la clase que se encargará de ejecutar el proyecto y usar a las demas clases con un metodo main, el 
 *objetivo de este proyecto es demostrar y usar caracteristicas tanto de herencia como de polimorfismo, asi como de 
 *conceptos aprendidos anteriormente*/
import java.util.*;
/*Santacruz Maldonado Oscar Said 	POO 		10-11
 *Maestra Lucia Barron*/

/*REPORTE DE LO QUE PASA
 * 
 * Al definir el metodo sueldo() como metodo abstracto en la clase Empleado, definimos que todas sus subclases tendran una implementacion del metodo
 * sueldo, lo que hacemos en este programa es imprimir los diferentes sueldos de diferentes empleados, ya sean base, por horas o por comisiones, 
 * creamos un arraylist de tipo empleado que puede contener a todos los empleados, los creamos y agregamos al arraylist y luego imprimimos y 
 * usamos el metodo sueldo en cada uno de ellos. En tiempo de EJECUCION, se resuelve que metodo sueldo usar, pues en tiempo de compilacion
 * el objeto es de tipo empleado y el metodo sueldo de empleado es abstracto, por lo que ya que el programa se ejecuta, busca que objeto es este empleado
 * y ejecuta su metodo sueldo DINAMICAMENTE.*/

public class Principal {
	
	 ArrayList<Empleado> listaEmpleados; //creamos un arraylist que contendrá empleados
	
	public static void main(String[] args) {
		
		Principal principal = new Principal ();
		principal.listaEmpleados = new ArrayList<>(); //creamos un objeto de esta clase que contenga el arraylist
		
		//arrays de los datos necesarios para no teclearlos
		String nombres [] = {"Ana Martinez","Sofi Perez","Pablo Quiroz","Jose Lopez","Juan Rodriguez"}; 
		char sexos [] = {'M','M','H','H','H'};
		String fechasNacimiento [] = {"12/04/2000","07/01/1995","09/10/1990","24/02/1992","20/03/1996"};
		String puestos []={"DIRECTORA","PROGRAMADORA","OPERADOR","INTENDENTE","PROGRAMADOR"}; 
		
		principal.creaEmpleadosBase(principal, nombres, sexos, fechasNacimiento, puestos); //llamamos al metodo que crea los empleados base
		
		
		int horas [] = {15,25,40,70,44};
		double tarifas[]={60.15,75.12,45.5,90.55,65.5};
		
		principal.creaEmpleadosPorHora(principal, nombres, sexos, fechasNacimiento, horas, tarifas);
		
		
		double ventas [] = {55250.55,28105.90,39990.15,20560.90,29450.0};
		
		principal.creaEmpleadoComision(principal, nombres, sexos, fechasNacimiento, ventas);
		
		double contadorSueldos=0;
		for (int i = 0; i < principal.listaEmpleados.size(); i++) { //mostramos los empleados del arraylist
			System.out.println(principal.listaEmpleados.get(i).toString()+"\t\t\t sueldo $"+principal.listaEmpleados.get(i).sueldo());
			contadorSueldos+=principal.listaEmpleados.get(i).sueldo();
		}
		System.out.println("\n\n\t\tEl total de los sueldos es de: $"+contadorSueldos);
		
	}
	
	//public EmpleadoComision (String nombre, char sexo, String fechaNacimiento, int numeroEmpleado, int porcentaje, double ventas){
	public void creaEmpleadoComision(Principal principal, String [] nombres, char [] sexos, String[] fechasNacimiento,double [] ventas){
		for (int i = 0; i < 5; i++) {
			Empleado eComisiones = new EmpleadoComision(nombres[i],sexos[i],fechasNacimiento[i],i+10,10,ventas[i]);
			principal.listaEmpleados.add(eComisiones);
		}
	}
	
	// public EmpleadoPorHora(String nombre, char sexo, String fechaNacimiento, int numeroEmpleado,int horas, double tarifa) { //constructor del empleadoBase
	public void creaEmpleadosPorHora(Principal principal, String [] nombres, char [] sexos, String [] fechasNacimiento, int horas [], double tarifas [] ){
		for(int i=0;i<5;i++){
			//creamos los 5 empleados, reutilizamos los datos de los anteriores para no batallar
			Empleado eHoras = new EmpleadoPorHora(nombres[i],sexos[i],fechasNacimiento[i],i+5,horas[i],tarifas[i]);
			principal.listaEmpleados.add(eHoras); 
		}
	}
	
	public void creaEmpleadosBase(Principal principal,String [] nombres, char [] sexos, String [] fechasNacimiento,String [] puestos){
		for(int i=0;i<5;i++){
			//creamos los 5 empleados
			Empleado eBase = new EmpleadoBase(nombres[i], sexos[i], fechasNacimiento[i],i,puestos[i]);
			principal.listaEmpleados.add(eBase); //los agregamos al arraylist
		}
	}
	
	
	
}
