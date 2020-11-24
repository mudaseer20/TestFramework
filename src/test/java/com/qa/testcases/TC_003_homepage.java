package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.pageObjects.AddCustomer;
import com.netbanking.pageObjects.Loginpage;

public class TC_003_homepage extends Baseclass{
	@Test
	public void create() throws InterruptedException, IOException {
	
		
	
	AddCustomer cp=new AddCustomer(driver);
	cp.setusename(username);
	cp.setpassword(password);
	Thread.sleep(2000);
	cp.click();
	
	Thread.sleep(2000);
	cp.frame();
	//cp.closewindow();
	cp.opennew();
	//cp.closewindow();
	logger.info("opened");
	cp.frame();
	cp.entername(customername);
	cp.radiobutton();
	cp.calendar();
	cp.address();
	cp.city();
	cp.state();
	cp.pincode();
	logger.info("pincode entered success");
	cp.phone();
	cp.email();
	logger.info("email entered success");
	cp.pass();
	
	cp.submit();
	boolean res=driver.getPageSource().contains("Customer Registered");
	if(res==true) {
		
		Assert.assertTrue(true);
		
	}
	else {
		
		capture(driver,"create");
		Assert.assertTrue(false);
	}
	

}
}
