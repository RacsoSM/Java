public class Main {
    //@Override le indica a java que estamos sobre escribiendo un metodo o atributo heredado

      public static void main(String[] args) {
        Persona p1 = new Persona(); //Creamos los objetos de cada clase y llamamos a los metodos
        Perro d1 = new Perro();
        Vaca v1 = new Vaca();

        p1.comer();
        d1.comer();
        v1.comer();
      }
}
