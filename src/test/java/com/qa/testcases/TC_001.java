package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.pageObjects.Loginpage;

public class TC_001 extends Baseclass {
	@Test
public void logintest() throws IOException {
	Loginpage lp=new Loginpage(driver);
	lp.setusename(username);
	logger.info("entered username");
	lp.setpassword(password);
	logger.info("entered passsword");
	lp.click();
	//lp.text();
	if(driver.getTitle().equals("Rediffmail")) {
		Assert.assertTrue(true);
		logger.info("verified title:reddiffemail");
	}
	else {
		capture(driver,"logintest");
		Assert.assertTrue(false);
	}
}
}
