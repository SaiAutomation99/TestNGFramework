package InputAttributesPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InputAttribute {
	
	
	@Test
	public void inputAttribute() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\SaiPrasanth\\DATAD_sai\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_input_attributes_value");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		String name=driver.findElement(By.xpath("//input[@id='fname']")).getText();
		System.out.println(name);
		driver.quit();		
		
		
	}

}





