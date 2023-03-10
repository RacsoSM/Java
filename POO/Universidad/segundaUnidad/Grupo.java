package segundaUnidad;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo {
	

	public static void main(String[] args) {
		int y=0;
		
		ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
		
		String [] nombres = {"Martha","Fermin","Carlos","Karla"};
		char [] sexos = {'M','H','H','M'};
		String [] alias = {"Flaca","loco","carlitos","karlita"};
		String [] telefono = {"6673017019","6673017124","6674124492","6671012319"};
		char [] tipoTelefono = {'F','M','M','M'};
		
		
		for (int i = 0; i < 4; i++) {
			Contacto contacto = new Contacto (nombres[i],sexos[i],alias[i],telefono[i],tipoTelefono[i]); //CREAMOS EL OBJETO
			y=buscaPorSexo(listaContactos,contacto,i); //BUSCAMOS POR SEXO A TODAS LAS MUJERES
			listaContactos.add(contacto); //LO AGREGAMOS AL ARRAYLIST
			
			if(y!=-1){ //MOSTRAMOS A TODAS LAS MUJERES DEL ARRAYLIST
				System.out.println(listaContactos.get(y));
			}
		
		}
		
		//String nombre, char sexo, String alias, String telefono, char tipoTelefono
		
		
	}
	
	public static int buscaPorSexo(ArrayList listaContactos,Contacto contacto,int i){
		if(contacto.getSexo()=='M'){ //PREGUNTAMOS SI EL CONTACTO ES IGUAL A M EN SEXO
			return i;//REGRESAMOS LA POSICION DEL ARRAYLIST
		}
		
		return -1; //CASO CONTRARIO REGRESAMOS UNA POSICION QUE NO TIENE EL ARRAYLIST
	}
	
}
