package nominav2;
/*Santacruz Maldonado Oscar Said				EASA
 * Marrujo Garcia Angel							POO 10:00-11:00
 * Dra Lucia Barron  
 * Clase principal para ejecutar la nomina*/
import java.text.DecimalFormat;
import java.util.*;
import java.util.ArrayList;

public class Principal {
	
	static DecimalFormat Mascara=new DecimalFormat("$###,###.##"); //creamos un formato para las cantidades de dinero
	static Random rnd = new Random (); // clase Random para generar numeros aleatorios
	static Scanner sc = new Scanner (System.in);
	 ArrayList<Empleado> listaEmpleados; //creamos un arraylist que contendr√° empleados
	
	public static void main(String[] args) {
		System.out.println("  Nomina Agricola Rocio, S.A");
		
		Principal principal = new Principal ();
		principal.listaEmpleados = new ArrayList<>(); //creamos un objeto de esta clase que contenga el arraylist
	
		//arrays de los datos necesarios para no teclearlos
		String nombres [] = {"Ana Martinez","Sofi Perez","Pablo Quiroz","Jose Lopez","Juan Rodriguez" ,"Grecia Gomez","Alex Diaz","Luz Torres","Luis Ortiz","Jorge Sanchez","Hylian Perez","Mar Martinez","Leo Romero"}; 
		char sexos [] = {'M','H'};
		String fechasNacimiento [] = {"12/04/2000","07/01/1995","09/10/1990","24/02/1992","20/03/1996","14/10/1987","03/03/2001","01/04/1992","12/01/1979","05/09/1999","19/09/1992","30/05/1994","27/06/1996","23/07/1972","14/05/1976","05/11/1978","30/09/1967","17/08/1974","19/12/1985","08/06/1971","27/03/1982","21/10/1966","12/04/1973","05/09/1988","18/07/1979","03/12/1969","29/05/1977","09/02/1984","26/08/1975","07/01/1965","15/11/1981","02/10/1963","25/06/1970","10/03/1987","01/09/1978","13/07/1966","28/04/1968","16/06/1983","04/08/1973"};
		String [] Puestos ={puestos.DIRECTOR.name(),puestos.JEFE_OFICINA.name(),puestos.SECRETARIO.name(),puestos.PROGRAMADOR.name()
				,puestos.PROGRAMADOR.name(),puestos.PROGRAMADOR.name(),puestos.PROGRAMADOR.name(),puestos.OPERADOR.name(),puestos.OPERADOR.name()
				,puestos.OPERADOR.name(),puestos.INTENDENTE.name(),puestos.INTENDENTE.name(),puestos.INTENDENTE.name()}; 
		
		
		principal.creaEmpleadosBase(principal, nombres, sexos, fechasNacimiento, Puestos); //llamamos al metodo que crea los empleados base
		principal.creaEmpleadosTemporales( principal, sexos, fechasNacimiento); //metodo para crear empledos temporales
		
		
		int opcion = 0;
			while(opcion!=6){
				System.out.println("\n1. Mostrar la nomina");
				System.out.println("2. Agregar empleado temporal");
				System.out.println("3. Eliminar empleado");
				System.out.println("4. Actualizar datos");
				System.out.println("5. Mostrar listado de pago");
				System.out.println("6. Salir");
				
				System.out.println("\n  Ingrese su opcion: ");
				opcion = sc.nextInt();
				
				switch(opcion){
					case 1: principal.imprimeNomina(principal.listaEmpleados,principal); break;
					case 2: principal.agregarEmpleadoTemporal(principal); break;
					case 3: principal.elimarEmpleado(principal); break;
					case 4: principal.actualizarDatos(principal); break;
					case 5: principal.sueldoTotal(principal); break;
						default: System.out.println("Por favor, ingrese una opcion valida.");
						System.out.println("\n\n\n\n\n");
				}
			}
			
		}
		
		
		
		
		
		
	public void actualizarDatos(Principal principal){
		System.out.println("Que tipo de empleado es el que usted desea actualizar? (0 = Base, 1 = Hora, 2 = Dia, 3 = Comision)");
		int tipoEmpleado = sc.nextInt();
		
		switch (tipoEmpleado){
		
		case 0: System.out.println("Usted solamente esta autorizado a cambiar las faltas de los empleados base"); 
			   System.out.print("Ingrese el numero de empleado al que desea cambiarle las faltas: "); int numEmp = sc.nextInt();
				   if(principal.listaEmpleados.get(numEmp) instanceof EmpleadoBase){
						EmpleadoBase e = (EmpleadoBase)principal.listaEmpleados.get(numEmp);
						System.out.println("Ingrese cuantas faltas desea colocarle al empleado: (Limite 14 faltas)");int faltas = sc.nextInt();
						e.setFaltas(faltas);
				   }
					else
						System.out.println("El empleado que usted quiere editar NO es un empleado base");
			
				   break;
		
		case 1:System.out.println("Usted solamente esta autorizado a cambiar las horas trabajadas de los empleados por hora");
		       System.out.println("Ingrese el numero de empleado al que desea cambiarle las horas trabajadas"); numEmp = sc.nextInt();
			       if(principal.listaEmpleados.get(numEmp) instanceof EmpleadoPorHora){
						EmpleadoPorHora e = (EmpleadoPorHora)principal.listaEmpleados.get(numEmp);
						System.out.println("Ingrese cuantas horas trabajadas desea colocarle al empleado: (Limite 120 horas)");int horas = sc.nextInt();
						e.setHoras(horas);
			       }
					else
						System.out.println("El empleado que usted quiere editar NO es un empleado por horas");
				
				break;
				
		case 2: System.out.println("Usted solamente esta autorizado a cambiar los dias trabajados de los empleados por dia");
				System.out.println("Ingrese el numero de empleado al que desea cambiarle los dias trabajados"); numEmp = sc.nextInt();
				       if(principal.listaEmpleados.get(numEmp) instanceof EmpleadoPorDia){
							EmpleadoPorDia e = (EmpleadoPorDia)principal.listaEmpleados.get(numEmp);
							System.out.println("Ingrese cuantos dias trabajados desea colocarle al empleado: (Limite 14 dias)");int dias = sc.nextInt();
							e.setDiasTrabajados(dias);
					   }
					else
						System.out.println("El empleado que usted quiere editar NO es un empleado por dia");
			
			break;
			
			
		case 3: System.out.println("Usted solamente esta autorizado a cambiar las ventas de los empleados por comision");
		System.out.println("Ingrese el numero de empleado al que desea cambiarle las ventas"); numEmp = sc.nextInt();
		       if(principal.listaEmpleados.get(numEmp) instanceof EmpleadoPorComision){
					EmpleadoPorComision e = (EmpleadoPorComision)principal.listaEmpleados.get(numEmp);
					System.out.println("Ingrese cuantas ventas desea colocarle al empleado: ");int ventas = sc.nextInt();
					e.setVentas(ventas);
			   }
			else
				System.out.println("El empleado que usted quiere editar NO es un empleado por comision");
	
		       break;
			
			default: System.out.println("Por favor, ingrese una opcion valida");
			
		}
	}
	
