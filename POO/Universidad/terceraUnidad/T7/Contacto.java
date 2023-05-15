package T7;

import java.awt.List;
import java.util.ArrayList;

//agregamos la interfaz
public class Contacto extends Persona{ //el tipo de objeto a comparar es "Contacto"
	//atributos
	 protected String email;
	 ArrayList<Telefono> telefonos;
	 
	public Contacto (String nombre, String apellido, char sexo, String email ){
		super(nombre,apellido,sexo);
		this.email=email;
		this.telefonos = new ArrayList<Telefono>();
	}
	
	public void agregarTel(Telefono telefono){
		this.telefonos.add(telefono);
	}
	
	public void eliminarTel(Telefono telefono){
		this.telefonos.remove(telefono);
	}
	
	public void mostrarTelefonos(){
		int i=1;
		for (Telefono telefono : telefonos) {
			System.out.println(i+"."+telefono.toString());
			i++;
		}
		
	}
	
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String nvoEmail){
		email=nvoEmail;
	}
	
	public String toString (){
		return super.toString()+ " "+email+" "+ telefonos;
	}
	
	
}
