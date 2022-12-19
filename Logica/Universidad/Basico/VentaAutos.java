package Basico;
//SANTACRUZ MALDONADO OSCAR SAID
public class VentaAutos {

	public static void main(String[] args) {
		
		String nom;
		int sb,sn,i,av,comision,bono;
		
			System.out.println("Ingrese el nombre del vendedor: ");
	        nom=Leer.dato();
	        
	        System.out.println("Cuantos autos vendió "+nom+" en el mes?: ");
	        av=Leer.datoInt();
	        
	        	comision=1500*av;
		        
			        if(av > 15) {
			        	bono=4000;
			        }
			        else {
			        	bono=0;
			        }
	        
		        sb=3500+comision+bono;
		        i=sb*25/100;
		        sn=sb-i;
	        
	        System.out.println("El nombre del vendedor es: "+nom);
	        System.out.println("El sueldo bruto del vendedor es: "+sb);
	        System.out.println("El impuesto del vendedor es: "+i);
	        System.out.println("El sueldo neto del vendedor es: "+sn);
        
	}

}
