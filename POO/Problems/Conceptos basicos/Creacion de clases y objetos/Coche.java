
//Public = modificador de acceso.
//class = palabra por defecto para definir una clase
//Coche = nombre de la clase
public class Coche {
   //Atributos
   String color;
   String marca;
   int km;

   //Metodo
   public static void main(String[] args) {
       
       //Creacion del objeto
       Coche coche1 = new Coche(); //coche1 pertenece a la clase coche por lo que tiene todos sus atributos

       //Rellenando los atributos del objeto
       coche1.color = "Blanco";
       coche1.marca = "Audi";
       coche1.km = 0;

       System.out.println("El color del coche1 es: "+coche1.color);
       System.out.println("La marca del coche1 es: "+coche1.marca);
       System.out.println("El kilonetraje del coche1 es: "+coche1.km);


       Coche coche2 = new Coche();

       coche2.color = "Rojo";
       coche2.marca = "Ferrari";
       coche2.km = 100;

       System.out.println("\n\nEl color del coche2 es: "+coche2.color);
       System.out.println("La marca del coche2 es: "+coche2.marca);
       System.out.println("El kilonetraje del coche2 es: "+coche2.km);
   }
    
    
}

