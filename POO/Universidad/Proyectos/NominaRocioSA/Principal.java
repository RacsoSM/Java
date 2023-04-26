package NominaRocioSA;
/*Santacruz Maldonado Oscar Said
 *PON TU NOMBRE COMPLETO AQUI
 *Proyecto 2 Nomina 2023
 *Programación Orientada a Objetos    Dra Maria Lucia Barron Estrada
 *Esta es la clase que se encargará de ejecutar el proyecto y usar a las demas clases con un metodo main, el 
 *objetivo de este proyecto es demostrar y usar caracteristicas tanto de herencia como de polimorfismo, asi como de 
 *conceptos aprendidos anteriormente*/
import java.util.ArrayList;
import java.util.Scanner;

import NominaRocioSA.EmpleadoBase.puestos;

public class Principal {

	static Scanner sc = new Scanner (System.in); //scanner para leer datos
	 ArrayList<Empleado> listaEmpleados; //creamos un arraylist que contendrá empleados
	
	public static void main(String[] args) {
		
		Principal principal = new Principal ();
		principal.listaEmpleados = new ArrayList<>(); //creamos un objeto de esta clase que contenga el arraylist
		
		String nombres [] = {"Ana Martinez","Sofi Perez","Pablo Quiroz","Jose Lopez","Juan Rodriguez"}; //arrays de los datos para no perder tiempo tecleandolos
		char sexos [] = {'M','M','H','H','M'};
		String fechasNacimiento [] = {"12/04/2000","07/01/1995","09/10/1990","24/02/1992","20/03/1996"};
		int numerosEmpleado[] = {3321,4578,1222,5552,8912};
		String arrayPuestos[] = {"secretaria","programadora","director","operador","intendente"};
		
		
		for(int i=0; i<5;i++){
			EmpleadoBase eBase = new EmpleadoBase(nombres[i],sexos[i],fechasNacimiento[i],numerosEmpleado[i],arrayPuestos[i]); //creamos objetos de tipo EmpleadoBase
			principal.listaEmpleados.add(eBase); //los agregamos al arraylist
			
		
			for(puestos p: puestos.values()){  //en un bucle foreach, recorremos la clase enum
				
				if(eBase.getPuesto().equalsIgnoreCase(p.name())){ //name() nos regresa el nombre de la constante enum y esta declarada en la superclase enum
																	//si el puesto es alguno del enum, nos da su sueldo
					System.out.println(eBase.toString()+" $"+p.sueldo()); //imprimimos los datos del empleado y el sueldo que tiene ese puesto
				}
			
			}
		
		}
		

		
		
		
		
		
		
		
		
	}
}
