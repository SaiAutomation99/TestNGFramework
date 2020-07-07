package SeleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebsiteTest {
	

	@Test
	public void datePicker() {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.phptravels.net/home");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		String date=java.time.LocalDate.now().toString();
		
		
		
		String[] arr=date.split("-");
		
		String date1=arr[2];
		System.out.println(date1);
		
		char[] ch=date1.toCharArray();
		char h;
		
		
		String kk="0";
		
		for(int i=0;i<ch.length;i++) {
			
			Character k=new Character(ch[i]);
			if(k.toString().equals(kk)) {
				
				h=ch[i+1];
				
				Character k1=new Character(h);
				String d=k1.toString();
				System.out.println(d);
				
				driver.findElement(By.xpath("(//div[@class='datepicker--content']//following::div//div[text()='"+d+"'])[1]")).click();
				break;

			}else {
				
				driver.findElement(By.xpath("(//div[@class='datepicker--content']//following::div//div[text()='"+date1+"'])[1]")).click();
				break;

			}
		
		
		}
			
		//	driver.findElement(By.xpath("(//div[@class='datepicker--content']//following::div//div[text()='"+date1+"'])[1]")).click();

			
		

		
		System.out.println("clicked");
		
		driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
