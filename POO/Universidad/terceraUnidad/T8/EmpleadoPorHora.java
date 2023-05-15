package T8;
/*Santacruz Maldonado Oscar Said 	POO 		10-11
 *Maestra Lucia Barron*/
public class EmpleadoPorHora extends Empleado{

	private int horas;
	private double tarifa;
	
	 public EmpleadoPorHora(String nombre, char sexo, String fechaNacimiento, int numeroEmpleado,int horas, double tarifa) { //constructor del empleadoBase
	        super(nombre, sexo, fechaNacimiento, numeroEmpleado); //mandamos llamar al constructor de empleado
	        this.horas=horas;
	        this.tarifa=tarifa;
	 }
	 
	 public double sueldo(){
		 return horas*tarifa;
	 }
	   
	 public int getHoras(){
		 return horas;
	 }
	 public void setHoras(int nvasHoras){
		 horas=nvasHoras;
	 }
	 
	 public double getTarifa(){
		 return tarifa;
	 }
	 public void setTarifa(double nvaTarifa){
		 tarifa=nvaTarifa;
	 }
	 
	 public String toString(){
		 return super.toString()+" "+horas+" horas "+"\t$"+tarifa+" tarifa";
	 }
}
