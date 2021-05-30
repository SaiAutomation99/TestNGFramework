package Flipkart;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import BaseClass.DriverIntialization;

public class FlipkartDemo extends DriverIntialization{
	
	
	
	@Test
	public void flipkartDemo() {
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Documents\\SaiPrasanth\\DATAD_sai\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		
		// driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		WebElement img=driver.findElement(By.xpath("//div[@class='product-container']//following::li/div//a/img"));
		
		
		Actions a=new Actions(driver);
		
		a.moveToElement(img).build().perform();
		
		WebDriverWait wait=new WebDriverWait(driver, 90);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='product-container']//a[@class='product_img_link']//img)[2]"))));
		
		
		a.moveToElement(driver.findElement(By.xpath("(//div[@class='product-container']//a[@class='product_img_link']//img)[2]"))).click().build().perform();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> set3=driver.getWindowHandles();
		System.out.println(set3);
		
		//driver.switchTo().alert();
		
		//driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='fancybox-frame1594830901509']")));
		//driver.switchTo().frame("fancybox-frame1594830901509");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"))));
		//fancybox-frame1594884033087

		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//p[@class='socialsharing_product list-inline no-print']//button)[2]"))));
		a.moveToElement(driver.findElement(By.xpath("(//p[@class='socialsharing_product list-inline no-print']//button)[2]"))).click().build().perform();
		
		
		String parent1=driver.getWindowHandle();
		Set<String> set1=driver.getWindowHandles();
		Iterator<String> it=set1.iterator();
		while(it.hasNext()) {
			
			
			String window=it.next();
			
			if(!window.equals(parent1)) {
				
				driver.switchTo().window(window);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("djj");
				driver.close();
				break;
			}
		}
		
		driver.switchTo().window(parent1);
		
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		
		a.moveToElement(driver.findElement(By.xpath("//p[@class='socialsharing_product list-inline no-print']//button[@class='btn btn-default btn-google-plus']"))).click().build().perform();
		String parent2=driver.getWindowHandle();
		Set<String> set2=driver.getWindowHandles();
		System.out.println(set2);
		Iterator<String> it1=set2.iterator();
		while(it1.hasNext()) {
			
			
			String window=it1.next();
			
			if(!window.equals(parent2)) {
				
				driver.switchTo().window(window);
				//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("djj");
				driver.close();
				break;
			}
		}
		//driver.close();
		try {
		driver.switchTo().window(parent2);
		
		}catch (Exception e) {
			System.out.println("error in switchto");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
		
		driver.switchTo().defaultContent();
		
		
		}catch(Exception e) {
			
			driver.quit();
			System.out.println("error in default");
		}
		
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));

		
		a.moveToElement(driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']"))).click().build().perform();
		
		//a[@class='fancybox-item fancybox-close']
		
		// driver.switchTo().defaultContent();
		 
		try{
			System.out.println("enters try");
			a.moveToElement(driver.findElement(By.xpath("//form[@id='searchbox']"))).click().sendKeys("sai").build().perform();
		}catch (Exception e) {
			
			System.out.println("enter mine block");
			driver.findElement(By.xpath("//form[@id='searchbox']")).sendKeys("sai");

		}
		
		
		
		try {
		 a.moveToElement(driver.findElement(By.xpath("//form[@id='searchbox']//button"))).click().build().perform();
		 
		}catch(Exception e) {
			
			System.out.println("catch");
		}
		 
		
		
		try {
		Thread.sleep(3000);
		
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
		driver.quit();

	}

}
