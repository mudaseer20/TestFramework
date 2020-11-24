package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.pageObjects.RediffRegistration;

public class TC005_Rediffregistration extends Baseclass {
	@Test
	public void regis() throws IOException {
	RediffRegistration r=new RediffRegistration(driver);
	r.click1();
	if(driver.getTitle().equals("Rediffmail123")) {
		Assert.assertTrue(true);
		logger.info("verified title:reddiffemail");
	}
	else {
		capture(driver,"regis");
		Assert.assertTrue(false);
	}
	

}
}
