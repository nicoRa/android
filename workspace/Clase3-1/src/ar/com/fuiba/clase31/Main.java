package ar.com.fuiba.clase31;

import ar.com.fuiba.entities.Jefe;
import ar.com.fuiba.entities.Persona;
import ar.com.fuiba.entities.Programador;

public class Main 
{

	public static void main(String[] args) 
	{
		Programador programador = new Programador();
		
		programador.edad=55;
		programador.nombre="Juan";
		programador.lenguaje="Cobol";
		
		Persona p = programador;
		
		if( p instanceof Programador)
			System.out.println("Es programador");
		else
			System.out.println("No es programador");
			
		//Programador p2 = (Programador) p;
		//System.out.println(p2.lenguaje);
		Jefe p2 = (Jefe)p;
		System.out.println(p2.cargo);
		
		
	}

	
	
	
	
	
	
	
	
	
}
