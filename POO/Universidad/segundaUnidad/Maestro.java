package segundaUnidad;

public class Maestro {

	private String Nombre;
	private String Horario;
	private int idMaestro;
	private byte gradoAsignado;
	private char grupoAsignado;
	
	//metodo constructor 1
	public Maestro(String Nombre, String Horario, int idMaestro, byte gradoAsignado, char grupoAsignado) {
		this.Nombre = Nombre;
		this.Horario = Horario;
		this.idMaestro = idMaestro;
		this.gradoAsignado = gradoAsignado;
		this.grupoAsignado = grupoAsignado;
	}
	
	
	//metodo constructor 2
	public Maestro(String Nombre, String Horario, int idMaestro){
		this.Nombre=Nombre;
		this.Horario=Horario;
		this.idMaestro=idMaestro;
	}

	
	//toString
	public String toString(){
		if(grupoAsignado!=0)
			return "Nombre: "+Nombre+"\nHorario: "+Horario+ "\nIdentificacion del maestro: "+idMaestro+
					"\nGrado asignado al maestro: "+gradoAsignado+"\nGrupo asignado al maestro: "+grupoAsignado;
		
		return "Nombre: "+Nombre+"\nHorario: "+Horario+ "\nIdentificacion del maestro: "+idMaestro;
	}
	
	//getters y setters de nombre
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	//getters y setters de horario
	public String getHorario() {
		return Horario;
	}
	public void setHorario(String horario) {
		Horario = horario;
	}

	//solamente ponemos el getter del id por que no queremos que se cambie
	public int getIdMaestro() {
		return idMaestro;
	}

	//getters y setters del gradoAsignado
	public byte getGradoAsignado() {
		return gradoAsignado;
	}
	public void setGradoAsignado(byte gradoasignado) {
		gradoAsignado = gradoasignado;
	}

	
	//getters y setters del grupo asignado
	public char getGrupoAsignado() {
		return grupoAsignado;
	}
	public void setGrupoAsignado(char grupoasignado) {
		grupoAsignado = grupoasignado;
	}
	
	
}
