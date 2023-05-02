package terceraUnidad;
/*Santacruz Maldonado Oscar Said
 * Esta clase se encarga de usar la clase Point, ColorPoint y D3Point,
 * con esto buscamos demostrar algunas caracteristicas de los constructores 
 * y de la herencia*/
public class usaPunto {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(3,5);
		ColorPoint cp1 = new ColorPoint();
		D3Point t1 = new D3Point(1,2,3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(cp1);
		cp1.setX(4);
		System.out.println(cp1);
		p1.setY(9);
		System.out.println(p1);
		System.out.println(p2.medio(p1));
		System.out.println(cp1);
		
		System.out.println(t1);
		t1.setZ(5);
		System.out.println(t1);
	}
}
