package nominav2;
/*Santacruz Maldonado Oscar Said				EASA
 * Marrujo Garcia Angel							POO 10:00-11:00
 * Dra Lucia Barron  
 * Clase que define el comportamiento del empleado por comision*/

public class EmpleadoPorComision extends Empleado {

	private double ventasPeriodo;
	
	public EmpleadoPorComision(String nombre, char sexo, String fechaNacimiento, int numeroEmpleado, double ventas) {
		super(nombre, sexo, fechaNacimiento, numeroEmpleado);
		this.ventasPeriodo = ventas;
		
	}
	public void setVentas(double ventas){
		ventasPeriodo = ventas;
	}
	public double getVentas () {
	 return this.ventasPeriodo;
	}
	
	public double sueldo() {
		
		return this.ventasPeriodo*0.10; // el sueldo se calculo con el 10% de las ventas
	}

	
	public double descuentos() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public double bonos() {
		if (this.ventasPeriodo>50000) { // si un empleado vende mas de 50,000 se le da un bono de 500
			return 500; 
		}
		return 0;
	}

	
	
	public String toString() {
		return super.toString() ;
	}
	}
