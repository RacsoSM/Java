package segundaUnidad;
import java.util.*;

public class pruebas {
	
	public static int calcularEdad(int diaNacimiento, int mesNacimiento, int yearNacimiento){
		
		Calendar c = Calendar.getInstance(); //obtenemos la fecha actual con el metodo getInstance de la clase calendar

		int day, month, year,edadYears,edadMonths;
		
			
		day = c.get(Calendar.DATE); //obtenemos el dia con el metodo get del calendario
		month = c.get(Calendar.MONTH); //obtenemos el mes con el metodo get del calendario
		year = c.get(Calendar.YEAR); //obtenemos el a�o con el metodo get del calendario
		
		edadYears=year-yearNacimiento; //suponemos que la persona ya cumplio a�os este a�o
		edadMonths=month-mesNacimiento;
		
		if(mesNacimiento>month) { 	//si no los ha cumplido, hacemos las correcciones necesarias
			edadYears--;
			edadMonths = 12+edadMonths;
		}
		
		if(diaNacimiento<day)
			edadMonths++;
		
		if(edadMonths>=12){
			edadYears++;
			edadMonths=0;
		}
			
		System.out.println("actualmente usted tiene "+edadYears+" años, "+edadMonths+" meses");
		
		
		
		return edadYears; //regresamos la edad en a�os
	}

	//metodo para calcular el area de un cuadrado
	public static double calcularAreaCuadrado(double lado){
		double area = lado*lado;
		return area;
	}
	
	//metodo para calcular el perimetro de un cuadrado
	public static double calcularPerimetroCuadrado(double lado){
		double perimetro = lado*4;
		return perimetro;
	}

	//metodo para calcular el area de un triangulo
	public static double calcularAreaTriangulo(double base,double altura){
		double area = base*altura/2;
		return area;
	}

	//main en el que llamamos e imprimimos los metodos
	public static void main(String[] args) {
		System.out.println("usted tiene "+calcularEdad(30,5,2004)+" años");
	
		
	}
		
	//System.out.println("el area del cuadrado es de "+calcularAreaCuadrado(5.2));
	//System.out.println("el perimetro del cuadrado es de "+calcularPerimetroCuadrado(5.2));
	//System.out.println("el area del triangulo es "+calcularAreaTriangulo(8, 10));
		
	//System.out.println("usted tiene "+calcularEdad(30,5,2004)+" años");
		
		
		/*ArrayList<Persona2> lista = new ArrayList<Persona2>();
		Scanner sc = new Scanner (System.in); //declaramos el scanner
		
		String nombre,personaJoven="";
		int edad,contadorMujeres=0,contadorMenoresEdad=0,contadorEdadTotal=0,k=1000,contadorAdultosMayores=0,agregar=1,i=0;
		double promedioEdad=0;
		char sexo;
		
		
		do{
			
			System.out.println("Datos de la persona numero "+(i+1)); //pedimos los datos de la persona
			i++;
			
			System.out.print("Ingrese el nombre: ");
			nombre=sc.nextLine();
			
			System.out.print("Ingrese el sexo: ");
			sexo=sc.nextLine().charAt(0);
			
			System.out.print("Ingrese la edad: ");
			edad=sc.nextInt();
			sc.nextLine();
			System.out.println("\n\n");
			
			Persona2 persona = new Persona2 (nombre,sexo,edad);	//creamos el objeto
			lista.add(persona);	//agregamos a la persona al arraylist
			
			System.out.println("Desea agregar a una persona mas? (0 = NO, 1 = SI) ");
			agregar=sc.nextInt();
			sc.nextLine();
		}while (agregar!=0);*/
		
		
		//System.out.println(lista.toString());
	
}

