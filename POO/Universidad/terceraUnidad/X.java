package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase es parte de la herencia de la tarea 6*/
public class X extends D{
	
	protected int atributoX = 7;
	
	public X(){
		System.out.println("Clase X");
	}
	
	public int sumaAtributos(){
		int suma = atributoX+super.atributoUno+super.atributoG+super.atributoUno;
		return suma;
	}
}
