package nominav2;
/*Santacruz Maldonado Oscar Said				EASA
 * Marrujo Garcia Angel							POO 10:00-11:00
 * Dra Lucia Barron  
 * Clase que define el comportamiento del empleado base*/

public class EmpleadoBase extends Empleado {
	private String puesto;
	private int faltas;
	
	//declaramos un atributo puesto para el empleadoBase
	
    public EmpleadoBase(String nombre, char sexo, String fechaNacimiento, int numeroEmpleado, String puesto) { //constructor del empleadoBase
        super(nombre, sexo, fechaNacimiento, numeroEmpleado); //mandamos llamar al constructor de empleado
        this.puesto = puesto;
        
    }
   
    public void setFaltas (int faltas) {
    	this.faltas= faltas; // metodo para cambiar faltas del objeto en ejecucion
    }
    
    public int getFaltas () {
    	return this.faltas;
    }
    public double sueldo(){ //sobreescribimos el metodo sueldoBruto para el empleado base
		double sueldoBase = 0.0;
        switch (puesto){
            case "SECRETARIO":  sueldoBase = puestos.SECRETARIO.getSueldoEnum();  break;
            case "INTENDENTE":  sueldoBase = puestos.INTENDENTE.getSueldoEnum();  break;
            case "OPERADOR":    sueldoBase = puestos.OPERADOR.getSueldoEnum() ;   break;   
            case "PROGRAMADOR": sueldoBase = puestos.PROGRAMADOR.getSueldoEnum(); break;
            case "JEFE_OFICINA":sueldoBase = puestos.JEFE_OFICINA.getSueldoEnum();break;
            case "DIRECTOR":    sueldoBase = puestos.DIRECTOR.getSueldoEnum(); break;
            default: System.out.println("Puesto no válido");break;
        }
        return sueldoBase;//metodo para regresar el sueldo bruto
	}

   public double descuentos(){ //sobreescribimos el metodo descuentos para el empleado base
		return (this.sueldo()/14) * this.faltas;
	}
    
    
    
   
    public double bonos() { //sobreescribimos el metodo bonos para el empleado base
    
    	return 0;			//EL EMPLEADO BASE NO TIENE BONOS
    }
    
  
	public String toString() {
		return super.toString() +" fatlas " + this.faltas;
	}
	
}
