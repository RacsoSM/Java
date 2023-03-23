package segundaUnidad;

public class AlumnoMetodo6 {
	private String nombre;
	private String apellido;
	private char sexo;
	private double calificacion;
	
	public AlumnoMetodo6(String nombre, String apellido, char sexo, double calificacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.calificacion = calificacion;
	}
	
	//getter y setter de nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//getter y setter de apellido
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//getter y setter de sexo
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//getter y setter de calificacion
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	public static void main(String[] args) {
		AlumnoMetodo6 alumno= new AlumnoMetodo6("martha","ramirez",'m',9.2);
		AlumnoMetodo6 alumno2= new AlumnoMetodo6("juan","escutia",'h',6.2);
		AlumnoMetodo6 alumno3= new AlumnoMetodo6("cecilia","astorga",'m',9.8);
		
		AlumnoMetodo6 [] grupo = {alumno,alumno2,alumno3}; 
		
		//metodo 7
		System.out.println("Resultado metodo 7: "+metodo7(grupo));
		
		//metodo 8
		System.out.println("Resultado metodo 8: "+metodo8(grupo));
		
		//metodo 9
		System.out.println("Resultado metodo 9: "+metodo9(grupo));
	}
	
	//metodo 7: cuenta las mujeres de un grupo dado un array de alumnos
	public static int metodo7(AlumnoMetodo6 [] grupo ){
		int contadorMujeres=0;
		
		for (AlumnoMetodo6 a : grupo) {
			
			if (a.getSexo()=='m') 
				contadorMujeres++;	
		}
		
		return contadorMujeres;
	}
	
	
	//metodo 8: regresa el promedio de un grupo dado un array de alumnos
	public static double metodo8 (AlumnoMetodo6 [] grupo){
		double promedio=0;
		
		for (AlumnoMetodo6 a : grupo) 
			promedio += a.getCalificacion();
		
		
		return promedio/grupo.length;
	}
	
	
	public static int metodo9 (AlumnoMetodo6 [] grupo){
		int alumnosReprobados=0;
		
		for(AlumnoMetodo6 a: grupo){
			if(a.getCalificacion()<7.0)
				alumnosReprobados++;
		}
			
		return alumnosReprobados;
	}
	
}
