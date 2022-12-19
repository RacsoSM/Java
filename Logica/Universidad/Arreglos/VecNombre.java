package Arreglos;

public class VecNombre {

	public static void main(String[] args) {
		System.out.println("=== Usa un vector de nombres ===");
		int T=0; String Nombre="";
		System.out.println("Tamaño del vector: ");
		T=Leer.datoInt();
		String[] Nom=new String [T]; //DECLARA UN VECTOR STRING DE TAMAÑO T
		
			for (int pos = 0; pos < T; pos++) {
				System.out.println("Ingresa nombre: "+(pos+1)+": ");
				Nombre=Leer.dato();
				Nom[pos]=Nombre; //GUARDA NOMBRE EN LA POSICION pos
			}
			
			for (int P = 0; P < Nom.length; P++) {  //IMPRIME CONTENIDO DEL VECTOR
				System.out.println("["+Nom[P]+"] en POSICION "+P);
			}
			System.out.println("\n");
			for (int P = Nom.length -1; P >= 0; P--) {  //IMPRIME CONTENIDO DEL VECTOR
				System.out.println("["+Nom[P]+"] en POSICION "+P);
			}

	}

}
