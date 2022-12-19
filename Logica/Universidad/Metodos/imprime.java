package Metodos;

import Pruebas.Leer;

public class imprime {
	
	public static void ImprimeInt(int [] V){ 
		for (int i = 0; i < V.length; i++) {
			if (V[i]>0) {
				System.out.println("["+V[i]+"]"+" Pos "+ i);
			}
		}
	}
	
	public static void ImprimeString(String [] V){
		for (int i = 0; i < V.length; i++) {
			if (!V[i].equals("")) {
				System.out.println("["+V[i]+"]"+" Pos "+ i);
			}
		}
	}
	
	public static void ImprimeChar(char [] V){
		for (int i = 0; i < V.length; i++) {
			if (V[i]>0) {
				System.out.println("["+V[i]+"]"+" Pos "+ i);
			}
		}
	}
	
	public static void PosCaracter(String V){  // CONSEGUIR LA POSICION DE CIERTA LETRA EN EL STRING.
		for (int i = 0; i < V.length(); i++) {
			if (V.charAt(i)=='a') {//AQUI CAMBIAR EL VALOR DE a POR EL QUE QUERRAMOS
				System.out.println("Posicion de la letra = "+i);
			}
		}
	}
	
	public static String Reemplaza(String V){  // CONSEGUIR LA POSICION DE CIERTA LETRA EN EL STRING.
		 
	        System.out.println("Original String is ': " + V);
	        System.out.println("String after replacing: 'hola' with 'cambio':  " + V.replace("hola", "cambio")); //CAMBIA AQUI LAS PALABRAS
	        System.out.println("String after replacing all 'a' with 'x':  " +V.replace('a', 'x'));//CAMBIA AQUI LAS LETRAS
	        
	        V=V.replace("hola","cambio");//SE CAMBIAN AQUI, PARA PALABRAS COMILLAS DOBLES, PARA CARACTERES COMILLAS SIMPLES
	        return V;
	}
	
	public static int Elimina (int[]num) {
		int copia[]=new int[num.length];
	int y=0,x=0,w=0;
	boolean al;
		for (int i = 0; i < num.length; i++) {
			al=false; y=0;
					while(al==false && y<x){
							if(num[i] == copia[y]){
								al=true;
								w++;
							}
							y++;				
					}
				if(al==false){
				copia[x]=num[i];
				x++;
				}
		}
		System.out.println("\nVECTOR SIN DUPLICADOS");
		imprime.ImprimeInt(copia);//METODO DE OTRA CLASE PARA IMPRIMIR VECTORES
		
		return w; //numero de copias
	
	}
	
	

}
