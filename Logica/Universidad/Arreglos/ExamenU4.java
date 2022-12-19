package Arreglos;

public class ExamenU4 {

	public static void main(String[] args) {
		int n=0,x=0;
		
		System.out.println("Cuantos numeros desea generar?:");
		n=Leer.datoInt();

		int [] num = new int [n];
		System.out.println("VECTOR ORIGINAL");
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)(Math.random()*(80)+10);
			System.out.println(num[i]);
		}
		
		for (int i = 0; i < num.length; i++) {//CAMBIAMOS ELEMENTOS
			if (num[i]<20){
				num[i]=0;
				x++;
			}
			if (num[i]>50){
				num[i]=1;
				x++;
			}
			
		}
		
		System.out.println("VECTOR CAMBIADO"); // IMPRIMIMOS VECTOR
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		int tot= num.length-x;
		System.out.println("Los numeros que no cambiaron fueron: "+tot);
	}

}
