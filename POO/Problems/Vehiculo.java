/*Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio,
 * imprima las propiedades del vehiculo mas barato. Para ello, se deberan leer por teclado las caracteristicas
 * de cada vehiculo y crear una clase que represente a cada uno de ellos
 */

 import java.util.Scanner;
public class Vehiculo {
    //Atributos
    private String marca;
    private String modelo;
    private float precio;

    
    //Constructor
    public Vehiculo(String marca, String modelo, float precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodo para obtener precio
    public float getPrecio(){
        return precio;
    }

    //Metodo para mostrar el resultado
    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+ "\nPrecio: $"+precio;
    }

    public static int indiceBarato(Vehiculo coches[]){
        int indice=0;
        float precio;

        precio = coches[0].getPrecio(); //Le damos a la variable local precio el valor del precio del primer coche

        for(int i=1;i<coches.length;i++){
            if(coches[i].getPrecio()<precio){ //Comparamos si el precio del coche actual es mayor al que tenemos (empezamos for en 1 para no repetir el coche)
                precio=coches[i].getPrecio();
                indice=i;
            }
        }

        return indice; //regresamos el indice del coche mas barato
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos;

        System.out.println("Digite la cantidad de vehiculos: ");
        numeroVehiculos=entrada.nextInt();


        //Creamos los objetos para los coches en un array de la clase Vehiculo
        Vehiculo coches[] = new Vehiculo [numeroVehiculos];

        for(int i=0;i<coches.length;i++){
            System.out.println("\nDigite las caracteristicas del coche "+(i+1));
            System.out.println("Introduzca marca: ");
            marca=entrada.nextLine();

            System.out.println("Introduzca el modelo: ");
            modelo=entrada.nextLine();

            System.out.println("Introduzca precio: ");
            precio=entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);
        }


    }
    
}
