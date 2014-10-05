package com.example.sumjni;


public class classs {
	
	static {
		
		System.loadLibrary("nativeC"); 
		}
	
	public native int sum(int a, int b);

}
