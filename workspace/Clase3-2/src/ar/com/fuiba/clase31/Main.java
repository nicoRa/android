package ar.com.fuiba.clase31;

import ar.com.fuiba.entities.Jefe;
import ar.com.fuiba.entities.Persona;
import ar.com.fuiba.entities.Programador;

public class Main 
{

	public static void main(String[] args) 
	{
		Persona p = new Programador();
		
		p.usarPc();
		
		Programador pr = (Programador)p;
		
		System.out.println(p);
		System.out.println(pr);
		
		Object o1 = p;
		Object o2 = pr;
		Object o3 = new Jefe();
		Object o4 = new String("hola");
		
		Persona pAux = (Persona)o1;
		Programador prAux = (Programador)o2;
		Jefe jAux = (Jefe)o3;
		String sAux = (String)o4;
		
	}

	
	
	
	
	
	
	
	
	
}
