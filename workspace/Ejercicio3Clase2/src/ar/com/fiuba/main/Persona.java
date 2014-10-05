package ar.com.fiuba.main;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido,int edad)
	{
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() 
	{
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static Persona checkMayor(Persona p1,Persona p2)
	{
		if(p1.getEdad() > p2.getEdad())
			return p1;

		return p2;
	}
	
	
	public boolean esMayorQue(Persona p)
	{
		/*
		if(this.getEdad() > p.getEdad())
		{
			return true;
		}
		
		return false;*/
		
		return this.getEdad() > p.getEdad();
	}
	
	public boolean esMayorDeEdad()
	{
		if(this.getEdad()>18)
			return true;
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
