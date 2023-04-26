package NominaRocioSA;

public class EmpleadoBase extends Empleado{
	
	public enum puestos{ //clase enum anidada porque una clase enum no puede tener herencia
		secretaria(2500.0),secretario(2500.0),	//declaramos el sueldo quincenal de cada puesto
		intendente(2300.0),
		operador(3500.0),operadora(3500.0),
		programador(8000.0),programadora(8000.0),
		jefe_oficina(5000.0),
		director(12000.0),directora(12000.0);
		
		
		private double sueldoEnum; //declaramos el sueldo como privado
		
		private puestos(double sueldoEnum){	//declaramos el constructor como privado porque asi lo requieren las clases enum
			this.sueldoEnum=sueldoEnum;
		}
		
		public double sueldo(){ //metodo publico para acceder al sueldo
			return sueldoEnum;
		}
	} //termina la clase enum
	
	private String puesto; //declaramos un atributo puesto para el empleadoBase
	
    public EmpleadoBase(String nombre, char sexo, String fechaNacimiento, int numeroEmpleado, String puesto) { //constructor del empleadoBase
        super(nombre, sexo, fechaNacimiento, numeroEmpleado); //mandamos llamar al constructor de empleado
        this.puesto = puesto;
    }
    
    public String getPuesto(){
    	return puesto;
    }

	public double sueldo(){ //aun no se como hacer este metodo
		return 0.0;
	}
	
	public String toString (){
		return super.toString()+puesto;
	}
}
