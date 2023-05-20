package nominav2;
/*Santacruz Maldonado Oscar Said				EASA
 * Marrujo Garcia Angel							POO 10:00-11:00
 * Dra Lucia Barron  
 * Clase que define la estructura de todos los empleados*/

public abstract class Empleado extends Persona {
private int numeroEmpleado = 0; //declaramos atributo de empleado
	
	public Empleado (String nombre,char sexo,String fechaNacimiento,int numeroEmpleado){ //constructor de empleado
		super(nombre,sexo,fechaNacimiento);
		this.numeroEmpleado = numeroEmpleado;
	}
	
	public int getNumeroEmpleado(){ //get de numero de empleado
		return numeroEmpleado;
	}
	abstract public double sueldo (); //declaramos el metodo sueldo como abstracto; calcula el sueldo de un empleado
	abstract public double descuentos();//ESTE METODO SE BORRARA EN EL PROGRAMA FINAL, SOLO ES PARA COMPROBAR QUE SI SALGAN LAS CUENTAS
	abstract public double bonos();	//TODOS LOS EMPLEADOS DEBEN TENER BONOS, SUELDO, SUELDO BRUTO E IMPUESTOS, ASI EL VALOR SEA 0
	public double impuesto() {
		if ((this.sueldo()+this.bonos())> 800) {// si el sueldo es mayor a 800 se paga 3% de impuesto 
			return (this.sueldo()+this.bonos())*0.03;
		}
		return 0;
	} //declaramos tambien el metodo impuesto 
	public String toString(){
		return "\t"+numeroEmpleado+super.toString();
	}
}
