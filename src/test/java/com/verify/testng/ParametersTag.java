package com.verify.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTag {
	
	public WebDriver driver;
	public Actions action;
	
	public WebDriverWait wait;
	public Select select;
	
	@Test
	@Parameters({"browser","dropdown"})
	public void parametersTag(String name,String dropdown) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li/a[contains(text(),'Input Forms')]")).click();
		
		moveElement(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li/a[contains(text(),'Input Forms')]")));
		moveElement(driver.findElement(By.xpath("(//a[text()='Input Form Submit'])[1]")));
		
		inputBox(driver.findElement(By.xpath("//input[@name='first_name']")),name);
		inputBox(driver.findElement(By.xpath("//input[@name='last_name']")),name);
		dropDown(driver.findElement(By.xpath("//select[@name='state']")),dropdown);
		radioSelect(driver.findElement(By.xpath("//input[@value='yes']")));
		
		try {
			System.out.println("driver close");
			Thread.sleep(3000);
			
			driver.quit();

		}catch(Exception e) {
			
			e.printStackTrace();
		}	
	}
	public void radioSelect(WebElement elem) {
		
		if(!elem.isSelected()) {
			
			elem.click();
		}else {
			System.out.println("element is already selected");
		}
		
	}
	
	public void dropDown(WebElement element,String dropdownname) {
		
		select=new Select(element);
		select.selectByVisibleText(dropdownname);
		
	}
	
	public void moveElement(WebElement element) {
		
		System.out.println("enters moveelement");
		
		action=new Actions(driver);
		wait=new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.invisibilityOf(element));
		action.moveToElement(element).build().perform();
		element.click();	
		
	}
	public void inputBox(WebElement elementinput,String name) {
		
		//wait.until(ExpectedConditions.visibilityOf(elementinput));
		
		elementinput.clear();
		elementinput.sendKeys(name);
		
	}
}
