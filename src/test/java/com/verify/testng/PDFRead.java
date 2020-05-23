package com.verify.testng;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PDFRead {
	
	
	@Test
	public void PdfRedaer() throws InvalidPasswordException, IOException {
		
		File file=new File("C:\\Users\\Sai\\Downloads\\sample.pdf");
		
		PDDocument document=PDDocument.load(file);
		PDFTextStripper text=new PDFTextStripper();
		String name=text.getText(document);
		String[] k=name.split("//n");
		for (String string : k) {
			
			System.out.println(string);
			
		}
		document.close();	
	}
}