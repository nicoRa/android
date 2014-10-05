package main;

public class Main {

	
	public static void main(String[] args) {
		
		Termometro termometro = new Termometro();
		termometro.setTempC(25.0F);
		
		termometro.printTempK();
		termometro.printTempC();
		
		// int lista[3]; // C
		//int[] lista = new int[3]; // JAVA
		
		Termometro[] temperaturas = new Termometro[3];
		
		temperaturas[0] = new Termometro();
		temperaturas[0].setTempC(23.4F);
		
		temperaturas[1] = new Termometro();
		temperaturas[1].setTempC(43.7F);

		temperaturas[2] = new Termometro();
		temperaturas[2].setTempC(55.5F);

		for(int i=0;i<temperaturas.length;i++)
		{
			temperaturas[i].printTempC();
		}
		
		for(Termometro t : temperaturas)
		{
			t.printTempC();
		}
		
	}
}
