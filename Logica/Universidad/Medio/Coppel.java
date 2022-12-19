package Medio;

public class Coppel {

	public static void main(String[] args) {
		int c=0,nc=0,sa=0,im=0,op=0,ab=0,ca=0,totca=0,totab=0,totsa=0;

		
		System.out.println("Ingrese cuantos clientes desea actualizar: ");
		c=Leer.datoInt();
		
		for(int i=1; i<=c;i++){
				ab=0; ca=0;
				System.out.println("Ingrese el numero de cuenta: ");
				nc=Leer.datoInt();
				
				System.out.println("Ingrese el saldo actual: ");
				sa=Leer.datoInt();
				
				System.out.println("Ingrese el importe de la operación: ");
				im=Leer.datoInt();
				
					do{
					System.out.println("¿Que tipo de operación desea realizar? (1=Abono, 2=Cargo) ");
					op=Leer.datoInt();
					}while(op!=1 && op!=2);
				
						if(op==1){
							ab=im;
							sa=sa-im;
						}
						if(op==2){
							ca=im;
							sa=sa+im;
						}
				
			
				
				totca= totca+ca;
				totab= totab+ab;
				totsa= totsa+sa;
				System.out.println("\n");
		}
		
		System.out.println("Total de cargos: $"+totca);
		System.out.println("Total de abonos: $"+totab);
		System.out.println("El saldo de todos los clientes es de: $"+totsa);

	}

}
