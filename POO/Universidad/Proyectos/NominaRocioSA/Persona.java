package NominaRocioSA;

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
		return "\t"+nombreApellido+" \t"+sexo;
	}
}
