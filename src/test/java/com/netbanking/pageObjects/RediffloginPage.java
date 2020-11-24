package com.netbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffloginPage {
	WebDriver ldriver;
	public RediffloginPage(WebDriver rdriver) {
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="login1")
	WebElement Username;
	@FindBy(id="password")
	WebElement password1;
	@FindBy(name="proceed")
	WebElement button;
	
public void username(String username) {
	Username.sendKeys(username);
}
public void Password(String password) {
	password1.sendKeys(password);
}
public void button() {
	button.click();
}

}
