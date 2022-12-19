package Medio;
import java.util.*;
public class Edad {

	public static void main(String[] args) {
		String y="",Day="",Mon="",Yea="";
		int Aa=0,Ma=0,Da=0,DiaNuevo=0,MesNuevo=0,AñoNuevo=0,a=0,m=0,d=0;
		
		Calendar FechaAc=new GregorianCalendar();
		Aa=FechaAc.get(Calendar.YEAR);
		Ma=FechaAc.get(Calendar.MONTH)+1;
		Da=FechaAc.get(Calendar.DAY_OF_MONTH);
		
		
		
		System.out.println("La fecha actual del sistema es: "+Da+"/"+Ma+"/"+Aa);
		System.out.println("Ingrese su fecha de nacimiento (DD/MM/AAAA):");
		y=Leer.dato();
		
		 Day=y.substring(0,2);
		 Mon=y.substring(3,5);
		 Yea=y.substring(6,10);
	
		  DiaNuevo = Integer.parseInt(Day); 
		  MesNuevo = Integer.parseInt(Mon); 
		  AñoNuevo = Integer.parseInt(Yea); 
		
		
		a=Aa-AñoNuevo;

		
			if(Ma>MesNuevo){
				m=Ma-MesNuevo;
			}
			
			if(Ma<MesNuevo){
				m=Ma+MesNuevo-12;
				a=a-1;
			}
			if(Da>DiaNuevo){
				d=Da-DiaNuevo;
				
			}
			
			if(Da<DiaNuevo){
				d=30-DiaNuevo+Da;
				m=m-1;
			}
			
			if(Ma==MesNuevo){
				m=0;
			}
			
		
			
		System.out.println("Su edad es: "+a+" años "+m+" meses "+d+" dias");
			
			
		

	}

}
