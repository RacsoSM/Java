package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase es parte de la tarea de Punto que es su clase padre*/
public class D3Point extends Point{
	
	protected int z = 1;
	
	public D3Point (int x, int y,int z){
		super(x,y);
		this.z=z;
	}
	
	
	public void setZ (int Z){ //getter y setter de z
		z=Z;
	}
	
	public int getZ (){
		return z;
	}

	public String toString(){
		return "("+x+","+y+","+z+")";
	}
}
