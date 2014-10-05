package ar.com.fiuba.main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Persona p1;
		Persona p2;
		
		p1 = new Persona("Juan","Perez",33);
		p2 = new Persona("Pedro","Picapiedra",89);
		
		Persona pMayor;
		pMayor = Persona.checkMayor(p1, p2);
		System.out.println("El mayor es:"+pMayor.getNombre());
		
		if(p2.esMayorQue(p1))
			System.out.println("si, p2 es mayor!");
		
		
	}

	
	
	
	
}
