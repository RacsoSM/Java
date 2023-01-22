public class c2 {
    public static void main(String[] args) {
      
        c1 ob = new c1();

        ob.setEdad(18);//Usamos metodo setter para dar un valor a la edad
        System.out.println("La edad es: "+ob.getEdad()); //Mostramos con el metodo getter

        ob.setNombre("Oscar");
        System.out.println("El nombre es: "+ob.getNombre());


    }
}