	public void sueldoTotal (Principal principal){
		double contadorSueldos = 0,sueldoTot=0,sueldoDouble=0;
		int sueldoTotal = 0,contador500=0, contador200=0,contador100=0,contador50=0,contador20=0,contador10=0,contador5=0,contador2=0,contador1=0,residuo=0;
		
		for (int i = 0; i < principal.listaEmpleados.size(); i++) {
			sueldoDouble= (principal.listaEmpleados.get(i).sueldo()+principal.listaEmpleados.get(i).bonos()-principal.listaEmpleados.get(i).impuesto()-principal.listaEmpleados.get(i).descuentos());
			sueldoTot = sueldoTot+ principal.listaEmpleados.get(i).sueldo()+principal.listaEmpleados.get(i).bonos()-principal.listaEmpleados.get(i).impuesto()-principal.listaEmpleados.get(i).descuentos();
			sueldoTotal = (int) (principal.listaEmpleados.get(i).sueldo()+principal.listaEmpleados.get(i).bonos()-principal.listaEmpleados.get(i).impuesto()-principal.listaEmpleados.get(i).descuentos());
			
			int billQuinientos =	sueldoTotal /500 ;  residuo = sueldoTotal-(billQuinientos*500);		contador500+=billQuinientos;
			int billDoscientos = residuo/200; residuo = residuo-(billDoscientos*200);					contador200+=billDoscientos;
			int billCien = residuo/100; 				residuo = residuo-(billCien*100);				contador100+=billCien;
			int billCincuenta = residuo/50; 			residuo=residuo-(billCincuenta*50);				contador50+=billCincuenta;
			int billVeinte = residuo/20; 				residuo = residuo-(billVeinte*20);				contador20+=billVeinte;
			int monedaDiez = residuo/10; 				residuo = residuo-(monedaDiez*10);				contador10+=monedaDiez;
			int monedaCinco = residuo/5;			    residuo = residuo-(monedaCinco*5);				contador5+=monedaCinco;
			int monedaDos= residuo/2; 					residuo = residuo-(monedaDos*2);				contador2+=monedaDos;
			int monedaUno = residuo/1; 					residuo = residuo-(monedaUno*1);				contador1+=monedaUno;
			
			contadorSueldos = (contadorSueldos)+ (sueldoDouble-sueldoTotal);
		}
		
		System.out.println("El sueldo total a pagar de todos los empleados es de: "+Mascara.format(sueldoTot));
		
	System.out.println("\n\tDENOMINACION \tCANTIDAD \tTOTAL");
	
	
	
	
	System.out.println("\t$500 \t\t"+contador500+"\t\t"+Mascara.format(500*contador500));
	System.out.println("\t$200 \t\t"+contador200+"\t\t"+Mascara.format(200*contador200));
	System.out.println("\t$100 \t\t"+contador100+"\t\t"+Mascara.format(100*contador100));
	System.out.println("\t$50 \t\t"+contador50+ "\t\t$"+50*contador50);
	System.out.println("\t$20 \t\t"+contador20+"\t\t$"+20*contador20);
	System.out.println("\t$10 \t\t"+contador10+"\t\t$"+10*contador10);
	System.out.println("\t$5 \t\t"+contador5+"\t\t$"+5*contador5);
	System.out.println("\t$2 \t\t"+contador2+"\t\t$"+2*contador2);
	System.out.println("\t$1 \t\t"+contador1+ "\t\t$"+1*contador1);
	
	
	System.out.println("\nDonacion para la cruz roja: "+(Mascara.format(contadorSueldos)));
	System.out.println("\n\n\n\n\n\n");
	}
	
