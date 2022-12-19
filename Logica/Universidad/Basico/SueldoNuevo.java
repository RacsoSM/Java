package Basico;

public class SueldoNuevo {

	public static void main(String[] args) {
		
		int sueldo,a=0;
		
		System.out.println("Ingrese el sueldo del trabajador: ");
			sueldo=Leer.datoInt();
			
				if (sueldo>1500){
					a=18;
				}
				
				if (sueldo<1000){
					a=25;
				}
				if (sueldo>=1000 && sueldo<=1500){
					a=21;
				}
				
				sueldo=(sueldo*a/100)+sueldo;
		System.out.println("Se le realizó un aumento del "+a+"%\n");
		System.out.println("Su nuevo sueldo es de $"+sueldo);
	}
}
