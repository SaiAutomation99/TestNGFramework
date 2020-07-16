package TablesConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapSearchBox {
	
	
	
	@Test
	public void searchBox() {
		
		

		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		
		
	List<WebElement> ele=	driver.findElements(By.xpath("//div[@class='sbl1']/span/b"));
	
	for (int i = 0; i < ele.size(); i++) {
		
		
		String names=ele.get(i).getText();
		System.out.println(names);
		
		if(names.contains("testing")) {
			
			
			ele.get(i).click();
			break;
		}
		
	}
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.quit();
		
		
	}

}
