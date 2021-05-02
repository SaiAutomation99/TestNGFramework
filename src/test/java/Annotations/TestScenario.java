package Annotations;

import org.testng.annotations.Test;

public class TestScenario {
	
	
	
	@Test
	public void testScenario() {
		
		System.out.println("test scenario");
		
		String name="test";
		char h=name.charAt(0);
		System.out.println(h);
		
		String test="\\";
		System.out.println(test);
		System.out.println(test.length());
		System.out.println(test.charAt(0));
		System.out.println(name.length());
		System.out.println(test);
		String name2="string";
		System.out.println(name2);
		
		String name3="name";
		//System.out.println(name3);
		
		while(name3!=null) {
			
			System.out.println(name3);
			break;
			
		}
		
		String str="name";
		//int i=0;
		//for(char c:str.charAt(i))
		
		str.toCharArray();
		for(int i=0;i<str.toCharArray().length;i++) {
			System.out.println(i);
			
		}
		
		String hello="helloname";
		char[] ch=hello.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		int[] a=new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=i;
			System.out.println(i);
		}
		
		for(int k:a) {
			
			System.out.println("hello"+k);
		}	
	}
}


