package nominav2;

public enum puestos {
	//porque una clase enum no puede tener herencia
		SECRETARIO(2500.0),	//declaramos el sueldo quincenal de cada puesto
		INTENDENTE(2300.0),
		OPERADOR(3500.0),
		PROGRAMADOR(8000.0),
		JEFE_OFICINA(5000.0),
		DIRECTOR(12000.0);
		
		
		private double sueldoEnum; //declaramos el sueldo como privado
		
		private puestos(double sueldoEnum){	//declaramos el constructor como privado porque asi lo requieren las clases enum
			this.sueldoEnum=sueldoEnum;
		}
		
		public double getSueldoEnum(){ //metodo publico para acceder al sueldo
			return sueldoEnum;
		}
}
