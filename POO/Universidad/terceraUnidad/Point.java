package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Programa que declara la clase punto con atributos x,y, constructor y metodos getters y setters*/
public class Point {
protected int x = 0;
protected int y = 0;
public static int totalPuntos =0;
public Point(){	//constructor vacio
	totalPuntos++;
}
public Point (int x, int y){ //constructor de punto con parametros
	this.x=x;
	this.y=y;
	totalPuntos++;
}
public int getX() { //getters y setters
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public Point medio (Point p){
	return new Point ((p.x+x)/2,(p.y+y)/2);
	
}

public String toString(){
	return "("+x+","+y+")";
}

}
