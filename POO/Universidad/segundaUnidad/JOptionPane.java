package segundaUnidad;
	public class JOptionPane {
	    
	    public static void main(String[] args) {
	        
	        //ES PARA QUE LA ENTRADA Y SALIDA DE DATOS NO SEA POR CONSOLA SI NO UN POCO MAS GRAFICA

	        String cadena; 
	        int entero; 
	        char letra; 
	        double decimal;

	        cadena = javax.swing.JOptionPane.showInputDialog( "Digite una cadena: "); //LEER UN STRING
	        entero= Integer.parseInt(javax.swing.JOptionPane.showInputDialog( "Digite un entero: ")); //LEER UN ENTERO
	        letra = javax.swing.JOptionPane.showInputDialog("Digite un caracter: ").charAt(0); //LEER UN CHAR
	        decimal= Double.parseDouble(javax.swing.JOptionPane.showInputDialog( "Digite un decimal: ")); //LEER UN DOUBLE

	        javax.swing.JOptionPane.showMessageDialog(null, "La cadena es "+cadena); //MOSTRAR UN STRING
	        javax.swing.JOptionPane.showMessageDialog(null, "El entero es "+entero); //MOSTRAR UN ENTERO
	        javax.swing.JOptionPane.showMessageDialog(null, "El caracter es "+letra); //MOSTRAR UN CHAR
	        javax.swing.JOptionPane.showMessageDialog(null, "El numero decimal es "+decimal); //MOSTRAR UN DOUBLE
	    }
	}

