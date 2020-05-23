package com.verify.testng;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataProviderExcel {
	
	public String[][] h=null;



	   //https://www.facebook.com/

	@Test(priority = 0)
	public void a() {
		System.out.println("a");
	}

@Test(priority = 1)
public String[][] firstSetUp() throws IOException {
	
	System.out.println("enters 0");
	
	int rownumber;
	XSSFRow row=null;
	
	 h=new String[2][2];
	
	XSSFWorkbook workbook=new XSSFWorkbook("C:\\Users\\Sai\\Desktop\\dataProvider.xlsx");
	XSSFSheet sheet=workbook.getSheetAt(0);
	 rownumber=sheet.getLastRowNum();
	
	for(int i=0;i<=rownumber;i++) {
		
		 row=sheet.getRow(i);
		 
		
		for(int j=0;j<=row.getLastCellNum();j++) {
			
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
	return h;
	
	


}

	

	
	
@Test(priority = 2)
public void m6() {
	
	
	System.out.println("enter 1");
	
	System.out.println(h.length);
	
	for(int i=0;i<h.length;i++) {
		
		
		
		for(int j=0;j<h.length;j++) {
			
			System.out.println(h[i][j]);
		}
		
		
		
	}
}







}
