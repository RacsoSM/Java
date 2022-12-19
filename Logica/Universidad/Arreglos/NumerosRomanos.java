package Arreglos;
//SANTACRUZ MALDONADO OSCAR SAID
public class NumerosRomanos {

	public static void main(String[] args) {
		int n=0,sobras=0,transicion=0;
		System.out.println("Cuantos numeros desea generar?: ");
		n=Leer.datoInt();
		int numeros [] = new int [n];
		String  roman ="";
		String [] u= {"I","II","III","IV","V","VI","VII","VIII","IX"};
		String [] d= {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String [] c= {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String [] m= {"M","MM","MMM"};
		
		
		for (int i = 0; i < numeros.length; i++) {
			transicion=0; sobras=0; roman="";
			System.out.println("Ingrese el numero (Limite 3000):");
			numeros[i]=Leer.datoInt();
			
			if(numeros[i]>3000){
				System.out.println("El numero no esta dentro del rango permitido");
				System.out.println("\n");
				continue;
			}
			transicion= numeros[i]/1000;
			sobras= (numeros[i])-transicion*1000;
				if(transicion!=0){
				roman=m[transicion-1];
				}
			transicion= sobras/100;
			sobras= (sobras)-transicion*100;
				if(transicion!=0){
				roman=roman+c[transicion-1];
				}
			transicion= sobras/10;
			sobras= (sobras)-transicion*10;
				if(transicion!=0){
				roman=roman+d[transicion-1];
				}
			transicion= sobras/1;
			sobras= (sobras)-transicion*1;
				if(transicion!=0){
				roman=roman+u[transicion-1];
				}
			System.out.println("Numero ingresado: "+numeros[i]);
			System.out.println("Conversion a numero romano: "+roman);
			System.out.println("\n");
		}
	}
}
