package Basico;
import java.text.DecimalFormat;
public class ZaileAustralia {

	public static void main(String[] args) {
		
		int a�o=0;
		double z=55,a=250,o=0;
		DecimalFormat df =new DecimalFormat("#.00");// los ceros son los decimales a mostrar
			do{
				z=z+(z*0.07);
				a=a+(a*0.02);
				a�o++;
				
					if(z>a/2){
						o++;
					}
				
			}while(o==0);
		System.out.println("Poblacion de Zaire: "+df.format(z)+ " millones");
		System.out.println("Poblacion de Australia: "+df.format(a)+ " millones");
	
		System.out.println("En "+a�o+" a�os, la poblacion de Zaire ser� m�s de la mitad de la poblaci�n de Australia");
	}

}
