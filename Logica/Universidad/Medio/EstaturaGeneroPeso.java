package Medio;

public class EstaturaGeneroPeso {

	public static void main(String[] args) {
		int est=0,peso=0,n=0,cpeso=0,pesop=0,ch=0,conm=0;
		String g="";
		
		
		System.out.println("Ingrese cuantos estudiantes quiere registrar: ");
		n=Leer.datoInt();
		
		for(int i=1; i<=n; i++){
			
			System.out.println("Estudiante numero "+i);
		System.out.println("Ingrese la estatura en centimetros: ");
		est=Leer.datoInt();
		
		do{
		System.out.println("Ingrese el genero (H=HOMBRE M=MUJER): ");
		g=Leer.dato();
		}while(!g.equalsIgnoreCase("H") && !g.equalsIgnoreCase("M"));
		
		System.out.println("Ingrese el peso en kilogramos: ");
		peso=Leer.datoInt();
		
		if(g.equalsIgnoreCase("H")){
			if(peso>90 && est < 165){
				ch++;
			}
		}
		else{
			if(est>170 && est<180){
				conm++;
			}
		}
		
		cpeso=cpeso+peso;
		pesop=cpeso/n; //PESO PROMEDIO DE TODOS
		System.out.println("\n");
		}
		System.out.println("\n\n");
		System.out.println("El peso promedio de todos es de: "+pesop);
		System.out.println("Hay "+conm+" mujeres que miden entre 170 y 180 centimentros");
		System.out.println("Hay "+ch+" hombres que pesan mas de 90 kilogramos y miden menos de 165 centimetros");
		
	}

}
