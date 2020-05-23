package com.verify.testng;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleInvoke {
	
	public WebDriver driver;
	
	@Test
	public void googleInvoke() throws AWTException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement elementfirst=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		elementfirst.sendKeys("movie");
		
	List<WebElement> elements=	driver.findElements(By.xpath("//div[@class='sbl1']//span/b"));
	
	for(int i=0;i<elements.size();i++) {
		
		System.out.println(elements.get(i).getText());
		
		if(elements.get(i).getText().contains("sflix")) {
			
			elements.get(i).click();
			break;
		}
		
		
	}
	
	String title=driver.getTitle();
	System.out.println(title);
	
	if(title.contains("movie")) {
		
		System.out.println("comes to the if loop");
	}
	else {
		
		System.out.println("else loop");
	}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		try {
			
			Thread.sleep(3000);
			
			driver.quit();
			
		}catch(Exception e) {
			
		}
		
	}

}
