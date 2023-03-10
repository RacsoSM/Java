package segundaUnidad;

import java.util.Arrays;

public class usaPuntos {

	public static void main(String[] args) {
		Punto punto1 = new Punto(2,3);
		Punto punto2 = new Punto(5,5);
		Punto punto3 = punto1;
		
		Punto[] puntos = {punto1,punto2,punto3};
		
		System.out.println(Arrays.toString(puntos));
		//System.out.println("Puntos creados: "+Punto.totalPuntos);
	}
}
