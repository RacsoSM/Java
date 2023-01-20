public class Automovil {
    //Atributos
    int kilometraje;
    String color;
    String marca;
    int año;
    int precio;

    public Automovil (int kilometraje, String color, String marca, int año ){   //Primer constructor 
        this.kilometraje = kilometraje;
        this.color = color;
        this.marca = marca;
        this.año = año;
    }
    public Automovil (int precio){  //Segundo constructor para provocar la sobrecarga
        this.precio=precio;
    }

    public void acelerar (){ //Primer metodo acelerar
        System.out.println("El auto "+color+" del año "+ año+ " ha empezado a acelerar");
    }
    public void acelerar (int km){ //Segundo metodo acelerar
        System.out.println("El auto "+color+" del año "+ año+ " ha empezado a acelerar a "+km+" kilometros por hora");
    }

    //En una sobrecarga, los metodos solamente se distinguen por la cantidad de sus parametros o por el tipo de sus parametros.
}
