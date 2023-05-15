package T7;

public class Alumno extends Persona{
	protected int numeroControl;
	protected String tutor;
	protected int semestre;
	public Alumno(String nombre, String apellido, char sexo, int numeroControl,String tutor, int semestre){
		super(nombre,apellido,sexo);
		this.numeroControl=numeroControl;
		this.tutor=tutor;
		this.semestre=semestre;
	}
	
	public int getNumeroControl(){
		return numeroControl;
	}
	
	public void setTutor(String nvoTutor){
		tutor=nvoTutor;
	}
	public String getTutor(){
		return tutor;
	}
	
	public void setSemestre(int nvoSemestre){
		semestre=nvoSemestre;
	}
	public int getSemestre(){
		return semestre;
	}
	
	public String toString(){
		return super.toString()+" "+numeroControl+" tutor: "+tutor+" "+semestre+" semestre";
	}
}
