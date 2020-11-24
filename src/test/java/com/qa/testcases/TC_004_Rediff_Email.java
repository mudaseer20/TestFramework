package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.pageObjects.RediffloginPage;

public class TC_004_Rediff_Email extends Baseclass {
	
	@Test
	public void login() throws IOException {
RediffloginPage lp=new RediffloginPage(driver);
lp.username("mudaseer");
lp.Password("ahmed");
lp.button();
if(driver.getTitle().equals("Rediffmail123")) {
	Assert.assertTrue(true);
	logger.info("verified title:reddiffemail");
}
else {
	capture(driver,"login");
	Assert.assertTrue(false);
}
}
}