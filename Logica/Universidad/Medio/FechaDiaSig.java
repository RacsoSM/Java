package Medio;
//SANTACRUZ MALDONADO OSCAR SAID
public class FechaDiaSig {

	public static void main(String[] args) {
		String fecha="",dia="",mes="",año="";
		int day=0,month=0,year=0,top=0;
	
		
		do{
			do{
					do{ //VALIDAMOS QUE SOLO SE PERMITAN 10 CARACTERES, EN CASO CONTRARIO SE VUELVE A PREGUNTAR
					System.out.println("INGRESE LA FECHA (DD/MM/AAAA) (0=FIN)");
					fecha=Leer.dato();
					if(fecha.equals("0")) System.exit(0); //VALIDAMOS QUE SI EL USUARIO TECLEA "0" SE ACABE EL PROGRAMA
					}while(fecha.length()!=10);	
			
				//TOMAMOS SOLO EL DIA, MES Y AÑO DEL SUBSTRING Y CONVERTIMOS A INT
			dia=fecha.substring(0,2); day=Integer.parseInt(dia);
			mes=fecha.substring(3,5); month=Integer.parseInt(mes);
			año=fecha.substring(6,10); year=Integer.parseInt(año);
			}while((day>31||day<0)||(month>12||month<0));
				
					//VALIDAMOS MESES CON 28,30 Y 31 DIAS
					if(month == 2){
						top=28; 
					}
					if(month == 4 || month == 6 || month == 9 || month == 11) 
						{
						top=30;
						}
					if(month == 1 || month == 3 || month == 5|| month == 7 || month == 8 || month == 10|| month == 12){
						top=31;
					}

			day=day+1;
		
					if(day>top){ //VALIDAMOS CAMBIO DE MES
						day=1;
						month++;
					}
					if (month>12){ //VALIDAMOS CAMBIO DE AÑO
						year++;
						day=1;
						month=1;
					}
		
			dia= String.valueOf(day);  //CONVERTIMOS A STRING DE NUEVO
			mes= String.valueOf(month);
		
					if(day<10 && day>0) dia=0+dia; //AGREGAMOS UN 0 AL LADO DEL DIA EN CASO DE QUE SEA MENOR DE 10
					if(month<10 && month>0) mes=0+mes; //MISMO CASO CON EL MES
		
		System.out.println(dia+"/"+mes+"/"+year); 
			
		}while(!fecha.equals("0")); 
	}
}
