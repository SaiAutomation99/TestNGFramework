package com.verify.testng;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PractiseWebSite {
	
	public static WebDriver driver;
	
	
	@AfterTest
	public void closeBrowser() {
		try {
			System.out.println("driver is quit");
			driver.quit();
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumframework.com/demo-sites/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		clickOnLink(driver.findElement(By.xpath("(//h2[text()='Practiceform']//following::a)[1]")));
		
		
		switchToBrowser();
		
		clickOnLink(driver.findElement(By.xpath("//button[text()='New Browser Window']")));
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		
		//switchToBrowser();
		String main=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		
		ArrayList<String> ar=new ArrayList<String>(windows);
		
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++) {
			
			if(!ar.get(i).equals(main)) {
				
				driver.switchTo().window(ar.get(2));
				break;
			}
		}
		
		String titlewindow=driver.getTitle();
		
		System.out.println(titlewindow);
		System.out.println("done1");

		driver.manage().window().maximize();
		
		
		System.out.println("done2");

		
		clickOnLink(driver.findElement(By.xpath("(//a[text()='Optimization Techniques'])[1]")));
		
		try {
		Thread.sleep(3000);
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}

		
		
		
		
		
	}
	
	public void switchToBrowser() {
		
		String main=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		
		ArrayList<String> ar=new ArrayList<String>(windows);
		
		for(int i=0;i<ar.size();i++) {
			
			if(!ar.get(i).equals(main)) {
				
				driver.switchTo().window(ar.get(1));
				break;
			}
		}	
		
//		Iterator<String> it=windows.iterator();
//		
//		while(it.hasNext()) {
//			
//			String window1=it.next();
//			
//			if(!window1.equals(main)) {
//				
//				driver.switchTo().window(window1);
//				break;
//			}
		
	
	}
		
		
		
	
	
	
	public void clickOnLink(WebElement element) {
		
		try {
		if(element.isDisplayed()) {
			
			element.click();
		}else {
			Assert.assertEquals(true, false);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
