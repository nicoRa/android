package main;

public class Termometro {

	private float tempK;
	
	public void setTempK(float t)
	{
		tempK=t;
	}
	
	public void setTempC(float t)
	{
		tempK = t + 273.15F;
	}
	
	public void printTempK()
	{
		System.out.println("Temp:"+tempK+"K");
	}
	public void printTempC()
	{
		System.out.println("Temp:"+(tempK - 273.15F)+"C");
	}
	
}
