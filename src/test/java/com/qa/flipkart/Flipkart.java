package com.qa.flipkart;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {
	WebDriver driver;
	public Flipkart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="._2QfC02>button")
	WebElement button;
	@FindBy(css="._25b18c")
	List<WebElement>alllinks;
	@FindBy(name="q")
	WebElement box;
	@FindBy(xpath="//div[contains(text(),'Apple iPhone SE (Black, 64 GB) (Includes EarPods, ')]")
	
	WebElement apple;
	
	public void close() {
		button.click();
	}
	
	public void boxkey(String x) {
	box.sendKeys(x+Keys.ENTER);
	
	}
	
	public void rupees() {
		
		
	for(int i=0;i<alllinks.size();i++) {
		System.out.println(alllinks.get(i).getText());
	}
		

		
	}
		public void apple() {
			apple.click();
			Set<String>s=driver.getWindowHandles();
			Iterator<String>it=s.iterator();
			ArrayList<String>a=new ArrayList<String>();
			while(it.hasNext()) {
				a.add(it.next());
				driver.switchTo().window(a.get(1));
			}
			
	}

}
