package NominaRocioSA;
import java.text.DecimalFormat;
/*Santacruz Maldonado Oscar Said
 *PON TU NOMBRE COMPLETO AQUI
 *Proyecto 2 Nomina 2023
 *Programación Orientada a Objetos    Dra Maria Lucia Barron Estrada
 *Esta es la clase que se encargará de ejecutar el proyecto y usar a las demas clases con un metodo main, el 
 *objetivo de este proyecto es demostrar y usar caracteristicas tanto de herencia como de polimorfismo, asi como de 
 *conceptos aprendidos anteriormente*/
import java.util.*;

public class Principal {
	
	static DecimalFormat Mascara=new DecimalFormat("$###,###.##"); //creamos un formato para las cantidades de dinero
	static Random rnd = new Random (); // clase Random para generar numeros aleatorios
	 ArrayList<Empleado> listaEmpleados; //creamos un arraylist que contendrá empleados
	
	public static void main(String[] args) {
		
		Principal principal = new Principal ();
		principal.listaEmpleados = new ArrayList<>(); //creamos un objeto de esta clase que contenga el arraylist
		
		//arrays de los datos necesarios para no teclearlos
		String nombres [] = {"Ana Martinez","Sofi Perez","Pablo Quiroz","Jose Lopez","Juan Rodriguez" ,"Grecia Gomez","Alex Diaz","Luz Torres","Luis Ortiz","Jorge Sanchez","Hylian Perez","Mar Martinez","Leo Romero"}; 
		char sexos [] = {'M','H'};
		String fechasNacimiento [] = {"12/04/2000","07/01/1995","09/10/1990","24/02/1992","20/03/1996","14/10/1987","03/03/2001","01/04/1992","12/01/1979","05/09/1999","19/09/1992","30/05/1994","27/06/1996"};
		double[] sueldosPuestos ={puestos.director.getSueldoEnum(),puestos.jefe_oficina.getSueldoEnum(),puestos.secretario.getSueldoEnum(),puestos.programador.getSueldoEnum()
				,puestos.programador.getSueldoEnum(),puestos.programador.getSueldoEnum(),puestos.programador.getSueldoEnum(),puestos.operador.getSueldoEnum(),puestos.operador.getSueldoEnum()
				,puestos.operador.getSueldoEnum(),puestos.intendente.getSueldoEnum(),puestos.intendente.getSueldoEnum(),puestos.intendente.getSueldoEnum()}; 
		
		principal.creaEmpleadosBase(principal, nombres, sexos, fechasNacimiento, sueldosPuestos); //llamamos al metodo que crea los empleados base
		principal.imprimeNomina(principal.listaEmpleados);
	
		
		
	}
	
	public void creaEmpleadosBase(Principal principal,String [] nombres, char [] sexos, String [] fechasNacimiento,double [] sueldosPuestos){
		int [] nombresAzar = arrayAzar(13), fechasAzar = arrayAzar(13),sueldosAzar = arrayAzar(13);
		for(int i=0;i<13;i++){
			//creamos los 13 empleados
			Empleado eBase = new EmpleadoBase(nombres[nombresAzar[i]], sexos[rnd.nextInt(2)], fechasNacimiento[fechasAzar[i]], rnd.nextInt(100), rnd.nextInt(15),sueldosPuestos[sueldosAzar[i]]);
			principal.listaEmpleados.add(eBase); //los agregamos al arraylist
		}
	}
	
	public void imprimeNomina(ArrayList<Empleado> listaEmpleados){
		
		System.out.println("\t\t\t\t\t\t\tAgricola Del Valle, S.A."
				+ "\n\t\t\t\t\t\t\t  Nomina de empleados"
				+ "\n\t\t\t\t\tcorrespondiente a la quincena del dia __ al dia__ de mes__ de año\n");
		System.out.println("\tNUM EMPLEADO \tNOMBRE Y APELLIDO \tSEXO \tSUELDO BRUTO \tDESCUENTOS \tBONOS \t\tIMPUESTOS \tSUELDO TOTAL");
		//LOS DESCUENTOS SE AGREGARON TEMPORALMENTE PARA COMPROBAR QUE DEN LOS CALCULOS
		for (int i = 0; i < listaEmpleados.size(); i++) {
			
			String formato = "\t%d\t\t%s\t\t%c\t%s\t\t%s\t%s\t\t%s\t\t%s"; //definimos el formato que tendrá la salida
			
			if(listaEmpleados.get(i).descuentos()<=1000 || listaEmpleados.get(i).descuentos()%10 == 0) //arregla error de cuadre en los descuentos cuando tiene menos de 4 digitos
				formato = "\t%d\t\t%s\t\t%c\t%s\t\t%s\t\t%s\t\t%s\t\t%s";
			
			
		
			//llamamos al printf y le pasamos todos los valores que establecimos
		System.out.printf(formato,listaEmpleados.get(i).getNumeroEmpleado(),listaEmpleados.get(i).getNombreApellido(),listaEmpleados.get(i).getSexo(),
				Mascara.format(listaEmpleados.get(i).sueldoBruto()),Mascara.format(listaEmpleados.get(i).descuentos()),Mascara.format(listaEmpleados.get(i).bonos())
				,Mascara.format(listaEmpleados.get(i).impuesto()),Mascara.format(listaEmpleados.get(i).sueldo()));
			System.out.println();
		}
	}
	
	public int [] arrayAzar(int posiciones){ //se generaran numeros aleatorios de 0 a posiciones
		 List<Integer> listaNumeros = new ArrayList <Integer>(); //creamos una lista que contenga un arraylist de tipo Integer
		
		for (int i = 0; i < posiciones; i++) {
			listaNumeros.add(i);	//agregamos valores del 0 a el valor de posiciones y los agregamos a la lista
		}
		
		Collections.shuffle(listaNumeros);	//usamos el metodo shuffle de la clase collections que nos permite mezclar el contenido de la lista
		Integer[] arrayInteger = new Integer[listaNumeros.size()]; //declaramos un array de tipo integer que tenga el tamaño de la lista
		listaNumeros.toArray(arrayInteger); //con el metodo toArray de la clase list pasamos todo el contenido de la lista al array "arrayAzar"
		
		int [] arrayAzar = new int [arrayInteger.length];
		
		for (int i = 0; i < arrayAzar.length; i++) {
			arrayAzar [i] = arrayInteger[i].intValue();
		}
		
		return arrayAzar;//regresamos este array
	}
	
}
