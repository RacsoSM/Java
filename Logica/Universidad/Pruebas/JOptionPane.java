import javax.swing.JOptionPane; //NECESARIO IMPORTAR PARA USAR ESTA CLASE
public class JOptionPane {
    
    public static void main(String[] args) {
        
        //ES PARA QUE LA ENTRADA Y SALIDA DE DATOS NO SEA POR CONSOLA SI NO UN POCO MAS GRAFICA

        String cadena; 
        int entero; 
        char letra; 
        double decimal;

        cadena = javax.swing.JOptionPane.showInputDialog( "Digite una cadena: ");
        entero= Integer.parseInt(javax.swing.JOptionPane.showInputDialog( "Digite un entero: "));
        letra = javax.swing.JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal= Double.parseDouble(javax.swing.JOptionPane.showInputDialog( "Digite un decimal: "));

        javax.swing.JOptionPane.showMessageDialog(null, "La cadena es "+cadena);
    }
}