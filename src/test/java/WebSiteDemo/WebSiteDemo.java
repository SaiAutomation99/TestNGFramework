package WebSiteDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebSiteDemo {
	
	
	public WebDriver driver;
	public Actions action;
	@BeforeTest
	public void preempitives() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		
		
	}
	
	@Test
	public void testCase() {
		WebElement homepage=driver.findElement(By.xpath("//a[text()='SIGN-ON']"));
		moveElement(homepage);
	WebElement registartion=	driver.findElement(By.xpath("//a[contains(text(),'registration')]"));
	moveElement(registartion);
	
	String name="ALBANIA ";
	
	String text=driver.findElement(By.xpath("//option[text()='"+name+"']")).getText();

		System.out.println(text);
			
	}
	public void moveElement(WebElement element) {
		action=new Actions(driver);
		action.moveToElement(element).click().build().perform();
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
