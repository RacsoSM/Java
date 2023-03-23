package segundaUnidad;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo {
//antes del main por que es un atributo del grupo, asi todos pueden acceder
static ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
//si no es static, un metodo estatico no puede acceder a metodos estaticos como el main
	public static void main(String[] args) {
		int y=0;
		
		String [] nombres = {"Martha","Fermin","Carlos","Karla"};
		char [] sexos = {'M','H','H','M'};
		String [] alias = {"Flaca","loco","carlitos","karlita"};
		String [] telefono = {"6673017019","6673017124","6674124492","6671012319"};
		char [] tipoTelefono = {'F','M','M','M'};
		
		
		for (int i = 0; i < 4; i++) {
			Contacto contacto = new Contacto (nombres[i],sexos[i],alias[i],telefono[i],tipoTelefono[i]); //CREAMOS EL OBJETO
			listaContactos.add(contacto); //LO AGREGAMOS AL ARRAYLIST
		}
		
		ArrayList <Contacto> listaMujeres = new ArrayList <Contacto>();//creamos el arraylist de mujeres
		
		System.out.println("NOMBRE\tSEXO\tALIAS\tTELEFONO\tTIPO TEL");
		listaMujeres=buscaPorSexo(); //BUSCAMOS POR SEXO A TODAS LAS MUJERES
		for(Contacto contacto: listaMujeres){//MOSTRAMOS TODOS LOS DATOS DE listaMujeres
			System.out.println(contacto.toString());//imprimimos a las mujeres
		}
		
	}
	
	public static ArrayList buscaPorSexo(){ //devolvemos un arraylist que muestre a todas las mujeres
		ArrayList<Contacto> listaMujeres = new ArrayList<Contacto>();//CREAMOS LA listaMujeres QUE SEA LOCAL
		
		for (Contacto contacto : listaContactos) {//RECORREMOS EL ARRAYLIST PRINCIPAL
			if(contacto.getSexo()=='M'){ //PREGUNTAMOS SI EL CONTACTO ES MUJER
				listaMujeres.add(contacto);//LO AGREGAMOS AL ARRAYLIST NUEVO DE MUJERES
			}
		}
		
		
		return listaMujeres; //REGRESAMOS EL ARRAYLIST DE MUJERES
	}

	//Gracias a este metodo podemos manipular un nuevo arraylist que es exclusivamente del sexo requerido por el usuario,
	//sin embargo, considero que son pocos los casos donde es estrictamente necesario regresar un nuevo arraylist, pues,
	//con mostrar los datos del contacto con un toString dentro de este mismo metodo considero que sería suficiente,
	//mas si el problema requiere manipular los datos de un grupo especifico más alla de mostrarlos, esta seria la solucion.
	
}
