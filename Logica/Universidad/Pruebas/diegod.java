package Pruebas;
public class diegod{

	public static void main(String[] args)
	{
		System.out.println("Tama�o del vector?:");
		int N=Leer.datoInt();
		int Num []=new int[N];
		int Par []=new int[N];
		int Ipar []=new int[N];
		
		
		GeneraNumeros(Num, N);
		ParImpar(Num, Par, Ipar);
		String Cuenta=Suma(Num, Par, Ipar);
		System.out.println(Cuenta);
		for (int i = 0; i < Num.length; i++) {
			System.out.println(Par[i]);
		}
	}

	public static void GeneraNumeros(int [] Num, int N) //METODO PARA GENERAR 'N' NUMEROS ALEATORIOS
	{
		for (int i=0; i<N; i++)
		{
			Num[i]=(int)(Math.random()*10);
			System.out.println("["+Num[i]+"] en posicion "+i);
		}
	}
	
	public static void ParImpar(int [] Num,int [] Par,int [] Ipar)//METODO PARA ASIGNAR AL DEVIDO VECTOR EL NUMERO PAR O IMPAR
	{
		for (int i = 0; i <Num.length; i++)
		{
			if (Num[i]%2==0) Par[i]=Num[i]; else Ipar[i]=Num[i];
		}
	}
	
	public static String Suma(int [] Num,int [] Par, int [] Ipar)//METODO PARA IMPRIMIR LA SUMA DE LOS VECTORES
	{int P=0, I=0;
		for (int i = 0; i<Num.length; i++)
		{ 
			P=P+Par[i];
			I=I+Ipar[i];		
		}
		String Cuantos="LA SUMA DE LOS NUMEROS PARES ES:"+P+" Y LA SUMA DE LOS IMPARES ES: "+I+"";	
		return Cuantos;
	}
	
	
}
