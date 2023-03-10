package segundaUnidad;

public class Triangulo {
	//ATRIBUTOS
	private double lado1;
	private double lado2;
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	
	//CONSTRUCTOR
	public Triangulo(double lado1, double lado2,double base, double altura){
		this.lado1=lado1;
		this.lado2=lado2;
		this.base = base;
		this.altura =altura;
	}

	//METODOS
	public double calcularArea (){ 
		double area = base*altura/2;
		return area;
	}
	
	public double calcularPerimetro (){
		double perimetro = lado1+lado2+base;
		return perimetro;
	}

	//getter y setter de base
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

	//getter y setter de altura
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//getter y setter de lado1
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	//getter y setter de lado2
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String toString (){
		return "lado 1: "+lado1+" lado 2: "+lado2+ "base: "+base+" altura: "+altura+ "area: "+area+" perimetro: "+perimetro;
	}
}
