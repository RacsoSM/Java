package Basico;

public class CostoCamisas {

	public static void main(String[] args) {
		// SOLUCION DEL PROFE
		System.out.println("Calcula el costo de unas camisas");
		System.out.println("=================================");
		//Define variables
		int Camisas=0,Costo=0,Total=0;
		System.out.println("Cuantas camisas quieres?: ");
		Camisas=Leer.datoInt();
		// Calcula costo
		if(Camisas>3)
		{
			Costo=100;
		}
		if(Camisas<=3)
		{
			Costo=120;
		}
		// Calcula total a pagar
		Total= Camisas*Costo;
		System.out.println("Tus " +Camisas + "camisas cuestan $"+Costo+" cada una");
		System.out.println("Debes pagar $"+Total);
			
		
		
		
		

		
		
		
		/*MI SOLUCION
		int cam,tot,p;
		System.out.println("Cuantas camisas vas a comprar?");
		cam=Leer.datoInt();
		
			if(cam<=3){
				p=120;
			}
			else{
				p=100;
			}
		tot=p*cam;
		System.out.println("El precio total de las camisas es: "+tot);
*/
	}

}
