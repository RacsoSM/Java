package Medio;

public class NumerosCapicua {

	public static void main(String[] args) {
		//MI SOLUCION
		int nn1=0,nn2=0,nn3=0;
		String n="",n1="",n2="",n3="";
		for(int i=10;i<1000;i++){
			
			
			if(i<100){
				n= String.valueOf(i);
				n1=n.substring(0,1);
				n2=n.substring(1,2);
				nn1 = Integer.parseInt(n1); 
				nn2 = Integer.parseInt(n2); 
					if(nn1==nn2){
						System.out.println(n1+n2);
					}
			}
			
			if(i<1000 && i>100){
				n= String.valueOf(i);
				n1=n.substring(0,1);
				n2=n.substring(1,2);
				n3=n.substring(2,3);
				
				  nn1 = Integer.parseInt(n1); 
				  nn3 = Integer.parseInt(n3); 
				if(nn1==nn3){
					System.out.println(n1+n2+n3);
				}
			}
		}
		
		
}

}
