package com.netbanking.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
WebDriver ldriver;

public AddCustomer(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
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
@FindBy(id="closeBtn")
WebElement close;
@FindBy(id="flow_close_btn_iframe")
WebElement fr;
@FindBy(id="closeBtn")
WebElement cl;
@FindBy(name="name")
WebElement customername;
@FindBy(xpath="//input[@name='rad1'][2]")
WebElement mf;
@FindBy(name="addr")

WebElement address;

@FindBy(name="pinno")

WebElement pincode;
@FindBy(name="telephoneno")
WebElement phone;

@FindBy(name="emailid")
WebElement email;
@FindBy(name="password")
WebElement pass;


@FindBy(id="dob")
WebElement dob;
public void setusename(String uname) {
	username.sendKeys(uname);
}
public void setpassword(String pwd) {
	password.sendKeys(pwd);
}
public void click() {
	btn.click();
}

@FindBy(how=How.XPATH,using="//a[contains(text(),'New Customer')]")
WebElement newcustomer;
@FindBy(name="city")
WebElement city;
@FindBy(name="state")
WebElement state;
@FindBy(name="sub")
WebElement submit;


public void opennew() {
	newcustomer.click();
}

public void closewindow() {
	close.click();
}
public void frame() {
	ldriver.switchTo().frame(fr);cl.click();
	
	ldriver.switchTo().defaultContent();
}
public void entername(String name) {
	customername.sendKeys(name);
}

public void radiobutton() {
	
	mf.click();
}
public void calendar() {
	dob.sendKeys("12122020");
}
public void address() {
	address.sendKeys("15 jayananagar bangalore");
}
public void city() {
	
	city.sendKeys("bangalore");
}
public void state() {
	
	state.sendKeys("bangalore");

}
public void pincode() {
	pincode.sendKeys("560011");
	
	
}
public void phone() {
	phone.sendKeys("1234567890");
}
public void submit() {
	
	submit.click();
}
public void email() {
	email.sendKeys("helo@gmail.com");
}
public void pass() {
	
	pass.sendKeys(emailid);
}

String emailid=random()+"@gmail.com";
public String random() {
	
	String generated=RandomStringUtils.randomAlphabetic(8);
	return generated;
}




}