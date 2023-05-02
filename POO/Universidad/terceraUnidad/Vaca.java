package terceraUnidad;

public class Vaca extends Animal{
	private int peso;
	
	public Vaca (int peso){
		super("Vaca");
		this.peso=peso;
	}
	
	public int getPeso (){
		return peso;
	}
	public void printSonido(){
		System.out.println("muuu");
	}
	
	public String toString(){
		return super.toString()+" y peso "+peso+" kg";
	}

}
