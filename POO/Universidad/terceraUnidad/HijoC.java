package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase usa a las clases Padre, HijoB y HijoC cuyo proposito es demostrar el comportamiento de los constructores*/
public class HijoC extends Padre{
	int c=3;
	
	//public HijoC(){ //creamos un constructor vacio porque java ya no nos lo regala
	//this(3); //mandamos llamar al constructor con parametros de esta misma clase
	//}
	public HijoC(int valor){
		c=valor;
	}
	public void setC(int x){
		c=x;
	}
	public int getC(){
		return c;
	}
	public String toString(){
		return super.toString()+", valor "+c;
	}
	
}