	public void elimarEmpleado(Principal principal){
		System.out.println("øIngrese el numero de empleado que desea eliminar: ");
		int numEmpEliminar = sc.nextInt();
		boolean flag = false;
		
		for (int i = 0; i < principal.listaEmpleados.size(); i++) {
			if(principal.listaEmpleados.get(i).getNumeroEmpleado()==numEmpEliminar){
				principal.listaEmpleados.remove(i);
				System.out.println("El empleado se eliminÛ con exito");
				flag = true;
				break;
			}
		}
		
		if(flag == false){
			System.out.println("No se pudo encontrar a un empleado con ese numero de empleado.");
		}
		System.out.println("\n\n\n\n\n\n");
	}
	
	public void agregarEmpleadoTemporal(Principal principal){
		System.out.println ("øQue tipo de empleado temporal desea agregar? (1 = Hora, 2 = Dia, 3 = Comision)");
		int emp = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingrese el nombre del empleado: ");
		String nombre = sc.nextLine(); // arrgelo para guardar los nombres que se ingresen
		
		System.out.println("Ingrese el sexo del empleado (H = Hombre ,M = Mujer): ");
		char s = sc.nextLine().charAt(0); //
		
		System.out.println("Ingrese la fecha de nacimiento del empleado: (DD/MM/AAAA)");
		String fechaNac = sc.nextLine();
		
		switch (emp){
			case 1: System.out.println("Cuantas horas trabajo el empleado en la quincena? (Limite 120)");
					int horas = sc.nextInt();
					Empleado ehora = new EmpleadoPorHora(nombre,s,fechaNac,principal.listaEmpleados.size(),horas);
					principal.listaEmpleados.add(ehora);
					break;
					
			case 2: System.out.println("Cuantos dias trabajo el empleado en la quincena? (Limite 14)");
					int dias = sc.nextInt();
					Empleado edia = new EmpleadoPorDia (nombre,s,fechaNac,principal.listaEmpleados.size(),dias);
					principal.listaEmpleados.add(edia);
					break;
					
			case 3:System.out.println("Ingrese las ventas del empleado: ");
				   double ventas = sc.nextDouble();
				   Empleado ecomision = new EmpleadoPorComision (nombre,s,fechaNac,principal.listaEmpleados.size(),ventas);
				   principal.listaEmpleados.add(ecomision);
				   break;
		}
		System.out.println("\n\n\n\n\n\n");
	}
	
