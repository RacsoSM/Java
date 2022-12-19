package Medio;
import java.text.SimpleDateFormat;
import java.util.*;

//SANTACRUZ MALDONADO OSCAR SAID
public class HoraMas1Seg {

	public static void main(String[] args) {
		String HoraCadena="",MinutoCadena="",SegundoCadena="";
		
		Date hoy = new Date(); //LEE LA FECHA ACTUAL DEL SISTEMA
		String patron="EEE dd-MMM-yyyy, hh:mm:ss";
		//             0123456789012345678901234
		SimpleDateFormat formato= new SimpleDateFormat(patron);
		
		String Salida=formato.format(hoy); //ASIGNA LA FECHA AL FORMATO
		
		String HoraTot=Salida.substring(17,25); //TOMAMOS SOLO LA POSICION DE LA HORA
		System.out.println("Hora actual: "+HoraTot+"\n");
		
		String Hora=Salida.substring(17,19); //TOMAMOS SOLO LA POSICION DE LAS HORA
	
		
		String Minutos=Salida.substring(20,22); //TOMAMOS SOLO LA POSICION DE LOS MINUTOS
		
		
		String Segundos=Salida.substring(23,25); //TOMAMOS SOLO LA POSICION DE LOS SEGUNDOS
		
		
		int HoraNueva = Integer.parseInt(Hora);   //CONVERTIMOS LAS HORAS A INT
	
		
		int MinutoNuevo = Integer.parseInt(Minutos);  //CONVERTIMOS LOS MINUTOS A INT
		
		
		int SegundoNuevo = Integer.parseInt(Segundos);  //CONVERTIMOS LOS SEGUNDOS A INT
		

		SegundoNuevo++; //SUMAMOS EL SEGUNDO
		
		
		if(SegundoNuevo>=60){ //VALIDAMOS EL CAMBIO DE MINUTO
			MinutoNuevo++;
			SegundoNuevo=0;
		}
		
		if(MinutoNuevo>=60){ //VALIDAMOS EL CAMBIO DE HORA
			HoraNueva++;
			MinutoNuevo=0;
		}
		
		if(HoraNueva>=24){ //VALIDAMOS EL CAMBIO DE DIA
			
			HoraNueva=0;
		}
		
		HoraCadena= String.valueOf(HoraNueva); //CONVERTIMOS DENUEVO LOS VALORES A STRING
		MinutoCadena= String.valueOf(MinutoNuevo);
		SegundoCadena= String.valueOf(SegundoNuevo);
		
		if(HoraNueva <10 && HoraNueva>0){    //HACEMOS QUE SI EL VALOR ES MENOR A 10 Y MAYOR A 0 SE LE AGREGUE UN "0" AL LADO DEL NUMERO
			 HoraCadena= 0+HoraCadena;
		}	
		if(MinutoNuevo <10 && MinutoNuevo>0){
			MinutoCadena=0+MinutoCadena;
		}
		if(SegundoNuevo <10 && SegundoNuevo>0){
			SegundoCadena=0+SegundoCadena;
		}
		
		if(HoraNueva==0){   //AGREGAMOS PARA QUE EN VEZ DE DECIR 0 DIGA 00
			HoraCadena= "00";
		}
		if(MinutoNuevo==0){
			MinutoCadena="00";
		}
		if(SegundoNuevo==0){
			 SegundoCadena="00";
		}	
		
		
		//MOSTRAMOS EL RESULTADO
		System.out.println("La hora de 1 segundo despues sera: "+HoraCadena+":"+MinutoCadena+":"+SegundoCadena);
		
	}

}
