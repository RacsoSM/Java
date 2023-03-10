package segundaUnidad;

public class EmpleadoSueldoFijo extends Trabajador{
	private int sueldo;
	private double impuesto;
	
	public EmpleadoSueldoFijo(String direccion, String nombre, String nss, String puesto, String telefono,
								int sueldo, double impuesto){
		super(direccion,nombre,nss,puesto,telefono);
		this.sueldo=sueldo;
		this.impuesto=sueldo*.25;
	}
	
	
	//getter y setter de sueldo
	public int getSueldo(){
		return sueldo;
	}
	
	public void setSueldo(int nvoSueldo){
		sueldo=nvoSueldo;
	}
	
	//getter de impuesto, set no necesita
	public double getImpuesto(){
		return impuesto;
	}
	
	//sobreescritura de metodos
	public double CalcularPago(){
		double pago = this.sueldo-impuesto;
		return pago;
			
	}

	public void mostrarDatos(){
		
		System.out.println("Este trabajador es un Empleado con sueldo fijo\nNombre: "+getNombre()+
			"\nDirección: "+getDireccion()+
			"\nNumero de seguridad social: "+getNSS()+
			"\nPuesto: "+getPuesto()+
			"\nTelefono: "+getTelefono()+
			"\nSueldo: "+sueldo+
			"\nImpuestos: "+impuesto);

	}
	

}
