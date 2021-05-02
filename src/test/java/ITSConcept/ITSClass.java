package ITSConcept;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ITSClass {
	
	
	
	@Test
	public void testIts() {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ITS name");
		String ITSname=sc.next();
		System.out.println("indicator");
		String indicator=sc.next();
		if((ITSname.startsWith("ITS") || ITSname.startsWith("its")) && (indicator.equals("Y") ||indicator.equals("y")) ) {
			
			System.out.println("edit will not set");
		}
			
//		}else if(ITSname.startsWith("its")) {
//			
//			
//		}
		else {
			
			System.out.println("set edit code");
		}
	}
}
