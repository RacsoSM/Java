package ClasesAbstractas;
/*Una clase abstracta tiene siempre estas caracteristicas:
 * Es una clase padre
 * No se pueden instanciar objetos
 * Sirve para proporcionar una clase padre adecuada apropiada a partir de la cual heredan otras clases.
 */
public class Main {

    public static void main(String[] args) {
        Planta p1 = new Planta();
        AnimalCarnivoro ac1 = new AnimalCarnivoro();
        AnimalHerbivoro ah1 = new AnimalHerbivoro();
        
    }
    
}
