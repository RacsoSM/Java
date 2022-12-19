package Arreglos;

public class NumerosDivisibles {

	public static void main(String[] args) {
		int n=0,c=0;
		int [] Num ={7,15,60,9,12,21,33,20,14,26};
		
		for (int k = 0; k < Num.length; k++) {
			c=0;
				for (int i = Num[k]; i > 0; i--) {
						if(Num[k]%i==0){
							c++;
						}
				}
					if (c>5){
						System.out.println("El numero "+Num[k]+" tiene "+c+" divisores");
						n++;
					}
		}
		System.out.println("\nSe encontraron "+n+" numeros que tienen mas de 5 divisores");
	}

}
