package com.verify.testng;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
	
	public WebDriver driver;
	
	public Object[][] h;

	@DataProvider(name="sai")
	public Object[][] firstSetUp() throws IOException {
		
		XSSFWorkbook workbook=null;
		
		try {
		System.out.println("enters 0");
		
		int rownumber;
		XSSFRow row=null;
		
		//System.out.println(row.getLastCellNum());
		
		 h=new String[3][2];
		
		workbook=new XSSFWorkbook("C:\\Users\\Sai\\Desktop\\dataProvider.xlsx");
		XSSFSheet sheet=workbook.getSheetAt(0);
		 rownumber=sheet.getLastRowNum();
		 System.out.println(rownumber);
		
		for(int i=0;i<rownumber+1;i++) {
			
			 row=sheet.getRow(i);
			 
			
			for(int j=0;j<row.getLastCellNum();j++) {
				
				//System.out.println(row.getLastCellNum());
				
			XSSFCell cell=	row.getCell(j);
			CellType celltype=cell.getCellType();
			
			if(celltype==CellType.STRING) {
				h[i][j]=cell.toString();
				
				
			}else if(celltype==CellType.NUMERIC) {
				h[i][j]=cell.toString();
				
				
			}
			}
		}
		
		System.out.println("q");
		System.out.println(row.getLastCellNum());

		return h;
		
		}finally {
			 workbook.close();
			
		}
	}
	
	public ParametersTag tag=new ParametersTag();

	
	
@Test(dataProvider ="sai")
public void m6(Object column,Object colum) {
	

	System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	//tag=new ParametersTag();
	tag.inputBox(driver.findElement(By.xpath("//input[@id='email']")), column.toString());
	tag.inputBox(driver.findElement(By.xpath("//input[@id='pass']")), colum.toString());
	
	
	driver.quit();
}
}

