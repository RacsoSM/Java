package Metodos;

public class SimulacroU4 {
//T R W A G M Y F P D X B N J Z S Q V H L C K E
	public static void main(String[] args) {
		int dni=0,l=0,numero=0;
		String tot="",c="";
		System.out.println("Cuantos DNI quiere generar?: ");
		numero=Leer.datoInt();
		
		String [] u= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		for (int i = 0; i < numero; i++) {
			dni=0;l=0;
			System.out.println("Introduzca el DNI:");
			dni=Leer.datoInt();
			l=(dni%23);
			//System.out.println("El resto es :" +l);
			c=u[l];
			
			tot=dni+c;
			System.out.println(tot);
		}
		
		
		
	}

}
