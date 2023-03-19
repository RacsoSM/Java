package Directorio;

//agregamos la interfaz
public class Contacto { //el tipo de objeto a comparar es "Contacto"
	//atributos
	private Persona persona;
	private Telefono telefono;
	
	
	
	//constructor
	public Contacto (Persona persona, Telefono telefono){
		this.persona=persona;
		this.telefono=telefono;
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
				case 'M': tipoTel = "Movil";    break;
				case 'O': tipoTel = "Oficina";  break;
				case 'C': tipoTel = "Casa";		break;
			}
		sexo = (persona.getSexo()=='H')? "Hombre": "Mujer"; //Cambiamos el mensaje para cada sexo
		
		return persona.getNombre()+" "+persona.getApellido()+" '"+persona.getAlias()+"' "+sexo+
				"\n"+tipoTel+": "+telefono.getClavePais()+" " +telefono.getNumeroTelefonico()+"\n";
	}

	
	
	
}
