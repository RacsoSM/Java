package terceraUnidad;

public class Gato extends Animal{
private String nombre;
private String color;

	public Gato (String nombre, String color){
		super("Gato");
		this.nombre=nombre;
		this.color=color;
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getColor(){
		return color;
	}
	
	public void printSonido(){
		System.out.println("miau");
	}
	
	public String toString(){
		return super.toString()+", me llamo "+nombre+" y soy de color "+color;
	}
}
