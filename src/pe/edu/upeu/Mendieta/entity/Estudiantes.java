package pe.edu.upeu.Mendieta.entity;


public class Estudiantes {
	private int idestudiantes;
	private int idescuela;
	private String apellnombres;
	private String correo;
	private String telefono;
	public Estudiantes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estudiantes(int idestudiantes, int idescuela, java.lang.String apellnombres, java.lang.String correo,
			java.lang.String telefono) {
		super();
		this.idestudiantes = idestudiantes;
		this.idescuela = idescuela;
		this.apellnombres = apellnombres;
		this.correo = correo;
		this.telefono = telefono;
	}
	public int getIdestudiantes() {
		return idestudiantes;
	}
	public void setIdestudiantes(int idestudiantes) {
		this.idestudiantes = idestudiantes;
	}
	public int getIdescuela() {
		return idescuela;
	}
	public void setIdescuela(int idescuela) {
		this.idescuela = idescuela;
	}
	public String getApellnombres() {
		return apellnombres;
	}
	public void setApellnombres(String apellnombres) {
		this.apellnombres = apellnombres;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	

}
