package com.testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assetions_TestNG {
	
	@Test
	public void compare() {
		String actual = "Santhosh";
		 String expected = "Santhosh";
	     Assert.assertEquals( actual,  expected);
	     Assert.assertEquals( actual, expected, "They are equal");
	  
	}

}
