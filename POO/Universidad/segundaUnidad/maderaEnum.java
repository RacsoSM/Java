package segundaUnidad;

public enum maderaEnum {
	ROBLE ("Casta�o verdoso", 800),  //pasamos al enum el tipo de madera, su color y su precio por kg 
    CAOBA ("Marr�n oscuro", 770),
    NOGAL("Marr�n rojizo", 820),
    CEREZO ("Marr�n cereza", 790),
    BOJ ("Marr�n negruzco", 675); 
	
    private final String color; //declaramos estos atributos como final
    private final int precioPorKg; 

    
    maderaEnum (String color, int precioPorKg) {  //creamos un constructor con estos dos atributos 
        this.color = color;
        this.precioPorKg = precioPorKg;
    }

    public int pesoPorCincuenta(){  //calculamos la compra promedio que alguien hace de madera (50kg) 
    	return precioPorKg*50;
    }

    public String getColor() {//getter para obtener el color
    	return color;
    }

    public int getPrecioPorKg() { //getter para obtener el precioPorKg
    	return precioPorKg;
    }
    
    public static void main(String[] args) {
		for (maderaEnum madera:maderaEnum.values()) {
			System.out.println("50 kg de madera de "+madera+" costar�n  $"+madera.pesoPorCincuenta());
		}
	}
}
