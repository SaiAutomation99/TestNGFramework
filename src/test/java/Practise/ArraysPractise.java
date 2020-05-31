package Practise;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ArraysPractise {

	@Test
	public void m1() {

		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int a=0;

		for(int i=0;i<my_array.length;i++) {

			a=a+my_array[i];

		}
		System.out.println(a);

	}




	@Test
	public void m2() {


		for(int i=0;i<=10;i++) {

			for(int j=0;j<=10;j++) {

				System.out.print( "-");

			}
			System.out.println();
		}
	}


	//Write a Java program to arrange the elements of a given array of integers where all positive integers appear before all the negative integers.

	@Test
	public void m3() {
		
		int[] k= {2,5,8,-5,1,-4,-1};
		int[] l=new int[k.length];
		
		Arrays.sort(k);
		
//		for(int i=0;i<k.length;i++) {
//			
//			
//			if(k[i]>=0) {
//				l[i]=k[i];
//				
//			}else if(k[i]<0) {
//				
//				l[i]=k[i];
//			}
//		}
		for(int i=0;i<k.length;i++) {
			
			System.out.print(k[i]);
		}
		
	}





















}