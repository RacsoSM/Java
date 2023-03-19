package Directorio;


public class Persona {
	//atributos
	private String nombre;
	private String apellido;
	private char sexo;
	private String alias;
	
	//metodo constructor
	public Persona(String nombre, String apellido, char sexo, String alias) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.alias = alias;
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

	//getter y setter de alias
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String toString(){
		return nombre+" "+apellido+ "'"+alias+"'" +"\t"+sexo;
	}
	
	
}
