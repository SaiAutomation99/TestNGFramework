package TablesConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {
	
	
	
	@Test
	public void tableConcept() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://techcanvass.com/examples/webtable.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		List<WebElement> elements=driver.findElements(By.xpath("//table[@id='t01']//tr/td"));
		
		
		for(int i=0;i<elements.size();i++) {
			
			
			String name=elements.get(i).getText();
			System.out.println(name);
			
			if(name.contains("Creta")) {
				
				
				break;
			}
		}
		
		
		driver.quit();
		
		
		
		
		
		
		
	}

	
}
