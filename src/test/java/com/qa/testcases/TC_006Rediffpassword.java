package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbanking.pageObjects.RediffPassword;

public class TC_006Rediffpassword extends Baseclass {
	@Test
	public void passwordfor() throws IOException {
		
		RediffPassword r=new RediffPassword(driver);
		r.passwordlink();
		if(driver.getTitle().equals("Rediffmail123")) {
			Assert.assertTrue(true);
			logger.info("verified title:reddiffemail");
		}
		else {
			capture(driver,"passwordfor");
			Assert.assertTrue(false);
		}
		
	}

}
