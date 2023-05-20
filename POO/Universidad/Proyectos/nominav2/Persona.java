package nominav2;
/*Santacruz Maldonado Oscar Said				EASA
 * Marrujo Garcia Angel							POO 10:00-11:00
 * Dra Lucia Barron  
 * Clase persona para definir la estructura de los empleados*/

public class Persona {
	private String nombreApellido; 	//declaramos atributos de persona
	private char sexo;
	private String fechaNacimiento;
	
	public Persona(String nombreApellido,char sexo,String fechaNacimiento){ //constructor que inicializa estos atributos
		this.nombreApellido=nombreApellido;
		this.sexo=sexo;
		this.fechaNacimiento=fechaNacimiento;
	}
	
	public String getNombreApellido(){ //getters
		return nombreApellido;
	}
	
	public char getSexo(){
		return sexo;
	}
	public String getFechaNacimiento(){
		return fechaNacimiento;
	}
	
	public String toString(){
		return nombreApellido+" "+sexo+" "+" "+fechaNacimiento;
	}
}
