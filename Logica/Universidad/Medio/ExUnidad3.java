package Medio;

public class ExUnidad3 {

	public static void main(String[] args) {
		
		String nom="",mas="";
		int sueldo=0,dep=0,e1=0,e2=0,e3=0,ms=0,sumatot=0;
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("Ingrese su nombre: ");
			nom=Leer.dato();
			
				do {
				System.out.println("A que departamento pertenece? (1=Contabilidad, 2=Sistemas, 3=Ventas): ");
				dep=Leer.datoInt();
				} while (dep!=1 && dep !=2 && dep!=3 );
			
			System.out.println("Ingrese su sueldo: ");
			sueldo=Leer.datoInt();
			
			if(dep==1){
				e1++;
			}
			if(dep==2){
				e2++;
			}
			if(dep==3){
				e3++;
			}
			
			if (sueldo>10000){
				ms++;
			}
			
			if(e1>e2 && e1>e3){
				mas="Contabilidad";
			}
				
			if(e2>e1 && e2>e3){
				mas="Sistemas";
			}
			if(e3>e2 && e3>e1){
				mas="Ventas";
			}
			if(e1==e2){
				mas="Contabilidad y Sistemas";
			}
			if(e2==e3){
				mas="Sistemas y Ventas";
			}
			if(e1==e3){
				mas="Contabilidad y Ventas";
			}
				
				sumatot+=sueldo;
			System.out.println("\n\n");
		}
		
System.out.println("\n");
System.out.println("En el departamento de contabilidad hay "+e1+" empleados ");
System.out.println("En el departamento de sistemas hay "+e2+" empleados ");
System.out.println("En el departamento de ventas hay "+e3+" empleados \n");
System.out.println("En total hay mas de "+ms+" empleados que ganan mas de $10000\n");
System.out.println("El departamento de "+mas+" es el que tiene mas empleados");
System.out.println("La nomina total de la empresa es de $"+sumatot);


	}

}
