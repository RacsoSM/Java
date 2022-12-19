package Medio;

public class MultasTransito {

	public static void main(String[] args) {
		int c=0,vr=0,vp=0,ct=200,ex=0,con=0;
		String conductor="";
		System.out.println("¿Cuantos conductores desea evaluar?");
		c=Leer.datoInt();
		
		for (int i = 1; i <= c; i++) {
			ct=200;
			System.out.println("Ingrese el nombre del conductor: ");
			conductor=Leer.dato();
			System.out.println("Ingrese la velocidad registrada: ");
			vr=Leer.datoInt();
			System.out.println("Ingrese la velocidad permitida: ");
			vp=Leer.datoInt();
			
			if(vr<vp|| vr==vp){
				System.out.println("Disculpe, hubo un problema con usted, no debe nada");
				continue;
			}
			if (vr-vp<=10) {
				ex=20;
			}
			if (vr-vp>=10) {
				ex=30;
			}
			
			ct=ct+((vr-vp)*ex);
			System.out.println("Nombre del conductor: "+conductor);
			System.out.println("Costo de la multa: $"+ct);
			System.out.println("\n");
			con+=ct;
		}
		System.out.println("El costo total de las multas es de: $"+con);
	}
}