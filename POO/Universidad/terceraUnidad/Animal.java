package terceraUnidad;

public class Animal {
	private String especie;
	public Animal (String especie){
		this.especie=especie;
	}
	public String getEspecie(){
		return especie;
	}
	public void printMensaje(){
		System.out.println("Soy Animal de especie "+especie);
	}
	
	public String toString (){
		return "Animal "+especie;
	}
}
