package Basico;
//SANTACRUZ MALDONADO OSCAR SAID
public class CalculaMorraya {

	public static void main(String[] args) {
		int res,acu,sueldo;

		System.out.println("Ingrese su sueldo: ");
		sueldo=Leer.datoInt();
			
			acu=sueldo/1000;                                        //Calculamos cuantos billetes de 1000 se necesitaran 
			res=sueldo-(acu*1000);
			System.out.println(acu+" Billetes de 1000");
	
			
			acu=res/500;											//Calculamos cuantos billetes de 500 se necesitaran 
			res=res-(acu*500);
			System.out.println(acu+" Billetes de 500");
		
			
			acu=res/200;											//Calculamos cuantos billetes de 200 se necesitaran 
			res=res-(acu*200);
			System.out.println(acu+" Billetes de 200");
		
			
			acu=res/100;											//Calculamos cuantos billetes de 100 se necesitaran 
			res=res-(acu*100);
			System.out.println(acu+" Billetes de 100");
		
			
			acu=res/50;												//Calculamos cuantos billetes de 50 se necesitaran 
			res=res-(acu*50);
			System.out.println(acu+" Billetes de 50");
			
			
			acu=res/20;												//Calculamos cuantos billetes de 20 se necesitaran 
			res=res-(acu*20);
			System.out.println(acu+" Billetes de 20");
			
			acu=res/10;												//Calculamos cuantas monedas de 10 se necesitaran 
			res=res-(acu*10);
			System.out.println(acu+" Monedas de 10");
			
			acu=res/5;												//Calculamos cuantas monedas de 5 se necesitaran  
			res=res-(acu*5);
			System.out.println(acu+" Monedas de 5");
			
			acu=res/2;												//Calculamos cuantas monedas de 2 se necesitaran 
			res=res-(acu*2);
			System.out.println(acu+" Monedas de 2");
			
			acu=res/1;												//Calculamos cuantas monedas de 1 se necesitaran 
			res=res-(acu*1);
			System.out.println(acu+" Monedas de 1");
	}

}
