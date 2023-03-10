package segundaUnidad;

public class AlumnoPrimaria {
	
	private int NumAlumno;
	private byte Edad;
	private String Nombre;
	private byte Grado;
	private char Grupo;
	
	//crear a clase maestro, tiene nombre, horario, id maestro, gradoAsignado, grupoAsignado
	//tarea crearlo en otra clase

	//constructor 1
	public AlumnoPrimaria(int NumAlumno,byte Edad, String Nombre, byte Grado, char Grupo) {
		this.NumAlumno=NumAlumno;
		this.Edad = Edad;
		this.Nombre = Nombre;
		this.Grado = Grado;
		this.Grupo = Grupo;
	}
	
	//constructor 2
	public AlumnoPrimaria(int NumAlumno, String Nombre, byte Edad){
		this.NumAlumno = NumAlumno;
		this.Nombre = Nombre;
		this.Edad = Edad;
		
	}
	
	//toString es para representar en un String la informacion de mi clase
	//de esta forma vemos que contiene el objeto de nuestra clase
	//syso(nombreObjeto.toString()); esto nos da el hashcode
	//creacion de un objeto con byte 
	//AlumnoPrimaria alumno = new AlumnoPrimaria (10,"JUAN", (byte)7);
	
	//hacer 2 objetos pero pidiendo los datos por teclado.
	
	//toString
	public String toString(){
		if(Grupo!=0)	//si el valor del grupo no es el por defecto, se regresan todos los datos
			return "Nombre: "+Nombre+"\nEdad: "+Edad+ "\nNumero de alumno: "+NumAlumno+"\nGrado: "+Grado+"\nGrupo: "+Grupo;
		
		//si el valor del grupo si es 0, se imprimen solamente estos datos
		return "Nombre: "+Nombre+"\nEdad: "+Edad+ "\nNumero de alumno: "+NumAlumno;
	}
	
	//solo hacemos getter de alumno por que no queremos que lo cambien con un setter
	public int getNumAlumno(){
		return NumAlumno;
	}
	
	//setter y getter de nombre
	public void setNombre (String nombre){
		Nombre=nombre;
	}
	public String getNombre (){
		return Nombre;
	}
	
	//setter y getter de edad
	public byte getEdad() {
		return Edad;
	}
	public void setEdad(byte edad) {
		Edad = edad;
	}

	//setter y getter de grado
	public byte getGrado() {
		return Grado;
	}
	public void setGrado(byte grado) {
		Grado = grado;
	}

	//setter y getter de grupo
	public char getGrupo() {
		return Grupo;
	}

	public void setGrupo(char grupo) {
		Grupo = grupo;
	}

}
