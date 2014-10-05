package com.example.pruba3jni;

public class LedManager {

	
	static {

		System.loadLibrary("led_manager");
		
	}
	
	public native int add(int a, int b);
	
}
