import paquete1.clase1;

public class clase3 {
    public static void main(String[] args) {
       

        /*NOTA: SI LA CLASE QUE QUEREMOS USAR ESTA ABIERTA EN LAS PESTAÑAS ARRIBA DE VS STUDIO, NOS DEJA USARLA AUN SIN IMPORTARLA, SI NO, DEBEMOS IMPORTAR SU RUTA. */
       

        clase1 objeto2 = new clase1();

        objeto2.atributo1=10;

        System.out.println("\n"+objeto2.atributo1);
    }

}
