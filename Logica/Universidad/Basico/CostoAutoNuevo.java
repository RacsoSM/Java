package Basico;

public class CostoAutoNuevo {

	public static void main(String[] args) {
		
		int costo,comision,cf,impuesto;
		
		System.out.println("Calcula el costo de un Auto Nuevo\n");
		System.out.println("Cual es el costo del automóvil?");
		costo=Leer.datoInt();
		
		comision=costo* 12/100;
		impuesto=costo* 6/100;
	    cf= costo+comision+impuesto;

	    System.out.println("El costo final del automóvil es de: $"+cf);
	    System.out.println("Se cobro una comisión del 12% para el vendedor equivalente a: $"+comision);
	    System.out.println("Se cobro un impuesto del 6% equivalente a: $"+impuesto);
	}

}
