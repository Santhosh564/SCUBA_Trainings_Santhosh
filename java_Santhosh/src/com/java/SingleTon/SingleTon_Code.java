package com.java.SingleTon;

public class SingleTon_Code {

	   private static SingleTon_Code singleton = new SingleTon_Code( );

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private SingleTon_Code() { }

	   /* Static 'instance' method */
	   public static SingleTon_Code getInstance( ) {
	      return singleton;
	   }

	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
	}
