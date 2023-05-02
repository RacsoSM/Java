package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase usa a las clases Padre, HijoB y HijoC cuyo proposito es demostrar el comportamiento de los constructores*/
public class HijoB extends Padre{
	int b=2;
	
	/*Si a la clase padre le ponemos un constructor, esta clase nos dará un error a menos que
	 * creemos otro constructor y llamemos al constructor de la clase padre de forma explicita 
	 * ya que no tendra constructor vacio.
	 * 
	 * public HijoB(int b){
	 * super(0);
	 * this.b=b;
	 * }*/
	public void setB(int x){
	b=x;
	}
	public int getB(){
		return b;
	}
	public String toString(){
		return super.toString()+", valor "+b;
	}
}
