package com.netbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPassword {
	WebDriver driver;
	public RediffPassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a/u[contains(text(),'Forgot')]")
WebElement password;

public void passwordlink() {
	password.click();
	
}

}
