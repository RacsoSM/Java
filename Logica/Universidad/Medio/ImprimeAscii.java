package Medio;

public class ImprimeAscii {

	public static void main(String[] args) {
		
		System.out.println("=== IMPRIMER CODIGO ASCII ===");
		for(int c=32;c<126;c++){
			System.out.println("[ Char "+c+"= "+(char) c+"]");
		}

	}

}
