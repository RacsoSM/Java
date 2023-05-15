package T7;


public class Telefono {
	
	//atributos
	protected char tipoTelefono;
	protected String clavePais;
	protected String numeroTelefonico;

	//metodo constructor
	public Telefono (char tipoTelefono, String clavePais, String numeroTelefonico){
		this.tipoTelefono = tipoTelefono;
		this.clavePais=clavePais;
		this.numeroTelefonico=numeroTelefonico;
	}
	
	//getter del tipo de telefono
	public char getTipoTelefono (){
		return tipoTelefono;
	}
	//getter de la clave del pais
	public String getClavePais (){
		return clavePais;
	}
	//getter del numero telefonico
	public String getNumeroTelefonico (){
		return numeroTelefonico;
	}
	//setter del numero telefonico
	public void setNumeroTelefonico(String nuevoNumeroTelefonico){
		numeroTelefonico=nuevoNumeroTelefonico;
	}
	
	
	public String toString (){
		return tipoTelefono+ " "+clavePais+" "+numeroTelefonico;
	}
	
}
