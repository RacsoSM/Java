package Basico;

public class CalculaPromedio {

	public static void main(String[] args) {
		
	//PARA ESTE PROGRAMA UNA CALIFICACION DE 7 ES APROBATORIA Y MENOR DE 7 ES REPROBATORIA
		
		String nom,text;
		int cal[],ac = 0,prom;
		cal= new int[4];
		
		System.out.println("Ingrese el nombre del estudiante: ");
		nom=Leer.dato();
		
		for(int i=1;i<cal.length;i++){
			System.out.println("Ingrese la calificacion numero "+i+ " del estudiante");
			cal[i]=Leer.datoInt();
			ac+=cal[i];
		}
		
		prom=ac/3;
		System.out.println("El promedio es : "+prom+"\n");
		
		if(prom>=7){
			text="APROBADO";
		}
		else{
			text="REPROBADO";
		}
		
		System.out.println("Nombre del alumno: "+nom);
		System.out.println("Calificación numero 1: "+cal[1]);
		System.out.println("Calificación numero 2: "+cal[2]);
		System.out.println("Calificación numero 3: "+cal[3]);
		System.out.println("El promedio de "+nom+" es : "+prom+"\n");
		System.out.println("El alumno fue "+text);
	}
}
