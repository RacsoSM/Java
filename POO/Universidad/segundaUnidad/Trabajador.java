package segundaUnidad;

public class Trabajador {
	//atributos
	private String direccion;
	private String nombre;
	private String nss;
	private String puesto;
	private String telefono;
	
	//constructor
	public Trabajador(String direccion, String nombre, String nss, String puesto, String telefono) {
		
		this.direccion = direccion;
		this.nombre = nombre;
		this.nss = nss;
		this.puesto = puesto;
		this.telefono = telefono;
	}
	
	//getters y setters de direccion

	public void setDireccion(String nvaDireccion){
		this.direccion=nvaDireccion;
	}
	public String getDireccion(){
		return this.direccion;
	}
	
	
	//getters y setters de nombre
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nvoNombre){
		nombre=nvoNombre;
	}
	
	//getters y setters de puesto
	public String getPuesto(){
		return puesto;
	}
	public void setPuesto(String nvoPuesto){
		puesto=nvoPuesto;
	}
	
	//getters y setters de telefono
	public String getTelefono(){
		return telefono;
	}
	public void setTelefono(String nvoTelefono){
		telefono=nvoTelefono;
	}
	
	//get de nss ya que no requiere set pq es un valor que no cambia
	public String getNSS(){
		return nss;
	}
	
	public double CalcularPago(){
		return 0.0;
	}

	public void mostrarDatos(){
		
	}
	
	
	

}
