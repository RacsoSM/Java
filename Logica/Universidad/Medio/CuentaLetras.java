package Medio;

public class CuentaLetras
{

	public static void main(String[] args) 
	{
		int m=0,n=0;
		String word="";
		System.out.println("Ingrese su frase: ");
		word=Leer.dato();
		
		
			for(int i=0;i<word.length();i++){
				
			    char j=word.charAt(i);
				int ascii = (int)j;
				
					if(ascii>64 && ascii<91){
						m++;
					}
					if(ascii>47 && ascii<58){
						n++;
					}
			}
		System.out.println("Son "+m+" Letras Mayúsculas");
		System.out.println("Son "+n+" Numeros");
		
	}

}
