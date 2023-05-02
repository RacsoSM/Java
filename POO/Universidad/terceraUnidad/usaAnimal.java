package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase usa las clases Animal, Perro, Gato, Vaca y Cerdo con el proposito de demostrar el funcionamiento
 * de la herencia.
 * */
public class usaAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal ("León");
		Object animal2 = new Animal ("Perro");
		Perro perro1 = new Perro ("Scoby"); 	//creamos un objeto de tipo Perro
		Gato gato1 = new Gato ("Sofi","Blanco");//creamos un objeto de tipo Gato
		Vaca vaca1 = new Vaca (750);			//creamos un objeto de tipo Vaca
		Cerdo cerdo1 = new Cerdo (120,2);		//creamos un objeto de tipo Cerdo
		
		System.out.println(animal1.toString()); //imprimimos el metodo toString que está en animal
		System.out.println(animal2); //imprimimos implicitamente el toString de animal, sin embargo este objeto es de tipo
		//estatico object, esto se puede hacer ya que object también tiene un metodo toString
		System.out.println(perro1);  //imprimimos implicitamente el toString de perro
		perro1.printSonido(); //mandamos llamar el metodo printSonido de perro
		
		System.out.println("\n"+gato1); //imprimimos el toString de gato
		gato1.printSonido();	//imprimimos el printSonido de la clase gato
		gato1.printMensaje();	//imprimimos el mensaje de la clase Animal que se heredó
		
		System.out.println("\n"+vaca1);
		vaca1.printSonido();
		
		System.out.println("\n"+cerdo1);
		cerdo1.printSonido();
		cerdo1.printMensaje();
		
		/*La herencia nos permite pasarle todos los comportamientos y atributos de la clase padre que son publicos
		 * o protected a la clase hijo, en esta clase, la clase padre es Animal y les pasa algunos atributos
		 * y metodos a las clases Perro, Gato, Vaca y Cerdo*/
		
	}
}
