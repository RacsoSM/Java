package Basico;

public class ParImpar {

	public static void main(String[] args) {
		int n=0,num=0,c=0,p=0,ip=0;
		System.out.print("Cuantos numeros quieres?: ");
		n=Leer.datoInt();
		do{
			num=(int)(Math.random()*100);
			if(num<20)continue; 
			if(num>50)continue;
			
			System.out.println(num);
			
			if(num%2 == 0){
				p+=1;
			}
			else{
				ip+=1;
			}
				
			c=c+1;
		}while(c<=n-1);
		
		System.out.println("En total se obtuvieron "+p+" numeros pares");
		System.out.println("En total se obtuvieron "+ip+" numeros impares");

}
}


