package SeleniumPractise;

import org.testng.annotations.Test;

public class CalenderClass {
	
	
	
	@Test
	public void calenderClass() {
		
		
		
		String date=date();
		
		System.out.println(date);
		
		dateFormate(date);
		dateFormate("2020-07-17");

		
	}
	
	
	public String date() {
		
		
		String date=java.time.LocalDate.now().toString();
		
		return date;
		
	}
	
	public void dateFormate(String date) {
		
		
		String[] split=date.split("-");
		
		String k=split[2];
		//String k="12";
		System.out.println(k);
		
		for (int i = 0; i < k.length(); i++) {
			
			
			char m=k.charAt(i);
			
			Character nn=new Character(m);
			
			if(nn.toString().equals("0")) {
				
				
				char l=k.charAt(i+1);
				
				Character q=new Character(l);
				String a=q.toString();
				System.out.println("0 and is find"+a);
				break;
			}else {
				
				
				System.out.println("not 0"+k);
				break;
			}	
		}
		
		
		
		
	}

}
