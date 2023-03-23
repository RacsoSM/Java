package segundaUnidad;

public enum maderaEnum {
	ROBLE ("Castaño verdoso", 800),  //pasamos al enum el tipo de madera, su color y su precio por kg 
    CAOBA ("Marron oscuro", 770),
    NOGAL("Marron rojizo", 820),
    CEREZO ("Marron cereza", 790),
    BOJ ("Marron negruzco", 675); 
	
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
			System.out.println("50 kg de madera de "+madera+" costaran  $"+madera.pesoPorCincuenta());
		}
	}

    /*En este programa establecemos tipos de madera dandoles como atributo un color y un precio por kilogramo,
     * y en base a esta informacion calculamos el precio que cada madera tendria por comprar 50 kilogramos de esta,
     * con un simple metodo que multiplica el precio de 1 kg * 50, posteriormente lo mostramos en el main.
     */
}
