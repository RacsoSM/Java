package segundaUnidad;

public class Contacto {

	//atributos de la clase
	private String nombre;
	private char sexo;
	private String alias;
	private String telefono;
	private char tipoTelefono;
	
	//constructor inicializando todos los atributos
	public Contacto (String nombre, char sexo, String alias, String telefono, char tipoTelefono){
		this.nombre=nombre;
		this.sexo=sexo;
		this.alias=alias;
		this.telefono=telefono;
		this.tipoTelefono=tipoTelefono;
	}
	
	//getter y setter de nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//getter y setter de sexo
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//getter y setter de alias
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	//getter y setter de telefono
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//getter y setter de tipo de telefono
	public char getTipoTelefono() {
		return tipoTelefono;
	}
	public void setTipoTelefono(char tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}
	
	//toString que regresa todos los atributos
	public String toString(){
		return "Nombre: "+nombre+"\nSexo: "+sexo+"\nAlias: "+alias+"\nTelefono: "+telefono+"\nTipo de telefono: "+tipoTelefono;
	}
}
