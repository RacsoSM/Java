package Basico;
import java.text.DecimalFormat;


public class NominaProfe {

	public static void main(String[] args) {
		int HorasT=0,SueldoH=0,PagoT=0,Genero=0,PPHombres=0,H=0,PPMujeres=0,M=0;
		String Nombre="",SN="";
		
		System.out.println("CALCULA NOMINA DE EMPLEADOS");
		DecimalFormat Mascara=new DecimalFormat("$###,###.00");
			
			do{
			System.out.print("NOMBRE DEL EMPLEADO: ");
			Nombre=Leer.dato();
			System.out.print("HORAS TRABAJADAS: ");
			HorasT=Leer.datoInt();
			System.out.print("PAGO POR HORA?: ");
			SueldoH=Leer.datoInt();
			PagoT=HorasT*SueldoH;
			
				do{
					System.out.println("GENERO? (1=Masculino, 2= Femenino): ");
					Genero=Leer.datoInt();
				}while (Genero<1 || Genero>2);
				
			System.out.println("NOMBRE: "+Nombre+" PAGO: "+Mascara.format(PagoT));
				if(Genero==1){
					PPHombres+=PagoT; H++;
				}
				else{
					PPMujeres+=PagoT; M++;
				}
					do{
						System.out.println("Desea capturar otro? (S/N)");
						SN=Leer.dato();
						
					}while(!SN.equalsIgnoreCase("S") && !SN.equalsIgnoreCase("N"));
			}while(SN.equalsIgnoreCase("S"));
		
		if(H>0) PPHombres=PPHombres/H;
		if(M>0) PPMujeres=PPMujeres/M;
		
		System.out.println("PAGO PROMEDIO PARA HOMBRES: "+Mascara.format(PPHombres));
		System.out.println("PAGO PROMEDIO PARA MUJERES: "+Mascara.format(PPMujeres));
	}

}
