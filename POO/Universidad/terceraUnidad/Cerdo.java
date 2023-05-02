package terceraUnidad;

public class Cerdo extends Animal{
	private int peso;
	private int edad;
	
	public Cerdo (int peso, int edad){
		super("Cerdo");
		this.peso=peso;
		this.edad=edad;
	}
	
	public int getPeso(){
		return peso;
	}
	public int getEdad(){
		return edad;
	}
	public void printSonido(){
		System.out.println("oink oink");
	}
	public String toString(){
		return super.toString()+", peso "+peso+" kg y tengo "+edad+" años";
	}
	
}
