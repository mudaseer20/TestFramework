package com.netbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver ldriver;
public Loginpage(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(name="uid")
WebElement username;
@FindBy(name="password")
WebElement password;
@FindBy(name="btnLogin")
WebElement btn;
@FindBy(xpath="//b[contains(text(),'Temporary Issue")
WebElement txt;
@FindBy(xpath="//li/a[text()='Log out']")
WebElement logout;


public void setusename(String uname) {
	username.sendKeys(uname);
}
public void setpassword(String pwd) {
	password.sendKeys(pwd);
}
public void click() {
	btn.click();
}
public void text(){
String text4=txt.getText();
System.out.println(text4);

	
}
public void logout() {
	logout.click();
}

}
