package com.seleniumdropdown.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownPractise {
	
	Actions action;
	
	@Test
	public void dropdownSelect() {
		String name="HTML";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\SaiPrasanth\\DATAD_sai\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[@id='menu1']"))).click().build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String text=driver.findElement(By.xpath("(//a[text()='"+name+"'])[2]")).getText();
		System.out.println(text);

		driver.findElement(By.xpath("(//a[text()='"+name+"'])[2]")).click();
		System.out.println("element is clicked ");
		
		
		driver.quit();
		
		
	//   	(//a[text()='HTML'])[2]
		
	}

}
