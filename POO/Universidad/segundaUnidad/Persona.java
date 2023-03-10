package segundaUnidad;

public class Persona {

		private String nombre; //atributos de persona
		private double peso;
		private double altura;
		
		public Persona (String nombre, double peso, double altura){
			this.nombre = nombre; //constructor de persona
			this.peso = peso;
			this.altura = altura;
		}

		//metodos de persona
		public double calcularIMC(){	//formula para el imc peso(kg)/(altura(m))al cuadrado
			double imc = peso/ (altura*altura);
			return imc;
		}
		
		//getter y setter de nombre
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		//getter y setter de peso
		public double getPeso() {
			return peso;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}

		//getter y setter de altura
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
	
}
