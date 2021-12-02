package com.java.staticUsage;

public class StaticKey {
	
	public static String name = "Santhosh";
	public static int age = 24;
	static void routine()
	{
		System.out.println("My daily routine some time chages as per schecule");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My name is :: "+name+" my age is ::"+age);
		routine();

	}

}
