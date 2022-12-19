package Basico;

public class ProcesarNomina {

	public static void main(String[] args) {
		String nom;
		int sexo,horas,sph,x=1,cont=0,seg=0,ph=0,pm=0,pago=0,h=0,m=0,promediom=0,promedioh=0;
		
		while(x>cont){
			System.out.println("Ingrese el nombre del empleado: ");
			nom=Leer.dato();
			
			System.out.println("Ingrese el sexo del empleado: (1 = masculino, 2 = femenino)");
			sexo=Leer.datoInt();
			if(sexo < 1 && sexo > 2){
				System.out.println("El valor que usted ingreso es incorrecto");
				
			}
			
			
			System.out.println("Ingrese las horas trabajadas: ");
			horas=Leer.datoInt();
			
			System.out.println("Ingrese el sueldo por hora: ");
			sph=Leer.datoInt();
			
			pago=sph*horas;
			
			switch(sexo){
			case 1: ph=ph+pago; h++; break;
			case 2: pm=pm+pago; m++; break;
			}
			
			
			
			
			System.out.println("El nombre del empleado es: "+nom);
			System.out.println("El pago del emleado es: "+pago);
			
			System.out.println("Desea ingresar otro empleado? (1=si, 2=no) ");
			seg=Leer.datoInt();
			
			if (seg>=1){
				cont=1;
			}
		
		}
		
promediom=m/pm;
promedioh=h/ph;
		System.out.println("El pago promedio para las mujeres fue de "+promediom);
		System.out.println("El pago promedio para los hombres fue de "+promedioh);
	}

}