	public void creaEmpleadosBase( Principal principal,String [] nombres, char [] sexos, String [] fechasNacimiento, String [] Puestos){
		int [] nombresAzar = arrayAzar(13), fechasAzar = arrayAzar(13),sueldosAzar = arrayAzar(13);
		for(int i=0;i<13;i++){
			//creamos los 13 empleados
			
			Empleado eBase = new EmpleadoBase(nombres[nombresAzar[i]], sexos[rnd.nextInt(2)], fechasNacimiento[fechasAzar[i]], i, Puestos[sueldosAzar[i]]);;
			principal.listaEmpleados.add(eBase); //los agregamos al arraylist
			
			
		}
	}
	
	public void creaEmpleadosTemporales ( Principal principal, char [] sexos, String fechasNacimiento []) {
		String[] nombresTemporales  ={"Juan LeÛn","Ana RuÌz","Pedro Ortega","Eva Soto","Carlos Li","Luisa Kim","Miguel Tan","Sara Wongt","Javier Ma",
				"MarÌa Kao","Pablo Li","Lorena Yu","AndrÈs Chen","LucÌa Wu","Diego Ko","Rosa Lam","Manuel Chou","Isabel Su","Raul Wongt",
				"Laura Kim","David Lu","Marta Chu","Andrea Ho","Alejandro Hu","Silvia Su","Pancho Perez","Pedro Julian"};
		int []  fechasAzar = principal.arrayAzar(25); // i es la cantidad de veces que se repitio el ciclo, y la cantidad de empleados temporales
		int [] nombresAzar = principal.arrayAzar(25);
		
		for (int j =0; j<25; j++) {
			int tipoEmpleado = rnd.nextInt(2);
			
			//public EmpleadoPorHora(String nombre,char sexo,String fechaNacimiento, int numEmpleado, int horas) 
			if (tipoEmpleado==0) {
				Empleado ehora = new EmpleadoPorHora (nombresTemporales[nombresAzar[j]]+" H",sexos[rnd.nextInt(2)], fechasNacimiento[fechasAzar[j]], j +13,rnd.nextInt(120));// 
				principal.listaEmpleados.add(ehora);
			}
			
			//public EmpleadoPorDia (String nombre,char sexo,String fechaNacimiento, int numEmpleado, int dias) {
			if (tipoEmpleado==1) {
				Empleado edia = new EmpleadoPorDia (nombresTemporales[nombresAzar[j]]+" D",sexos[rnd.nextInt(2)], fechasNacimiento[fechasAzar[j]], j+13,rnd.nextInt(14));
				principal.listaEmpleados.add(edia);
			}
			
			//public EmpleadoPorComision(String nombre, char sexo, String fechaNacimiento, int numeroEmpleado, double ventas) {
			if (tipoEmpleado==2){
				Empleado ecomision = new EmpleadoPorComision (nombresTemporales[nombresAzar[j]]+" C",sexos[rnd.nextInt(2)], fechasNacimiento[fechasAzar[j]], j+13,rnd.nextInt(100000));
				principal.listaEmpleados.add(ecomision);
			}
		}
	}
	
	public void asignarFaltas (ArrayList<Empleado> listaEmpleados) {
		
		for (int i =0; i<listaEmpleados.size();i++) {
			if (listaEmpleados.get(i) instanceof EmpleadoBase) { // comprobar si es una instancia
				EmpleadoBase e = (EmpleadoBase)listaEmpleados.get(i);
			( (EmpleadoBase) listaEmpleados.get(i)).setFaltas(rnd.nextInt(2));
			System.out.println("El empleado "+e.getNumeroEmpleado()+" tiene "+e.getFaltas()+" faltas");// casteamos para convertir el tipo estatico a EmpleadoBase
			}
		}
	}
	
