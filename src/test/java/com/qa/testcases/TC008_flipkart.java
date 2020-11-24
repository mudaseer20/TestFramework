package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.flipkart.Flipkart;

public class TC008_flipkart extends Baseclass{
	
	@Test
	public void flipkart() {
		
		Flipkart f=new Flipkart(driver);
		f.close();
		f.boxkey("iphone");
		f.rupees();
		f.apple();
	}

}
