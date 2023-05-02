package terceraUnidad;
/*Santacruz Maldonado Oscar Said  	POO
 * Superclase de la clase HijoB y HijoC, estas clases tienen el proposito de demostrar la funcion de los constructores*/
public class Padre {
	int a=0;
//El codigo que provoca que nos den errores es agregar un constructor con parametros como puede ser el siguiente:
	/*
  public Padre (int a){
  this.a=a;
  }
  */
	public void setA(int x){
		a=x;
	}
	public int getA(){
		return a;
	}
	public String toString(){
		return "valor "+a;
	}
	
}
