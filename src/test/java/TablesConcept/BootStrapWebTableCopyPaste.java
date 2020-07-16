package TablesConcept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BootStrapWebTableCopyPaste {
	
	
	
	
	@Test
	public void webTable() throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://getbootstrap.com/docs/4.0/content/tables/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    WebElement element=	driver.findElement(By.xpath("(//td[contains(text(),'Mark')])[1]"));
	    
	    Actions a=new Actions(driver);
	    a.moveToElement(element).build().perform();
	    a.doubleClick(element).build().perform();
	    element.click();
	    
	    Robot robo=new Robot();
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_C);
	    
	    robo.keyRelease(KeyEvent.VK_CONTROL);
	    robo.keyRelease(KeyEvent.VK_C);	
	    
	    try {
		    Thread.sleep(3000);
		    
		    }catch(Exception e) {
		    	
		    	e.printStackTrace();
		    }
	    
	    
	    driver.navigate().to("https://www.google.com/");
	    
	   // driver.get("https://www.google.com/");
	    
	    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
	    
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_V);
	    
	    robo.keyRelease(KeyEvent.VK_CONTROL);
	    robo.keyRelease(KeyEvent.VK_V);
	    
	    try {
	    Thread.sleep(3000);
	    
	    }catch(Exception e) {
	    	
	    	e.printStackTrace();
	    }
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
