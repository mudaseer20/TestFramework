package com.netbanking.pageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffRegistration {
	ArrayList<String>a;
	Actions b;
	WebDriver driver;
	public RediffRegistration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//b[contains(text(),'Rediff USA')]")
	WebElement usa;
	
	@FindBy(xpath="//a/u[contains(text(),'Create')]")
	WebElement link;
	@FindBy(xpath="//a[contains(text(),'privacy policy')]")	
WebElement privacy;
	@FindBy(xpath="//a")
	WebElement links;
	
	@FindBy(css="#Register")
	WebElement register;
	@FindBy(css=".btn_checkavail")
	WebElement checkavail;
	@FindBy(xpath="//b[contains(text(),'The ID cannot be blank')]")
	WebElement text;
	@FindBy(id="country")
	WebElement country;
	@FindBy(className="nomargin")
	WebElement cli;
	@FindBy(xpath="//select[contains(@name,'hint')]")
	WebElement dropdown;
	@FindBy(xpath="//td[text()='Full Name']/following::input[1]")
	WebElement firstname;
	//@FindBy(css="")
	public void click1() {
		link.click();
	}
	public void privacy() {
		privacy.click();
	}
	public void switchclick() {
		usa.click();
	}
	public void mainwindow() {
		driver.switchTo().window(a.get(0));
	}
	
	public void swit() {
		Set<String>id=driver.getWindowHandles();
		Iterator<String>it=id.iterator();
		a=new ArrayList<String>();
		while(it.hasNext()) {
			a.add(it.next());
		}
		driver.switchTo().window(a.get(1));
	}
	public void links() {
		System.out.println(links.getText());
	}
	public void click() {
		register.click();
	}
public void alert() {
	Alert a=driver.switchTo().alert();
	a.accept();
	
}
	public void  checkavaila() {
		checkavail.click();
		
	}
	public void text() {
		System.out.println(text.getText());
	}
	public void countryselect() {
		Select s=new Select(country);
		
		//s.selectByValue("4");
		List<WebElement>l=s.getOptions();
		for(int i=0;i<l.size();i++) {
			
			System.out.println(l.get(i).getText());
		}}
		public void click2() {
			cli.click();
		
		//System.out.println(s.selectByIndex("4"));
	}
		public void selectanswer() {
			Select s=new Select(dropdown);
			s.selectByValue("What is your favourite pass-time?");
		}
		public void capital(String x) {
			b=new Actions(driver);
			b.moveToElement(firstname).click()
			.keyDown(Keys.SHIFT).sendKeys(x);
			
		}
		
		
		
}