	public void imprimeNomina(ArrayList<Empleado> listaEmpleados, Principal principal){
		double contadorTotSueldos = 0,contador=0, contadorTotSueldosBrutos = 0, contadorTotDescuentos = 0, contadorTotImpuestos = 0, contadorTotBonos = 0;
		
		principal.asignarFaltas(principal.listaEmpleados);
		
		System.out.println("\t\t\t\t\t\t\tAgricola Del Valle, S.A."
				+ "\n\t\t\t\t\t\t\t  Nomina de empleados"
				+ "\n\t\t\t\t\tcorrespondiente a la quincena del dia _ al dia_ de mes__ de a√±o\n");
		System.out.println("\tNUM EMPLEADO \tNOMBRE Y APELLIDO \tSEXO \tSUELDO BRUTO \tDESCUENTOS \tBONOS \t\tIMPUESTOS \tSUELDO TOTAL");
		//LOS DESCUENTOS SE AGREGARON TEMPORALMENTE PARA COMPROBAR QUE DEN LOS CALCULOS
		for (int i = 0; i < listaEmpleados.size(); i++) {
			
			String formato = "\t%d\t\t%s\t\t%c\t%s\t\t%s\t%s\t\t%s\t\t%s"; //definimos el formato que tendr√° la salida
			
			if(listaEmpleados.get(i).descuentos()<=1000 || listaEmpleados.get(i).descuentos()%10 == 0) //arregla error de cuadre en los descuentos cuando tiene menos de 4 digitos
				formato = "\t%d\t\t%s\t\t%c\t%s\t\t%s\t\t%s\t\t%s\t\t%s";
			
			//llamamos al printf y le pasamos todos los valores que establecimos
			System.out.printf(formato,listaEmpleados.get(i).getNumeroEmpleado(),listaEmpleados.get(i).getNombreApellido(),listaEmpleados.get(i).getSexo(),
					Mascara.format(listaEmpleados.get(i).sueldo()),Mascara.format(listaEmpleados.get(i).descuentos()),Mascara.format(listaEmpleados.get(i).bonos())
					,Mascara.format(listaEmpleados.get(i).impuesto()),Mascara.format(listaEmpleados.get(i).sueldo() +listaEmpleados.get(i).bonos()-listaEmpleados.get(i).impuesto()-
							listaEmpleados.get(i).descuentos()));
				System.out.println();	
			
			contadorTotSueldos = listaEmpleados.get(i).sueldo() +listaEmpleados.get(i).bonos()-listaEmpleados.get(i).impuesto()-
					listaEmpleados.get(i).descuentos();
			contador+=contadorTotSueldos;
			
			contadorTotSueldosBrutos += listaEmpleados.get(i).sueldo();
			contadorTotDescuentos += listaEmpleados.get(i).descuentos();
			contadorTotImpuestos += listaEmpleados.get(i).impuesto();
			contadorTotBonos += listaEmpleados.get(i).bonos();
				
		}
		System.out.println("\t\t\t\t\t\tTOTALES\t"+Mascara.format(contadorTotSueldosBrutos)+"\t"+Mascara.format(contadorTotDescuentos)+"\t"+Mascara.format(contadorTotBonos)+"\t\t"+Mascara.format(contadorTotImpuestos)+"\t"+Mascara.format(contador));
		System.out.println("\n\n\n\n\n\n");
	}
	
	public int [] arrayAzar(int posiciones){ //se generaran numeros aleatorios de 0 a posiciones
		 List<Integer> listaNumeros = new ArrayList <Integer>(); //creamos una lista que contenga un arraylist de tipo Integer
		 /*Lo hacemos de esta forma ya que las listas estan dise√±adas para guardar objetos, no datos como int, double o boolean
		  * por lo que usamos clases envolventes */
		
		for (int i = 0; i < posiciones; i++) {
			listaNumeros.add(i);	//agregamos valores del 0 a el valor de posiciones y los agregamos a la lista
		}
		
		Collections.shuffle(listaNumeros);	//usamos el metodo shuffle de la clase collections que nos permite mezclar el contenido de la lista
		Integer[] arrayInteger = new Integer[listaNumeros.size()]; //declaramos un array de tipo integer que tenga el tama√±o de la lista
		listaNumeros.toArray(arrayInteger); //con el metodo toArray de la clase list pasamos todo el contenido de la lista al array "arrayAzar"
		
		int [] arrayAzar = new int [arrayInteger.length];
		
		for (int i = 0; i < arrayAzar.length; i++) { //pasamos lo que esta contenido en el array de Integers a un array de int
			arrayAzar [i] = arrayInteger[i].intValue(); //el metodo intValue nos regresa el valor del Integer y lo guardamos en el array de int
		}
		
		return arrayAzar;//regresamos este array
	}
}

