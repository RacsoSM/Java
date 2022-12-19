package Arreglos;

public class Alumnos {

	public static void main(String[] args) {
		
		int n=0;
		
		System.out.println("Ingrese el numero de alumnos/as  que va a ingresar: ");
		n=Leer.datoInt();
		
		String [] nomh = new String [n];
		String [] nomf = new String [n];
		String [] nomt = new String [n*2];
		
		

		for (int i = 0; i < n; i++) {//LLENAMOS EL VECTOR nomh QUE ES EL DE LOS NOMBRES DE ALUMNOS MASCULINOS
			System.out.println("Ingrese el nombre del alumno N"+(i+1));
			nomh[i]=Leer.dato();
		}
		
		System.out.println("\n");
		for (int j = 0; j < n; j++) {//LLENAMOS EL VECTOR nomf QUE ES EL DE LOS NOMBRES DE ALUMNAS FEMENINAS
			System.out.println("Ingrese el nombre de la alumna N"+(j+1));
			nomf[j]=Leer.dato();
		}
		
		System.out.println("\n");
		System.out.println("\n");
		
		for (int x = 0; x <n; x++) {//IMPRIMIMOS LOS NOMBRES UNO Y UNO MIENTRAS LLENAMOS EL VECTOR CON TODOS LOS NOMBRES
			System.out.println(nomh[x]);
			System.out.println(nomf[x]);
				nomt[x]=nomf[x];
				nomt[x+n]=nomh[x];
		}
		
		System.out.println("\n");
		System.out.println("\n");
		
		for (int z = 0; z < nomt.length; z++) { //IMPRIMIMOS EL VECTOR CON TODOS LOS NOMBRES JUNTOS
			System.out.println(nomt[z]);
		}

	}

}
