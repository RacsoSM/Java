package Medio;

public class CuadradoSinRelleno {

	public static void main(String[] args) {
		int n;
		System.out.println("Ingrese el tamaño del cuadrado: ");
		n=Leer.datoInt();
		
		
		
		for(int x=1; x<=n;x++){
			//Se repite hasta que x supere el valor de n
			
			if(x==1){
						for(int i=0; i<n;i++){
						//Se repite hasta que i supere el valor de n
						System.out.print(" * ");
						}	
			}
			
			if(x!=n && x!=1){
				
					for(int i=1; i<=n;i++){
						
							if(i == 1 || i == n){
					    	System.out.print(" * ");
							}
							
							else{
								System.out.print("   ");
							}	
						
					}	
					
			}
			
				if(x==n){
					
						for(int i=0; i<n;i++){
							System.out.print(" * ");
						}
						
				}	
				
			System.out.println("");
		}

	}
}


