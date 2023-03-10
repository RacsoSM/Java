package segundaUnidad;

public class Perro {
	private String nombre;
	private char sexo;
	private String raza;
	private byte edad;
	private String color;
	private double peso;
	
	public Perro(String nombre, char sexo, String raza) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.raza = raza;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public String getRaza() {
		return raza;
	}

	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	
	public String getColor() { 
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public String toString(){
		return "Nombre: "+nombre+"\nSexo: "+sexo+"\nRaza: "+raza+
		"\nEdad: "+edad+"\nColor: "+color+"\nPeso: "+peso;
	}
}
