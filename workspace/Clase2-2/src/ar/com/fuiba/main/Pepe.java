package ar.com.fuiba.main;

import java.io.PrintStream;

public class Pepe {

	public static void main(String[] args) 
	{
	
		Persona p1 = new Persona(); // def. y creacion.
		Persona p2 = new Persona("juan",33); // def. y creacion.

		System.out.println("nombre:"+p2.getNombre());
	}


}
