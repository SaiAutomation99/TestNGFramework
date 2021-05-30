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
		String name="hello";
		
		if(name.contains("hello")) {
			
			System.out.println("hello man");
		}
		boolean b=name.contains("hello");
		if(b) {
			System.out.println(b);
		}
		System.out.println("hello man");
		char c=name.charAt(0);
		System.out.println(c);
		sc.close();	
	}
}
