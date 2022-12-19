package Basico;
//SANTACRUZ MALDONADO OSCAR SAID
public class CostoLlamada {

	public static void main(String[] args) {
		
		int duracion=0,costo=0,ad=0;  //DECLARAMOS VARIABLES
		
		System.out.println("Por favor ingrese la duracion de su llamada en minutos: ");
		duracion=Leer.datoInt();  //LEEMOS DURACION
		
				if(duracion<=3)     //RESOLVEMOS EL PROBLEMA
				{
					costo= 5;
				}
				if(duracion>3) 
				{
					ad=duracion-3;
					costo=(ad*3)+5;
				}
		System.out.println("El costo total de su llamada de "+duracion+" minutos es de $"+costo);  //MOSTRAMOS EL RESULTADO
		System.out.println("Usted requirio de "+ad+" minutos adicionales");
	}

}
