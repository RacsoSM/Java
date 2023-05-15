package T8;
/*Santacruz Maldonado Oscar Said 	POO 		10-11
 *Maestra Lucia Barron*/

public class EmpleadoBase extends Empleado{

	private String puesto;
	
    public EmpleadoBase(String nombre, char sexo, String fechaNacimiento, int numeroEmpleado,String puesto) { //constructor del empleadoBase
        super(nombre, sexo, fechaNacimiento, numeroEmpleado); //mandamos llamar al constructor de empleado
        this.puesto=puesto;
    }
   
	public double sueldo(){ //sobreescribimos el metodo sueldo para el empleado base
		double sueldo=0;
		
		switch (puesto){
		case "DIRECTOR":
		case "DIRECTORA": sueldo=12000; break;
		case "JEFE_OFICINA":
		case "JEFA_OFICINA": sueldo=5000; break;
		case "PROGRAMADOR":
		case "PROGRAMADORA": sueldo=8000; break;
		case "OPERADOR":
		case "OPERADORA": sueldo=3500; break;
		case "INTENDENTE": 
		case "INTENDENTA": sueldo=2300; break;
		case "SECRETARIO":
		case "SECRETARIA": sueldo=2500; break;
		}
		        return sueldo; 	//El sueldo fijo de los empleados base sera de 9500
	}
	
	public String toString (){
		return super.toString()+ " "+puesto;
	}
}



