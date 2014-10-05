package ar.com.fuiba.main;

/*
 struct S_Persona 
 {
    int edad;
    char nombre[32];
 };
 typedef struct S_Persona Persona
 */

public class Persona 
{
	private int edad;
	private String nombre;

	
	public Persona() // constructor vacio / por defecto
	{
		System.out.println("se ejecuto constructor");
	}
	
	public Persona(String nombre, int edad)
	{
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
