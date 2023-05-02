package NominaRocioSA;

public class EmpleadoBase extends Empleado{

	private int faltas;
	private double sueldoBruto;
	//declaramos un atributo puesto para el empleadoBase
	
    public EmpleadoBase(String nombre, char sexo, String fechaNacimiento, int numeroEmpleado,int faltas,double sueldoBruto) { //constructor del empleadoBase
        super(nombre, sexo, fechaNacimiento, numeroEmpleado); //mandamos llamar al constructor de empleado
        this.faltas=faltas;
        this.sueldoBruto=sueldoBruto;
    }
    
    public double impuesto(){ //sobreescribimos el metodo impuesto para el empleado base
    	if(this.sueldo()<=800){
    		return 0;
    	}
    	return (sueldoBruto-descuentos())*0.03;
    }
    
    public double bonos(){ //sobreescribimos el metodo bonos para el empleado base
    	return 0;			//EL EMPLEADO BASE NO TIENE BONOS
    }
    
    public double descuentos(){ //sobreescribimos el metodo descuentos para el empleado base
		double descuento = (this.sueldoBruto/14)*faltas;
		return descuento;
	}
    
	public double sueldo(){ //sobreescribimos el metodo sueldo para el empleado base
	   
		double sueldo = this.sueldoBruto - descuentos();
		double impuesto = sueldo*0.03;
	    	if(sueldo<800) {
	    		impuesto=0;
	    	}
		        return sueldo-impuesto; 	
	}
	
	public double sueldoBruto(){ //sobreescribimos el metodo sueldoBruto para el empleado base
		return sueldoBruto;
	}
	
	
	
	public String toString (){
		return super.toString();
	}
}



