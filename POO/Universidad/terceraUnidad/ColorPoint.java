package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Clase punto de color que extiende de punto, tiene el proposito de demostrar la herencia*/
public class ColorPoint extends Point{
private String color = "rojo";

public void setColor(String c){ //getter y setter de color
	color = c;
}
public String getColor(){
	return color;
}
public String toString(){
	return super.toString()+","+color;
}

}
