package com.example.sumajni3;

public class Native {
	
	
	static {
		
		System.loadLibrary("Native");
	
	}
	
	public native int add( int v1, int v2 );	

}
