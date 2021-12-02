package com.testng.grouping;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping {
	 @Test(groups = { "smoke" })
	 public void testCase1() {
	   System.out.println("This is the A Normal Test Case1"); 
	 }
	 @Test(groups = { "smoke" })
	 public void testCase2() {
	   System.out.println("This is the A Normal Test Case2"); 
	 }
	 
	 @Test(groups = { "sanity" })
	 public void testCase3() {
	   System.out.println("This is the A Normal Test Case3"); 
	 }

	 @BeforeMethod
	 public void beforeMethod() {
	   System.out.println("This will execute before every Method");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
	   System.out.println("This will execute after every Method");
	 }
	 

}
