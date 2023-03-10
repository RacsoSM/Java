package segundaUnidad;

public class Consultor extends Trabajador{
	private int horas;
	private double tarifaxhora;
	
	
	public Consultor(String direccion, String nombre, String nss, String puesto, String telefono,
						int horas, double tarifaxhora){
		super(direccion,nombre,nss,puesto,telefono);
		this.horas=horas;
		this.tarifaxhora=tarifaxhora;
	}
	
	//getter y setters de horas
	public int getHoras(){
		return horas;
	}
	
	public void setHoras(int nvaHoras){
		horas=nvaHoras;
	}
	
	//getter y setters de tarifaxhora
		public double gettarifaxhora(){
			return tarifaxhora;
		}
		
		public void settarifaxhora(double nvatarifaxhora){
			tarifaxhora=nvatarifaxhora;
		}
		
		//sobreescritura de metodos
		public double CalcularPago(){
			return this.horas*this.tarifaxhora;
		}

		public void mostrarDatos(){
			System.out.println("Este trabajador es un Consultor\nNombre: "+getNombre()+
			"\nDirección: "+getDireccion()+
			"\nNumero de seguridad social: "+getNSS()+
			"\nPuesto: "+getPuesto()+
			"\nTelefono: "+getTelefono()+
			"\nHoras trabajadas: "+horas+
			"\nTarifa por hora: "+tarifaxhora);
			

		}
	

}
