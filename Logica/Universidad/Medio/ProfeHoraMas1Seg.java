package Medio;

public class ProfeHoraMas1Seg {

	public static void main(String[] args) {
		
		String HoraA="",Ha="",Ma="",Sa="",ESTA="";
		int H=0, M=0, S=0;
		
		do{
			do{
				System.out.println("TECLEA LA HORA (HH:MM:SS): (0=Fin)");
				HoraA=Leer.dato();
				
				if(HoraA.equals("0")) break;
				Ha=HoraA.substring(0,2); H=Integer.parseInt(Ha);
				Ma=HoraA.substring(3,5); M=Integer.parseInt(Ma);
				Sa=HoraA.substring(6,8); H=Integer.parseInt(Sa); //CONVIERTE STRING A ENTERO
			}while((H<0 || H>23) || (M<0 || M>59) ||(S<0 || S>59));
			S=S+1;
			Sa=S+""; //CONVIERTE ENTERO A STRING
			if(S==1){
				Sa="01";
			}
			if(S>=60|| S<0){
				Sa="00"; M=M+1; Ma=M+"";
			}
			if(S<10){
				Sa="0"+Sa;
			}
			if(M>60 || M<0){
				Ma="00"; H=H+1; Ha=H+"";
			}
			if(M<10){
				Ma="0"+Ma;
			}
			if(H>=24 || H<0){
				Ha="00";
			}
			if(H<10){
				Ha="0"+Ha;
			}
			ESTA=Ha+":"+Ma+":"+Sa;
			System.out.println("LA HORA + 1 SEGUNDO ES -> "+ESTA);
			System.out.println();
		}while(!HoraA.equals("0"));

	}

}
