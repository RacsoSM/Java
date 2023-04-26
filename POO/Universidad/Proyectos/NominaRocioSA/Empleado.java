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
	

	
	abstract public double sueldo (); //declaramos el metodo sueldo como abstracto
	
	public String toString(){
		return super.toString()+" "+numeroEmpleado+" ";
	}
}
