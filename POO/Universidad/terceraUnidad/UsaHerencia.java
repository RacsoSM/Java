package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Programa que usa a las clases Uno,A,G,D,H,C y X
 * Este programa tiene la finalidad de demostrar la herencia entre las clases y las llamadas a constructores*/
public class UsaHerencia {
	
	public static void main(String[] args) {
		System.out.println("Creacion de objeto de tipo 'Uno'");
		Uno objetoUno = new Uno();
		System.out.println("Valor del atributo: "+objetoUno.atributoUno);
		
		System.out.println("\nCreacion de objeto de tipo 'objetoA'");
		A objetoA = new A();
		System.out.println("Valor del atributo: "+objetoA.atributoA);
		
		System.out.println("\nCreacion de objeto de tipo 'objetoG'");
		G objetoG = new G();
		System.out.println("Valor del atributo: "+objetoG.atributoG);
		
		System.out.println("\nCreacion de objeto de tipo 'objetoD'");
		D objetoD = new D();
		System.out.println("Valor del atributo: "+objetoD.atributoD);
		
		System.out.println("\nCreacion de objeto de tipo 'objetoH'");
		H objetoH = new H();
		System.out.println("Valor del atributo: "+objetoH.atributoH);
		
		System.out.println("\nCreacion de objeto de tipo 'objetoC'");
		C objetoC = new C();
		System.out.println("Valor del atributo: "+objetoC.atributoC);
		
		System.out.println("\nCreacion de objeto de tipo 'objetoX'");
		X objetoX = new X();
		System.out.println("Valor del atributo: "+objetoX.atributoX);
		
		System.out.println("\n\nAccediendo a los atributos y metodos de la clase base desde las clases derivadas");
		
		System.out.println("Accediendo al valor del atributo uno desde el objeto H:"+objetoH.atributoUno); //accediendo al atributo desde la clase H
		System.out.println("La suma de los atributos de todos las clases arriba de la jerarquia de X es: "+objetoX.sumaAtributos());
		System.out.println("La suma de los atributos de todas las clases arriba de la jerarquia de C es: "+objetoC.sumaAtributos());
	}
}

/*No encontré errores de compliación, al crear objetos se manda a llamar el constructor de la clase
 * que estamos utilizando, en todas las clases tenemos la instrucción de un system.out que nos muestra
 * en que clase estamos, por lo que en ejecucion se muestra "Clase A" o depende de la clase en la que
 * estemos, si estamos en una clase derivada, lo primero que se hace es llamar al constructor de la clase
 * padre y asi sucesivamente hasta que llegue al padre de todas las clases, posteriormente
 * luego ejecutar las demas sentencias que esten dentro del constructor.
 * Para demostrar que estamos usando un metodo heredado, simplemente creamos un objeto que sea de una
 * clase derivada y accedemos a un metodo o atributo de una clase que este arriba en la jerarquia de esta clase
 * derivada, si podemos usarla aplicamos correctamente la herencia. Ademas creamos metodos en algunas clases hasta
 * abajo de la jerarquia que se encargan de sumar todos los atributos de las clases arriba en la jerarquia
 * usando el super*/
 