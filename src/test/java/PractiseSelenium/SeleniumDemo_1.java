package PractiseSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumDemo_1 {
	
	public WebDriver driver;
	
	@Test
	public void websiteTest() {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\SaiPrasanth\\DATAD_sai\\drivers\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement element=driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		moveTheElement(element);
		String name=element.getText();
		System.out.println(name);
		element.click();
		WebElement select=driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		dropdownSelection(select, "Price: Highest first");
		
		String g=driver.findElement(By.xpath("(//ul[@class='product_list grid row']//p)[1]")).getText();
		System.out.println(g);
		closingMethod();	
	}
	
	public void moveTheElement(WebElement element) {
		
		if(element!=null) {
			
			Actions a=new Actions(driver);
			a.moveToElement(element).build().perform();				
		}else {
			
			System.out.println("element is null");
		}
		
	}
	
	public void clickable(WebElement clickableelement) {
		
		if(clickableelement.isEnabled()) {
			
			
			clickableelement.click();
		}else {
			System.out.println("element is not clickable");
		}
	}
	public void closingMethod() {
		try {
			
			Thread.sleep(3000);
		driver.quit();	
		
		}catch(Exception e) {
			
			e.printStackTrace();
		}

	}
	
	public void dropdownSelection(WebElement selectelement,String dropdownvalue) {
		
		
		Select select=new Select(selectelement);
		
		if(dropdownvalue==null) {
			System.out.println("dropdown value is missing");
		}else {
		
		select.selectByVisibleText(dropdownvalue);	
	}

}
//	By path=By.xpath("");
//	
//	public WebElement commonElement(By path) {
//		
//		return driver.findElement(path);
//}
	
	
		
}
