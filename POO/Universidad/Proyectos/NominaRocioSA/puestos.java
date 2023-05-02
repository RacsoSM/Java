package NominaRocioSA;

public enum puestos{ //clase enum anidada porque una clase enum no puede tener herencia
	secretario(2500.0),	//declaramos el sueldo quincenal de cada puesto
	intendente(2300.0),
	operador(3500.0),
	programador(8000.0),
	jefe_oficina(5000.0),
	director(12000.0);
	
	
	private double sueldoEnum; //declaramos el sueldo como privado
	
	private puestos(double sueldoEnum){	//declaramos el constructor como privado porque asi lo requieren las clases enum
		this.sueldoEnum=sueldoEnum;
	}
	
	public double getSueldoEnum(){ //metodo publico para acceder al sueldo
		return sueldoEnum;
	}
} //termina la clase enum
