package com.qa.testcases;

import org.testng.annotations.Test;

import com.netbanking.pageObjects.RediffRegistration;

public class TC007_privacy  extends Baseclass{
@Test
public void privacy() {
	
	RediffRegistration r=new RediffRegistration(driver);
	r.privacy();
	r.swit();
	r.switchclick();
	r.mainwindow();
	r.links();
	r.click();
	r.alert();
	r.checkavaila();
	r.text();
	r.countryselect();
	r.click2();
	r.selectanswer();
	r.capital("helo");
	
}


}
