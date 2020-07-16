package TablesConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InternetPractise {
	
	
	@Test
	public void internet() throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		
		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_ENTER);
		
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		try {
			
			Thread.sleep(3000);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		driver.quit();
		
		
	}
	
	
	
	
	
	

}
