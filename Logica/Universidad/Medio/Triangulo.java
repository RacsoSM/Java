package Medio;

public class Triangulo {

	public static void main(String[] args) {
	
		int n=0,e=0,f=1;
		System.out.println("Ingrese la altura del triangulo: ");
		n=Leer.datoInt();
		System.out.println("=== IMPRIME UN TRIANGULO ===");
		
/*	for(int x=0; x<n;x++){
			
			
			for(int i=0; i<x;i++){
				System.out.print(" * ");
			}	
			
			
		System.out.println("");
		}
	
	System.out.println("=== PERIMETRO DEL TRIANGULO ===");
	for(int x=1; x<=n;x++){
		
		
		for(int i=1; i<=x;i++){
			if(x==1 || x==n || i==1 || x==i){
			System.out.print(" * ");
			}
			else{
				System.out.print("   ");
			}
		}	
		
		
	System.out.println("");
	}
	*/
	System.out.println("=== TRIANGULO COMO PINO ===");
	
	if(n%2!=0){
		e=n/2;
	}
	else{
		n++;
		e=n/2;
	}
	System.out.println(e);
	
	
	
		
	
			for(int i=1; i<=e; i++){
				
			
					for(int p=0;p<=e;p++){
				System.out.print(" ");
					
							for(int o=0;o<=f;o++){
								
								System.out.print("X");
								
							}
					
					
					
					
					
					}
					System.out.println();
					f=f+2;
			}
	
	
	
	
	

	
	
}

}

