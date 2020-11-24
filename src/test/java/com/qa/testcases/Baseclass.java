package com.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.utilities.Readconfig;


public class Baseclass {
	//public String baseurl="https://mail.rediff.com/cgi-bin/login.cgi";
	//public String username="mudaseer";
	//public String password="ahmed";
	
	Readconfig config=new Readconfig();
	public String baseurl=config.getappurl();
	public String username=config.getusername();
	public String password=config.getpassword();
	public String customername=config.getcustomername();
	
	
	
	public static Logger logger;

	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
	
logger=Logger.getLogger("EBANKING");
PropertyConfigurator.configure("Log4j.properties");
if(br.equals("chrome")) {
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
driver=new ChromeDriver();	


}
else if(br.equals("firefox")) {
	
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+ "//Drivers//geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(baseurl);
}
else if(br.equals("ie")) {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
	driver=new FirefoxDriver();
}
driver.get(baseurl);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(19,TimeUnit.SECONDS);
logger.info("opened url successfully");
	}
	
	@AfterClass
	public void teardown() {
		//driver.quit();
	}
	public  void capture(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/screenshots/"+tname+".png");
		FileUtils.copyFile(src, target);
				
		
		
	}
}
