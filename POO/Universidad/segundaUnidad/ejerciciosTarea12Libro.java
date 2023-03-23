package segundaUnidad;

import java.util.Arrays;

public class ejerciciosTarea12Libro {
	private String titulo;
	private String autor;
	private String editorial;
	private int year;
	private int clasificacion;
	
	public ejerciciosTarea12Libro (String titulo, String autor,
			String editorial, int year, int clasificacion){
		this.titulo=titulo;
		this.autor=autor;
		this.editorial=editorial;
		this.year=year;
		this.clasificacion=clasificacion;
	}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	
	public int getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(int clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	public static void main(String[] args) {
		
		
		ejerciciosTarea12Libro [] libros = new ejerciciosTarea12Libro [9];
		
		libros[0] =new ejerciciosTarea12Libro ("titulo1","autor1","editorial1",2000,1);
		libros[1] =new ejerciciosTarea12Libro ("titulo2","autor2","editorial2",2000,1);
		libros[2] =new ejerciciosTarea12Libro ("titulo3","autor3","editorial3",2000,3);
		libros[3] =new ejerciciosTarea12Libro ("titulo4","autor4","editorial4",2000,4);
		libros[4] =new ejerciciosTarea12Libro ("titulo5","autor5","editorial5",2000,4);
		libros[5] =new ejerciciosTarea12Libro ("titulo6","autor6","editorial6",2000,7);
		libros[6] =new ejerciciosTarea12Libro ("titulo7","autor7","editorial7",2000,8);
		libros[7] =new ejerciciosTarea12Libro ("titulo8","autor8","editorial8",2000,9);
		libros[8] =new ejerciciosTarea12Libro ("titulo9","autor9","editorial9",2000,9);
		
		
		//problema 24
		System.out.println("Resultado metodo 24: "+Arrays.toString(metodo24(libros)));
	}
	
	//problema 24:recibe como parametro un array de libros y regresa cuantos libros hay de cada clasificacion
	public static int [] metodo24 (ejerciciosTarea12Libro [] libros){
		int clasificaciones [] = new int [9];
		int k=0;
		
		for (ejerciciosTarea12Libro i : libros) {
			
			clasificaciones[i.getClasificacion()-1]++;
			
		}
		return clasificaciones;
	}
	

}
