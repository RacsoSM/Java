package Basico;
//SANTACRUZ MALDONADO OSCAR SAID
public class TotalFactura {

	public static void main(String[] args) {
		String des;
		double precio,subtotal,descuento = 0,iva,total;
		int cantidad;
		System.out.println("CALCULA EL IMPORTE TOTAL DE UNA FACTURA");
		
		System.out.println("Ingrese la descripción del articulo: ");
		des=Leer.dato();
		
		System.out.println("Ingrese el precio del articulo: ");
		precio=Leer.datoDouble();
		
		System.out.println("Ingrese la cantidad comprada: ");
		cantidad=Leer.datoInt();
		
			subtotal=precio*cantidad;
			
					if(subtotal>20000){
						descuento= subtotal*5/100;
						System.out.println("Se aplicó un descuento del 5% a la compra\n\n");
					}
					
			subtotal-=descuento;
			iva= subtotal*15/100;
			total=subtotal+iva;
		
		System.out.println("Descripción del producto: "+des);
		System.out.println("Precio unitario del producto: $"+precio);
		System.out.println("Cantidad comprada: "+cantidad);
		System.out.println("Subtotal: $"+subtotal+"\n");
		System.out.println("IVA: $"+iva);
		System.out.println("Total: $"+total);
	}

}
