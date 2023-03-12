package Directorio;


public class Contacto {
	//atributos
	private Persona persona;
	private Telefono telefono;
	private static int cantidadContactos; //atributo para contar la cantidad de contactos 
	
	//constructor
	public Contacto (Persona persona, Telefono telefono){
		this.persona=persona;
		this.telefono=telefono;
		cantidadContactos+=1; //cada vez que se cree un contacto sumamos uno 
	}
	
	//getter de cantidad de contactos
	public static int getCantidadContactos(){
		return cantidadContactos;
	}
	
	//getter y setter de persona
	public Persona getPersona(){
		return persona;
	}
	public void setPersona(Persona newPersona){
		persona=newPersona;
	}
	
	//getter y setter de telefono
	public Telefono getTelefono(){
		return telefono;
	}
	public void setTelefono(Telefono newTelefono){
		telefono=newTelefono;
	}
	
	//metodo toString
	public String toString (){
		String tipoTel="",sexo;
		
			switch(telefono.getTipoTelefono()){ //Cambiamos el mensaje para cada tipo de telefono
				case 'M': tipoTel = "Móvil";    break;
				case 'O': tipoTel = "Oficina";  break;
				case 'C': tipoTel = "Casa";		break;
			}
		sexo = (persona.getSexo()=='H')? "Hombre": "Mujer"; //Cambiamos el mensaje para cada sexo
		
		return persona.getAlias()+"\n"+persona.getNombre()+" "+persona.getApellido()+"  "+sexo+
				"\n"+tipoTel+": "+telefono.getClavePais()+" " +telefono.getNumeroTelefonico()+"\n";
	}
	
	
}
