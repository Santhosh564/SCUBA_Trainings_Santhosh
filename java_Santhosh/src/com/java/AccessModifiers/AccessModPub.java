package com.java.AccessModifiers;

public class AccessModPub {
	
	public int a =10;
	public int b =20;
	public void santhosh()
	{
		System.out.println("Santhosh invoking public method");
	}
	
	class Raj extends AccessModPub{
		void Santhosh2()
		{
			System.out.println("Santhosh2 invloking method");
		}
	}
 
	class Santhosh{
	public void main(String[] args) {
		// TODO Auto-generated method stub
		Raj raj = new Raj();
		raj.santhosh();  //we can directly access
		raj.Santhosh2();
	}
	}
}	
		
