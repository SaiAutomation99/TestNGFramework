package com.verify.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenersClass.class)
public class TestListner  {
	
	
	public static WebDriver driver=null;
	
	@BeforeTest
	public void test() {
		

	System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}
	@Test
	public void m1() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
		System.out.println("m1 method");
		
	}
	
	@AfterTest
	public void after() {
		driver.quit();
		
	}

}
