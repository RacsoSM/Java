package Basico;
//SANTACRUZ MALDONADO OSCAR SAID
public class TemperaturaSemana {

	public static void main(String[] args) {
	
		int temp=0,dia=1,diam=0,menor=1000,prom=0,suma=0;
		String cuando="";
		
		do{
			System.out.print("Ingresa la temperatura del dia "+dia+": ");
			temp=Leer.datoInt();
			
			if(temp<menor){
				menor=temp;
				diam=dia;
			}
			dia=dia+1;
			suma=suma+temp;
		}while(dia<=7);
		prom=suma/7;
		System.out.println("El promedio de temperatura es: "+prom);
		System.out.println("La temperatura mas baja fue de "+menor+" grados");
		switch(diam){
		case 1: cuando="Lunes";		 break;
		case 2: cuando="Martes";	 break;
		case 3: cuando="Miercoles";	 break;
		case 4: cuando="Jueves"; 	 break;
		case 5: cuando="Viernes";	 break;
		case 6: cuando="Sabado"; 	 break;
		case 7: cuando="Domingo";	 break;
		}
		
		System.out.println("y ocurrio el dia "+cuando);
	}

	}
		
		
		
		
		
	/*MI SOLUCION
	 * int i,dia = 0;
		double deg[],ac=0,totdeg,tempmin = 0,tem=0,cd=0;
		deg = new double[8];
	
			for(i=1;i<deg.length;i++){
				System.out.println("Ingrese la temperatura del dia numero "+i+":");
				deg[i]=Leer.datoDouble();	
				ac+=deg[i];
				if(deg[i-1]<deg[i]){
					tempmin=deg[i-1];
					cd=i;
				}
				
				}
			
			if(deg[1]<deg[2]&&deg[1]<deg[3]&&deg[1]<deg[4]&&deg[1]<deg[5]&&deg[1]<deg[6]&&deg[1]<deg[7]){
				tempmin=deg[1];
				cd=1;
			}
			if(deg[2]<deg[1]&&deg[2]<deg[3]&&deg[2]<deg[4]&&deg[2]<deg[5]&&deg[2]<deg[6]&&deg[2]<deg[7]){
				tempmin=deg[2];
				cd=2;
			}
			if(deg[3]<deg[1]&&deg[3]<deg[2]&&deg[3]<deg[4]&&deg[3]<deg[5]&&deg[3]<deg[6]&&deg[3]<deg[7]){
				tempmin=deg[3];
				cd=3;
			}
			if(deg[4]<deg[1]&&deg[4]<deg[3]&&deg[4]<deg[2]&&deg[4]<deg[5]&&deg[4]<deg[6]&&deg[4]<deg[7]){
				tempmin=deg[4];
				cd=4;
			}
			if(deg[5]<deg[1]&&deg[5]<deg[2]&&deg[5]<deg[3]&&deg[5]<deg[4]&&deg[5]<deg[6]&&deg[5]<deg[7]){
				tempmin=deg[5];
				cd=5;
			}
			if(deg[6]<deg[1]&&deg[6]<deg[2]&&deg[6]<deg[3]&&deg[6]<deg[4]&&deg[6]<deg[5]&&deg[6]<deg[7]){
				tempmin=deg[6];
				cd=6;
			}
			if(deg[7]<deg[1]&&deg[7]<deg[2]&&deg[7]<deg[3]&&deg[7]<deg[4]&&deg[7]<deg[5]&&deg[7]<deg[6]){
				tempmin=deg[7];
				cd=7;
			}
	
		
		totdeg=ac/7;
		totdeg=Math.rint(totdeg*10)/10;  // INSTRUCCIÓN PARA REDONDEAR EL VALOR A UN DECIMAL, SI QUISIERAMOS A DOS DECIMALES SOLO CAMBIAMOS EL 10 POR 100
		
		System.out.println("\nLa temperatura promedio de la semana fue de: "+totdeg+" grados");
		System.out.println("\nEl dia mas frio tuvo la temperatura de: "+tempmin+" y fue el dia numero "+cd);*/
		

	
