package Basico;

public class Operando {

	public static void main(String[] args) {
		
		System.out.println("PROBANDO OPERADORES");
		System.out.println("====================");
		int Ent1=10, Ent2=20;
		String Letra="D";
		boolean R=false;
		
			System.out.println("JERARQUIA DE OPERADORES");
			System.out.println("Es "+Ent1+" >= "+Ent2);
			R=Ent1>=Ent2;
			System.out.println(R);
			
			R=Ent1==Ent2 || Letra=="D";
			System.out.println("LETRA="+Letra);
			System.out.println(R);
			
			R=!(Ent1<=Ent2);
			System.out.println(R);
			
			R=Ent2<Ent1*5 && Letra!="X";
			System.out.println(R);
			
		
	}

}
