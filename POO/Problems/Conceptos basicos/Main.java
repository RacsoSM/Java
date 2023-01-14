//ESTE MAIN ES EL EJECUTABLE DEL ARCHIVO "Operacion"
public class Main {
    public static void main(String[] args) {
        Operacion op = new Operacion(); //Creando objeto de la clase operacion

        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();


    }
}
