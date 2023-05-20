package nominav2;
/*Santacruz Maldonado Oscar Said				EASA
 * Marrujo Garcia Angel							POO 10:00-11:00
 * Dra Lucia Barron  
 * Clase que define el comportamiento del empleado por hora*/

public class EmpleadoPorHora extends Empleado{
	private int horasTrabajadas =0; //horas que ha trabajados el empleado por horas
	
	public EmpleadoPorHora(String nombre,char sexo,String fechaNacimiento, int numEmpleado, int horas) {		
		super(nombre,sexo,fechaNacimiento, numEmpleado);// llamamos al constructor de la clase padre  
		this.horasTrabajadas = horas;
		}
	
	public void setHoras(int nvaHoras){
		horasTrabajadas = nvaHoras;
	}
	
	public int getHorasTrabajadas () {
		return this.horasTrabajadas;
	}
	
	public double sueldo() {
		if (this.horasTrabajadas>80) {// ya que las horas extras se pagan en 50
			 return (40*80) + ((this.horasTrabajadas - 80)*(50));
		}
		return this.horasTrabajadas*40;
	}
	public double descuentos() { 
		
		return 0;
	}
	
	public double bonos() {
		if (this.horasTrabajadas >= 40 && getSexo() == 'M') {// si una mujer trabajo  40 0  mas horas se le dan 2 bonos de 300
			return 600;
		}
		else if (this.horasTrabajadas>=40){
			return 300; // si un hombre trabaja 40 o mas horas se le da un bono de 300
		}
		return 0;
	}
		
	
	
	public String toString() {
		return super.toString();
	}
}