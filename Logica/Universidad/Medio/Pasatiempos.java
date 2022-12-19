package Medio;

public class Pasatiempos {

	public static void main(String[] args) {
		String p="",nueva="";
		int j=0,ascii=0;
		char caracter=0;
		
		System.out.println("Ingrese la frase:");
		p=Leer.dato();
		
			for(int i=0;i<p.length();i++){
				caracter=p.charAt(i);
				j=p.charAt(i);
				ascii= (char) j;
			
					switch(ascii){
					case 69:
					case 65: 
					case 73:
					case 79:
					case 85:
					case 97:
					case 101:
					case 105:
					case 111:
					case 117: caracter='.';  break;
					}
			
			nueva=nueva+caracter;
			
		}
		System.out.println(nueva);

	}

}
