public class MainAutomovil {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil(12000, "azul", "toyota", 2015); //Usamos el primer constructor ya que es al que le hemos dado 4 parametros
        auto1.acelerar();   //Usamos el primer metodo acelerar ya que no tiene parametros.

        Automovil auto2 = new Automovil(50000); //Usamos el segundo constructor ya que solo nos pide un parametro
        auto2.acelerar(120); //Usamos el segundo metodo acelerar ya que nos pide una cantidad en km
    }
    
}
