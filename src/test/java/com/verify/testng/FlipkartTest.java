package com.verify.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseClass{
	
	public WebDriverWait wait;
	
	
	@Test
	public void flipkartTest() {
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement element=driver.findElement(By.xpath("//img[@alt='gg']//following::img[@alt='gg']"));
		
		wait=new WebDriverWait(driver, 100);
		try {
		
		if(element.isDisplayed()) {
			System.out.println("displayed");
			
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("clicked");

			Thread.sleep(3000);
			
		}
		
		}catch (Exception e) {
			if(element.isDisplayed()) {
				
				wait.until(ExpectedConditions.visibilityOf(element));
				System.out.println("clicked");
				try {
					Thread.sleep(3000);

				}catch (Exception j) {
					j.printStackTrace();
				}
				
			}		
			
		}
		
		driver.quit();
		
		
		
		
	}

}
