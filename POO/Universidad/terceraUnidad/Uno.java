package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase es parte de la herencia de la tarea 6*/
public class Uno {
	
	protected int atributoUno = 1;
	
	public Uno(){
		System.out.println("Clase uno");
	}
	
	public int getAtributoUno (){
		return atributoUno; 
	}
	
	public void setAtributoUno (int nuevoAtributoUno){
		atributoUno = nuevoAtributoUno;
	}
	
	public String toString (){
		return "Este es el toString de la clase uno y el valor del atributo es "+atributoUno;
	}
	
}
