package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverIntialization {
	
	public WebDriver driver=null;
	
	public DriverIntialization() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Documents\\SaiPrasanth\\DATAD_sai\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
	}
}


