package Medio;
//SANTACRUZ MALDONADO OSCAR SAID
public class InviertePalabras {

	public static void main(String[] args) {
int n=1;
		
		do{
			String word="";
			System.out.println("\nIngrese la palabra: ");
			word=Leer.dato();
			
				for(int i=word.length()-1; i>-1;i--){
					System.out.print(word.charAt(i));
				}
			System.out.println("\n\nDesea ingresar otra palabra? (1:SI, 0:NO)");
			n=Leer.datoInt();
		}while(n!=0);
	
	}

}
