package com.verify.testng;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UploadFileConcept extends BaseClass{
	
	
	
	
	
	@Test
	public void fileConcept() {
		
		
		
		
		
	driver.get("https://demoqa.com/automation-practice-form/");
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Test File to Download']"))).click().build().perform();
		
		try {
		Thread.sleep(3000);
		
		}catch(Exception e) {
			
			
		}
		
		File file=new File("C:\\Users\\Sai\\Downloads");
		File[] fi=file.listFiles();
		String name=null;
		for (File file2 : fi) {
		//	System.out.println(file2.getAbsolutePath());
			
			
			name=file2.getName();
			System.out.println(name);
		}
		//System.out.println(name);

		
		File file1=new File("C:\\Users\\Sai\\Downloads"+"\\"+name);
		
		if(file1.exists()) {
			System.out.println("it exists");
		file1.delete();
		System.out.println("deleted");
		
		}else {
			System.out.println("file not found");
		}
	

		driver.quit();
		
		
		
	}

}
