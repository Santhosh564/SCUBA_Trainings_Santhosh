package com.java.AccessModifiers;

public class AccessMod {
	 
		private int data=40;  
		private void msg(){System.out.println("Hello java");}  
	//Private Members access with in the class 
		  
	public static void main(String[] args) {
		 AccessMod obj=new AccessMod();  
		   System.out.println(obj.data); 
		   obj.msg();   
		   }  
}  
		 

	 
 