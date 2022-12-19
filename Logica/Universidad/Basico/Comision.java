package Basico;

public class Comision {

	public static void main(String[] args) {
		
		int venta,tot,comision = 0;
		
		System.out.println("Ingrese la venta total:" );
		venta=Leer.datoInt();
		
		if(venta>=5000){
			tot=venta*10/100;
			comision=10;
		}
		else{
			tot=venta*7/100;
			comision=7;
		}
		System.out.println("La comisión que se le debe"
				+ " pagar al vendedor es de $"+tot);
		System.out.println("Al vendedor se le aplicó una comisión del "+comision+"%");

	}

}
