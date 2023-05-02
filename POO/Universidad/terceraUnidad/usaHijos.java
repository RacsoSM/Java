package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase usa a las clases Padre, HijoB y HijoC cuyo proposito es demostrar el comportamiento de los constructores*/
public class usaHijos {
	public static void main(String[] args) {
		Padre objeto1 = new Padre();
		System.out.println(objeto1);
		
		HijoB objeto2 = new HijoB();
		System.out.println(objeto2);
		
	//	HijoC objeto3 = new HijoC(); //para crear esto, no hay ningun problema, usamos el constructor
	//  System.out.println(objeto3); //de la clase HijoC
		
		HijoC objeto4 = new HijoC(9); //para crear este objeto, tenemos que crear un constructor vacio
		System.out.println(objeto4); //ya que java no nos lo regalará, dentro de este constructor vacio
										//mandaremos llamar al constructor vacio de la clase padre
		
		/*Cuando la clase padre no tiene constructor explicito y las clases hijo si, no hay problema
		 * en crear objetos con los parametros, pero cuando se quiera crear un objeto sin parametros,
		 * nos dará un error, ya que al tener un constructor explicito en las clases hijo, Java no nos
		 * regalará el constructor vacio y tendremos que declararlo explicitamente o tendremos errores.
		 * 
		 * 
		 * 
		 * 
		 * Si el caso fuera de que la clase padre SI tiene un constructor y la clase hijo tiene o no tiene
		 * constructor, el problema se agranda ya que para crear un objeto con parametros o sin, necesitamos
		 * definir un constructor en cada clase hijo de forma explicita ya que la clase padre no tendrá implicita
		 * al declarar este constructor en la clase hijo, debemos llamar al constructor de la clase padre con super
		 * */
	}
}
