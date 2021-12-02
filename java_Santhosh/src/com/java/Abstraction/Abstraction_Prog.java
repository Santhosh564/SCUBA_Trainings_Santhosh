package com.java.Abstraction;

public abstract class Abstraction_Prog {
	
		   
		  public abstract void AbstrtMethod();
		  
		  public void nonAbstMethod() {
		    System.out.println("this is a not a abstract method");
		  }
		}

		 
		class Abstc2 extends Abstraction_Prog {
		  public void AbstrtMethod() {
		    
		    System.out.println("This is an abstract method has to be implemented in a normal class");
		  }
		}

		 class Santhosh{
		  public static void main(String[] args) {
			  Abstc2 obj = new Abstc2();
		     obj.AbstrtMethod();
		     obj.nonAbstMethod();
		  }
 }
	
