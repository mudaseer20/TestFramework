package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.netbanking.pageObjects.Loginpage;
import com.qa.utilities.XLUtils;

public class TC_002_datadriven  extends Baseclass
{//1
	@Test(dataProvider="logindata")
	public void loginddt(String user,String password) throws IOException
	{//2
		Loginpage lp=new Loginpage(driver);
		lp.setusename(user);
		logger.info("username provided");
		lp.setpassword(password);
		logger.info("password provided");
		lp.click();
		logger.info("clicked");
		if(isAlertpresent()==true) {
			
				try {
			
			driver.switchTo().alert().accept();
			logger.info("accepted alert");
			driver.switchTo().defaultContent();
			logger.info("switched to default content");}
				
				catch(Exception e) {
					e.printStackTrace();
					
					capture(driver,"loginddt");
				}
			
		}
		else {
			//Assert.assertTrue(true);
			lp.logout();
			logger.info("logged out success");
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
		
		
	}
		
	@DataProvider(name="logindata")
	String[][] getdata() throws IOException{
		//3
	
	
		String path=System.getProperty("user.dir")+"/src/test/java/com/qa/testdata/Testdata2.xlsx";
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++) {//4
			for(int j=0;j<colcount;j++) {//5
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1",i,j);
			}//3--c
		}//2--c
		return logindata;
	}
	
	


	public boolean isAlertpresent() {
		
		try {
			
			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
	}
}