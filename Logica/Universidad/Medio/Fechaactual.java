package Medio;
import java.util.*;
import java.text.*;
public class Fechaactual {

	public static void main(String[] args) {
		
		System.out.println("IMPRIME LA FECHA Y HORA DEL SISTEMA USANDO UN FORMATO DEFINIDO");
	System.out.println("");
	
	Date hoy = new Date(); //LEE LA FECHA ACTUAL DEL SISTEMA
	
	String patron="EEE dd-MMM-yyyy, hh:mm:ss";
	
	SimpleDateFormat formato= new SimpleDateFormat(patron);
	
	String Salida=formato.format(hoy); //ASIGNA LA FECHA AL FORMATO
	
	String Hora=Salida.substring(17,25); //TOMAMOS SOLO LA POSICION DE LA HORA
	
	System.out.println("Hora: "+Hora+"\n");
	
	System.out.println("IMPRIME LA FECHA CON EL FORMATO INDICADO: ");
	System.out.println(Salida); //IMPRIME LA FECHA CON EL FORMATO INDICADO
	System.out.println();
	System.out.println("FECHA SIN FORMATO: ");
	System.out.println(hoy);//FECHA SIN FORMATO

	}

}
