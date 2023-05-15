package T7;

public class Persona {
	//atributos
	protected String nombre;
	protected String apellido;
	protected char sexo;
	
	//metodo constructor
	public Persona(String nombre, String apellido, char sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
	}


	//getter y setter de nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//getter y setter de apellido
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	//getter de sexo
	public char getSexo() {
		return sexo;
	}
	
	
	
	public String toString(){
		return nombre+" "+apellido+ "'"+sexo+"'";
	}
	
	
}
