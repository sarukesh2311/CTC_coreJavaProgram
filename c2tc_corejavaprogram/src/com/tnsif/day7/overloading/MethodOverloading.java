//Program to demonstrate method overloading  - Compile Time Polymorphism
package com.tnsif.day7.overloading;

public class MethodOverloading {

	public static int addition(int a, int b) {
		return a + b;
	}
	
	public static float addition(float a, float b) {
		return a + b;
	}

	public static float addition(int a, float b) {
		return a + b;
	}

	public static float addition(float a, int b) {
		return a + b;
	}

	public static String addition(String a, String b) {
		return a + b;
	}

}
