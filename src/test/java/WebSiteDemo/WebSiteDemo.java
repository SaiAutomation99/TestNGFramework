package WebSiteDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
	@Test(enabled = false)
	public void testcase1() {
		
		WebElement homepage=driver.findElement(By.xpath("//a[text()='SIGN-ON']"));
		moveElement(homepage);
	WebElement registartion=	driver.findElement(By.xpath("//a[contains(text(),'registration')]"));
	moveElement(registartion);
	
	String name="ALBANIA ";
	
	String text=driver.findElement(By.xpath("//option[text()='"+name+"']")).getText();

		System.out.println(text);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		inputTest(username, "sai");
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		inputTest(password, "123456789");
		WebElement currentpassword=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		inputTest(currentpassword, "123456789");

		driver.findElement(By.xpath("//input[@name='register']")).click();
		WebElement username1=driver.findElement(By.xpath("//input[@name='userName']"));
		inputTest(username1, "sai");
		WebElement password2=driver.findElement(By.xpath("//input[@name='password']"));
		inputTest(password2, "123456789");
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	
	@Test
	public void testCase() {
		moveElement(driver.findElement(By.xpath("//a[text()='Flights']")));
		WebElement username1=driver.findElement(By.xpath("//input[@name='userName']"));
		inputTest(username1, "sai");
		WebElement password2=driver.findElement(By.xpath("//input[@name='password']"));
		inputTest(password2, "123456789");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		 radioBox(driver.findElement(By.xpath("//input[@value='oneway']")));
		 
		 String optionname=driver.findElement(By.xpath("(//option[contains(text(),'Acapulco')])[1]")).getText();
		 driver.findElement(By.xpath("(//option[contains(text(),'"+optionname+"')])[1]")).click();

	
		
			
	}
	public void moveElement(WebElement element) {
		try {
		action=new Actions(driver);
		action.moveToElement(element).click().build().perform();
		
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	public void inputTest(WebElement element,String name) {
		try {
			
			String valuename=element.getAttribute("value");
			if(valuename.isEmpty()) {
		
		element.sendKeys(name);
			}else {
				
				System.out.println("came to else");
			}
		}catch (Exception e) {
			e.printStackTrace();

		}
	}
	public void dropDown(WebElement dropdown) {
		
		try {
			
			//Select select=new Select(dropdown);
			
			dropdown.click();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public void radioBox(WebElement element) {
		
		try {
			if(element.isSelected()==false) {
				
				element.click();
			}else {
				
				//element.click();
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
