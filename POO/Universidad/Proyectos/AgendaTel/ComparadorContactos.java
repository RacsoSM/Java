package AgendaTel;

import java.util.Comparator;//importamos el comparador

public class ComparadorContactos implements Comparator<Contacto>{ //el tipo de objeto a comparar es "Contacto"
	
	@Override //este es un metodo abstracto que se necesita llamar para realizar la comparación
	public int compare(Contacto primerContacto, Contacto segundoContacto) { //le pasamos los parametros que comparará
		//comparamos el nombre de la primera persona con el nombre de la segunda persona, ignoramos mayusculas y minusculas
		return primerContacto.getPersona().getNombre().compareToIgnoreCase(segundoContacto.getPersona().getNombre());
		//el metodo compareTo sirve para ordenar y es de la interfaz comparator
	}

}
