package nominav2;
/*Santacruz Maldonado Oscar Said				EASA
 * Marrujo Garcia Angel							POO 10:00-11:00
 * Dra Lucia Barron  
 * Clase que define el comportamiento del empleado por dia*/

public class EmpleadoPorDia extends Empleado {
	private int diasTrabajados ;
		
	
	public EmpleadoPorDia (String nombre,char sexo,String fechaNacimiento, int numEmpleado, int dias) {
		super(nombre,sexo,fechaNacimiento, numEmpleado);
	
			this.diasTrabajados= dias;
		}

		public int getDiasTrabajados () {
		return this.diasTrabajados;
		}
		public void setDiasTrabajados(int nvosDias){
			diasTrabajados = nvosDias;
		}

		
		public double sueldo() { 
			// metodo para calcular el sueldo de los empleados
			return this.diasTrabajados*300;
		}

		
		public double descuentos() {
			return 0;
		}

		
		public double bonos() {
			if (this.diasTrabajados>= 10) { // si un empleado trabaja 10 o mas dias se le dan 400 de bono 
				return 400;
			}
			return 0;
		}

		
		
		public String toString() {
			return super.toString() ;
		}
}