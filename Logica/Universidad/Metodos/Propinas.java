package Metodos;

import java.text.DecimalFormat;

public class Propinas {

	public static void main(String[] args) {
		String q="",a="";
		int check=0;
		double tip=0,t=0;
		DecimalFormat Mascara=new DecimalFormat("$###,###.##");
		
		do{
			
			a=Preguntar(q);

			if(a.equalsIgnoreCase("S")){
				
				System.out.print("Cual fue el importe de su consumo?:  $");
				check=Leer.datoInt();
				
				tip=Calcular(check,Mascara);
				t+=tip;
			}
			
		}while(a.equalsIgnoreCase("S"));
		
		System.out.println("El total de propinas del dia fue de: "+Mascara.format(t));
	}

	
	
		public static double Calcular (int check, DecimalFormat Mascara){ //APLICANDO CONOCIMIENTOS DE LA CLASE DE POO :)
			
			double tip=0;
			
			tip=check*0.10;
			System.out.println("La propina que usted dejara es de: "+Mascara.format(tip)+"\n\n");
			
			return tip;
		}
	


		public static String Preguntar (String q){
			
			do{
				System.out.println("Desea dejar propina? (S/N): ");
				q=Leer.dato();
				
					if(!q.equalsIgnoreCase("S") && !q.equalsIgnoreCase("N")){
						System.out.println("Ha ocurrido un error, por favor ingrese un dato permitido");
					}
			}while(!q.equalsIgnoreCase("S") && !q.equalsIgnoreCase("N"));
			
			return q;
		}
}
