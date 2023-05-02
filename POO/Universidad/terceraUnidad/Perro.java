package terceraUnidad;

public class Perro extends Animal{
	private String nombre;
	
	public Perro(String nombre) {
		super("Perro");
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void printSonido(){
		System.out.println("guau");
	}
	public String toString(){
		return super.toString()+", me llamo "+nombre;
	}
	

	
}
