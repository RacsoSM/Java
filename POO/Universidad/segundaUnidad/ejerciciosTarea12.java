package segundaUnidad;

public class ejerciciosTarea12 {
	
	
	public static void main(String[] args) {
		int k=0;
		//MAIN
		 Punto p1 = new Punto (9,7); //puntos para el problema 10 y 11
		 Punto p2 = new Punto (6,8);
		 
		
		//problema 10
		System.out.println("Resultado problema 10: "+p1.toString(k));
		metodo10(p1,1,2);
		System.out.println("Resultado problema 10: "+p1.toString(k));
		
		//problema 11
		System.out.println("Resultado problema 11: "+metodo11(p1,p2));
		
				 Punto [] arrayPuntos= new Punto [6]; //llenamos array de puntos para problema 13
				 arrayPuntos[0] = p1;
				 arrayPuntos[1] = p2;
				 arrayPuntos[2] = new Punto (0,0);
				 arrayPuntos[3] = new Punto (6,14);
				 arrayPuntos[4] = new Punto (1,3);
				 arrayPuntos[5] = new Punto (0,0);
		 
		//problema 13
		System.out.println("Resultado problema 13: "+metodo13(arrayPuntos));
	}

	//METODOS
	//Problema 10: Cambia las coordenadas de un punto
	public static void metodo10 (Punto p1,int newX, int newY){
		p1.x=newX;
		p1.y=newY;
	}


	//Problema 11: Recibe 2 puntos como parametro y calcula su pendiente
	public static double metodo11(Punto p1,Punto p2){
			double x1,x2,y1,y2;
			double pendiente;
			
			x1=p1.x;
			x2=p2.x;
			
			y1=p1.y;
			y2=p2.y;
			
			pendiente = (y2-y1)/(x2-x1);
			
			return pendiente;
	}

	//Problema 13: Recibe como parametro un array de puntos y regresa cuantos estan en el 0,0
	public static int metodo13(Punto [] arrayPuntos){
		int contador = 0;
		for(Punto p:arrayPuntos){
			
			if(p.x==0 && p.y ==0)
				contador++;
		}
		
		return contador;
	}
	
	
	
	//Problema 1: Devuelve el numero de letras x que contiene un String
	public static int metodo1 (String palabra, char x){
		int contador=0;
		
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)==x){
				contador++;
			}
		}
		return contador;
	}
	
	//Problema 2: Obtiene el total de caracteres digitos de un string
	public static int metodo2 (String frase){
		
		int contador=0;
		for (int i = 0; i < frase.length(); i++) {
			if(Character.isDigit(frase.charAt(i))){
				contador++;
			}
		}
		return contador;
	}
	
	//problema 3: Regresa true si el numero es par y false si es impar
	public static boolean metodo3 (int num){
		boolean res;
		res = (num%2==0)? true:  false;
		return res;
	}
	
	//problema 4: regresa true si es primo y falso si no es primo
	public static boolean metodo4 (int num){
		int contador=0;
		
		for (int i = num; i > 1; i--) {
		
			if(num%i==0)
				contador++;
			
			if(contador==2)
			return false;
		}
		return true;
	}
	
	//problema 5: recibe un numero del 0 al 100 y lo regresa escrito en letras
	public static String metodo5 (int num){
		int dec=num/10,uni=num%10;
		String [] unidades={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
		String [] decenas = {" "," ","veinti","treinta y ","cuarenta y ","cincuenta y ","sesenta y ","setenta y ","ochenta y ","noventa y "};
	
		if(num<=10) return unidades[num];
		
		switch (num){
		//casos especiales del 11 al 19
		case 11: return "once"; case 12: return "doce"; case 13: return "trece"; case 14: return "catorce"; case 15: return "quince";
		case 16: return "dieciseis"; case 17: return "diecisiete"; case 18: return "dieciocho"; case 19: return "diecinueve";
		
		//casos especiales de cada decena
		case 20: return "veinte"; case 30: return "treinta"; case 40: return "cuarenta"; case 50: return "cincuenta";
		case 60: return "sesenta"; case 70: return "setenta"; case 80: return "ochenta"; case 90: return "noventa";
		case 100: return "cien";
		}
		
		//si el numero no es un caso especial, lo creamos con los prefijos
		String numero = decenas[dec]+unidades[uni];
		return numero;
	}
	
	
	
}
