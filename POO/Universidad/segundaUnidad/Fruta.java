package segundaUnidad;

public class Fruta {
	String nombre; //declaramos atributos
	int gramos;
	int caloriasPorGramo;
	
	public Fruta(String n){ //constructor con el nombre
		nombre=n;
	}
	
	public void setPeso (int g){ //set del peso
		gramos=g;
	}
	public int getPeso(){ //get del peso
		return gramos;
	}
	
	public void setCalorias (int c){//set de las calorias
		caloriasPorGramo=c;
	}
	public int getCalorias(){//get de las calorias
		return caloriasPorGramo;
	}

	public int totalCalorias(){
		return gramos*caloriasPorGramo;
	}
	
	public String toString(){ //metodo toString
		return nombre+" peso: "+gramos+" gramos.";
	}
}
