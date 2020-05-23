package com.verify.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DynamicWebTable extends BaseClass {
	
	
	
	@Test
	public void dynamicTable() {
		
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	List<WebElement> ele=	driver.findElements(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope']"));
	
	for (int i = 0; i < ele.size(); i++) {
		
		String name=ele.get(i).getText();
		System.out.println(name);
		
	}
	
	Actions a=new Actions(driver);
	a.doubleClick(driver.findElement(By.xpath("//div[@role='button']//span[text()='Email']"))).build().perform();
	
List<WebElement> ele1=	driver.findElements(By.xpath("//div[@class='ui-grid-cell-contents ng-binding ng-scope']"));
	
	for (int i = 0; i < ele1.size(); i++) {
		
		String name=ele1.get(i).getText();
		System.out.println(name);
		
	}
	
	
	
	}

}
