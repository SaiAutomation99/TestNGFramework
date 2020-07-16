package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calender {
	
	
	@Test
	public void calender() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_js_popup.asp");
		
		//driver.findElement(By.xpath("//div[contains(text(),'Click me to toggle')]")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Click me to toggle')]")))).click();
		
		//String tetx=wait.until(ExpectedConditions.alertIsPresent()).getText();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String text=driver.findElement(By.xpath("//span[@id='myPopup']")).getText();
		System.out.println(text);	
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
