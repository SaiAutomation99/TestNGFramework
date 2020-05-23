package com.verify.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUpload extends BaseClass{


	@Test
	public void fileUpload() throws AWTException, InterruptedException {

		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//span[text()='Choose file']")).sendKeys("C:\\Users\\Sai\\Downloads\\Sashi D_10+ years_Mainframe Developer with Ab Initio (1).docx");
		driver.findElement(By.xpath("//span[text()='Choose file']")).click();
		Thread.sleep(2000);
		StringSelection selection=new StringSelection("C:\\Users\\Sai\\Downloads\\Sashi D_10+ years_Mainframe Developer with Ab Initio (1).docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);


		Robot rbo=new Robot();
		rbo.keyPress(KeyEvent.VK_CONTROL);
		rbo.keyPress(KeyEvent.VK_V);
		rbo.keyRelease(KeyEvent.VK_CONTROL);
		rbo.keyRelease(KeyEvent.VK_V);
		rbo.keyPress(KeyEvent.VK_ENTER);
		rbo.keyRelease(KeyEvent.VK_ENTER);

	}

}
