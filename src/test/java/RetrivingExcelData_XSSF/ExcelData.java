package RetrivingExcelData_XSSF;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelData {
	
	public String s="";
	@Test
	public void excelData() {
		try {
			
		FileInputStream input=new FileInputStream("C:\\Users\\Sai\\Desktop\\hssfworkdata.xlsx");	
		XSSFWorkbook work=new XSSFWorkbook(input);
		XSSFSheet sheet=work.getSheetAt(0);
		System.out.println(sheet.getLastRowNum());
		for(int i=0;i<sheet.getLastRowNum();i++) {
			
			XSSFRow row=sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				
				System.out.println(row.getLastCellNum());
				XSSFCell cell=row.getCell(j);
				
				CellType celltype=cell.getCellType();
				
				if(celltype==CellType.STRING) {
					
					String name=cell.getStringCellValue();
					s=s+name;
				}
			}
		}
		System.out.println(s);
		input.close();
		work.close();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}