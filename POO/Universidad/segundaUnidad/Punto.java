package segundaUnidad;

public class Punto {
	 int x=0;
	 int y=0;
	private static int totalPuntos=0; //cambiamos a private el atributo estatico 
	
	public Punto(int _x, int _y) { //constructor con los atributos 'x' y 'y'
		
		x = _x;
		y = _y;
		totalPuntos++; //al crear un objeto Punto sumamos uno al contador de puntos
	}
	
	public void setx (int _x){
		x=_x;
	}
	public void sety (int _y){
		y=_y;
	}
	
	public int getX (){
		return x;
	}
	
	public int getY (){
		return y;
	}
	public static int getTotalPuntos(){ //getter de totalPuntos, es estatico por que el atributo
		return totalPuntos;				//tambien lo es
	}
	
	public String toString (int k){ //le agregamos un parametro al toString
		return "("+x+","+y+")"; //retornamos los valores de x y y entre parentesis
	}
	
	public void setPunto (int newX, int newY){
		x=newX;
		y=newY;
	}

}
