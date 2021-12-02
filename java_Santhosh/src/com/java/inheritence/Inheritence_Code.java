package com.java.inheritence;

public class Inheritence_Code {
	
			public String qualities = "good";
			public void character()
			{
				System.out.println("They have good attitude and character");
			}
			
		}
		class Santhosh extends Inheritence_Code{
			public void santhosh_NewChar()
			{
				System.out.println("He additonally have some good qualities");

			}
		
		 
	public static void main(String[] args) {
		Santhosh boy = new Santhosh();
		System.out.println(boy.qualities);
        boy.character();
        boy.santhosh_NewChar();
         }

}
