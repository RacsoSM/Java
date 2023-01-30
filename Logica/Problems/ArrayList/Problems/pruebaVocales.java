import javax.swing.JOptionPane;
import java.util.ArrayList; // import the ArrayList class

public class pruebaVocales {
    

    /*Ingresar una frase por teclado y guardar en un vector todas las vocales, mostrar otro vector que sea el vector original pero quitando las vocales que se usaron */
    public static void main(String[] args) {
        String cast = "";
        String frase = JOptionPane.showInputDialog("Ingrese la oracion: ");

        ArrayList<String> vocales = new ArrayList<String>();    //ArrayList de vocales
        ArrayList<String> consonantes = new ArrayList<String>(); //ArrayList de consonantes

        for(int i=0;i<frase.length();i++){
            cast = String.valueOf(frase.charAt(i));     //Casteamos de char a string
          if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' ||frase.charAt(i) == 'i' ||frase.charAt(i) == 'o' ||frase.charAt(i) == 'u' ){
            vocales.add(cast);  //Si la letra actual es a,e,i,o,u la añadimos al arraylist de vocales
          }
          else if(frase.charAt(i) != ' '){
            consonantes.add(cast); //Si la letra actual es diferente de a,e,i,o,u y de un espacio en blanco, la añadimos al arraylist de consonantes
          }
        }

        System.out.println("VOCALES");
        for(int i=0;i<vocales.size();i++){
            System.out.println("["+vocales.get(i)+"]"); //Imprimimos vocales
        }

        System.out.println("CONSONANTES");
        for(int i=0;i<consonantes.size();i++){
            System.out.println("["+consonantes.get(i)+"]"); //Imprimimos consonantes
        }

    }
}
