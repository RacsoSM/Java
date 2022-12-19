package Basico;

public class LeerDatos {

	public static void main(String[] args) {
	
		double pagoxhora,Sueldo;
		String Nombre;
		int HorasTrabajadas,NumE,Cont = 0;
		System.out.println("CUANTOS EMPLEADOS TIENES?: ");
		NumE=Leer.datoInt();
		System.out.println();

			do{
				Cont=Cont+1;
				System.out.println("Datos empleado "+Cont);
				System.out.println("================");
				System.out.println("Nombre del empleado "+Cont);
				Nombre= Leer.dato();
				System.out.println("Horas trabajadas en la semana?: ");
				HorasTrabajadas=Leer.datoInt();
				System.out.println("Pago por hora?: ");
				pagoxhora=Leer.datoDouble();
				
				Sueldo=HorasTrabajadas * pagoxhora;
				System.out.println(Nombre+" Gano en la semana $"+Sueldo+" dolares");
			}while(Cont<=NumE);
	}

}
