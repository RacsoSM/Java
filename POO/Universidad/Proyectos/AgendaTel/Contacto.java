package AgendaTel;

//agregamos la interfaz
public class Contacto { //el tipo de objeto a comparar es "Contacto"
	//atributos
	private Persona persona;
	private Telefono telefono;
	
	
	
	//constructor
	public Contacto (Persona persona, Telefono telefono)
	{
		this.persona=persona;
		this.telefono=telefono;
	}
	
	//getter y setter de persona
	public Persona getPersona()
	{
		return persona;
	}
	public void setPersona(Persona newPersona)
	{
		persona=newPersona;
	}
	
	//getter y setter de telefono
	public Telefono getTelefono()
	{
		return telefono;
	}
	public void setTelefono(Telefono newTelefono)
	{
		telefono=newTelefono;
	}
	
	//metodo toString
	public String toString ()
	{
		String tipoTel="",sexo;
		
		switch(telefono.getTipoTelefono()) //Cambiamos el mensaje para cada tipo de telefono
		{ 
			case 'm': tipoTel = "Movil";    break;
			case 'o': tipoTel = "Oficina";  break;
			case 'c': tipoTel = "Casa";		break;
		}
		sexo = (persona.getSexo()=='H')? "Hombre": "Mujer"; //Cambiamos el mensaje para cada sexo
		
		return  "NOMBRE\tAPELLIDO    ALIAS   SEXO \tTIPO \t CLAVE\t TELEFONO\n" + persona.getNombre()+"  "+persona.getApellido()+"   '"+persona.getAlias()+"'   "+sexo+
				" \t"+tipoTel+":   "+telefono.getClavePais()+" \t" +telefono.getNumeroTelefonico()+"\n";
	}

	
	
	
}
