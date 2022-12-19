package Arreglos;

public class pruebas_arreglos {

	public static void main(String[] args) {
	
		//DIFERENTES FORMAS DE LLAMAR A UN ARRAY
		int a=2,b=6;
		int [] num = new int [7];
		for (int i = 0; i < 7; i++) 
			num[i]=0;
		num[1]=3;
		num[a]=b;
		num[b-a]=10;
		num[num[1]]=-7;
		num[0]=num[a];
		for(int i=0;i<7;i++)
		System.out.println("num["+i+"]="+num[i]);
	}

}
