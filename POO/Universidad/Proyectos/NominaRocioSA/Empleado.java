package NominaRocioSA;

public abstract class Empleado extends Persona{
	private int numeroEmpleado = 0; //declaramos atributo de empleado
	
	public Empleado (String nombre,char sexo,String fechaNacimiento,int numeroEmpleado){ //constructor de empleado
		super(nombre,sexo,fechaNacimiento);
		this.numeroEmpleado = numeroEmpleado;
	}
	
	public int getNumeroEmpleado(){ //get de numero de empleado
		return numeroEmpleado;
	}
	
	abstract public double descuentos();//ESTE METODO SE BORRARA EN EL PROGRAMA FINAL, SOLO ES PARA COMPROBAR QUE SI SALGAN LAS CUENTAS
	abstract public double bonos();	//TODOS LOS EMPLEADOS DEBEN TENER BONOS, SUELDO, SUELDO BRUTO E IMPUESTOS, ASI EL VALOR SEA 0
	abstract public double sueldo (); //declaramos el metodo sueldo como abstracto
	abstract public double sueldoBruto();
	abstract public double impuesto(); //declaramos tambien el metodo impuesto 
	
	public String toString(){
		return "\t"+numeroEmpleado+super.toString();
	}
}
