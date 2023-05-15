package T8;
/*Santacruz Maldonado Oscar Said 	POO 		10-11
 *Maestra Lucia Barron*/
public class EmpleadoComision extends Empleado{
	
	private double porcentaje;
	private double ventas;
	
	public EmpleadoComision (String nombre, char sexo, String fechaNacimiento, int numeroEmpleado, int porcentaje, double ventas){
		super(nombre,sexo,fechaNacimiento,numeroEmpleado);
		this.porcentaje=porcentaje;
		this.ventas=ventas;
	}
	
	/* public double sueldo(){
		 return horas*tarifa;
	 }*/
	
	public double sueldo(){
		
		return porcentaje/100*ventas;
	}
	
	public double getPorcentaje(){
		return porcentaje;
	}
	public void setPorcentaje(int nvoPorcentaje){
		porcentaje=nvoPorcentaje;
	}
	
	public double getVentas(){
		return ventas;
	}
	public void setVentas(double nvasVentas){
		ventas=nvasVentas;
	}
	
	public String toString(){
		return super.toString()+" ventas $"+ventas+"\t porcentaje %"+porcentaje;
	}
	
}
