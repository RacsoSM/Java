package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase es parte de la herencia de la tarea 6*/
public class C extends D{
	
	protected int atributoC = 6;
	
	public C(){
		System.out.println("Clase C");
	}
	
	public int sumaAtributos(){
		int suma = super.atributoD+super.atributoG+super.atributoUno+atributoC;
		return suma;
	}
}
