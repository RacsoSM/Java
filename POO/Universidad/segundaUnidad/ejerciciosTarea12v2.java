package segundaUnidad;

import java.util.Arrays;

public class ejerciciosTarea12v2 {

	
	public static void main(String[] args) {
		//problema 14
		System.out.println("Resultado metodo 14: "+metodo14(85));
		
		//problema 15
		System.out.println("Resultado metodo 15: "+metodo15(155.9));
		
		//problema 16
		System.out.println("Resultado metodo 16: "+metodo16(10));
		
		//problema 17
		System.out.println("Resultado metodo 17: "+metodo17(125));
		
		//problema 18
		System.out.println("Resultado metodo 18: "+metodo18("reconocer"));
		
		//problema 19
		System.out.println("Resultado metodo 19: "+metodo19("hola como estas hoy"));
		
		//problema 20
		System.out.println("Resultado metodo 20: "+metodo20());
		
		//problema 21
		System.out.println("Resultado metodo 21: "+Arrays.toString(metodo21(150)));
		
		int array1 [] = {1,7,8,14,60};
		int array2 [] = {3,5,9,19,20};
		//problema 22
		System.out.println("Resultado metodo 22: "+Arrays.toString(metodo22(array1,array2)));
		
		
	}
	
	//Problema 14: Recibe un entero 0-99 y regresa el numero de decenas
	public static int metodo14 (int i){
		return i/10;
	}
	
	//Problema 15: Recibe una cantidad en pesos y regresala en dolares (20.17 pesos = 1 dolar)
	public static double metodo15 (double pesos){
		return pesos/20.17;
	}
	
	//problema 16: Recibe una cantidad en dolares y regresala en pesos (20.17 pesos = 1 dolar)
	public static double metodo16 (double dolares){
		return dolares*20.17;
	}
	
	//problema 17: Recibe un entero y regresa un boolean true si el numero esta en el rango 0-100
	public static boolean metodo17 (int num){
		if(num>0 && num<100)
			return true;
		return false;
	}
	
	//problema 18: Recibe una frase, regresa un boolean true si es palindromo, false si no
	public static boolean metodo18 (String frase){
		int pointer=frase.length()-1;
		
		for(int i=0;i<frase.length()/2;i++){
			if(frase.charAt(i)==frase.charAt(pointer))
				pointer--;
			
			else
				return false;
		}
		return true;
	}
	
	//problema 19: Recibe una frase, cuenta cuantas palabras hay (estan separadas por espacios)
	public static int metodo19 (String frase){
		int palabras=0;
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)==' ')
				palabras++;
		}
			
		return palabras+1;
	}
	
	//problema 20: regresa un valor aleatorio entre 1-6
	public static int metodo20 (){
		int	num=(int)(1+Math.random()*6);
		//genera numero aleatorio del 0 al 1, lo multiplica por 6 y le suma 1
			 
	return num;
	}
	
	//problema 21: recibe un numero y regresa un array con todos sus divisores
	public static int [] metodo21 (int num){
		int x=0;
		
			for (int i = num; i > 0; i--) { //vemos cuantos divisores tiene para determinar el tamaño del array
				if(num%i == 0)				//podriamos evitar esto usando un arraylist
					x++;
			}
		
		int [] arr = new int [x];
		x=0;
		
			for (int i = num; i > 0; i--) { 
				if(num%i == 0)	{
					arr[x]=i; //guardamos el divisor en el array
					x++;
				}
			}
		return arr;
	}
	
	//problema 22: recibe 2 arrays de enteros y regresa otro array de resultados
	public static int [] metodo22 (int [] arr1, int [] arr2){
		int [] resultados = new int [arr1.length];
		
		for (int i = 0; i < resultados.length; i++) 
			resultados[i] = arr1[i]+arr2[i];
		
		return resultados;
	}
}
