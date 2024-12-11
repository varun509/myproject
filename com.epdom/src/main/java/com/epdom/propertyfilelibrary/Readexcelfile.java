package com.epdom.propertyfilelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class provides data from any excel file*/
public class Readexcelfile {
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static Workbook book;
	public static String readsingledata(String sheetname,int rowno,int cellno) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\varun\\eclipse-workspace\\com.epdom\\src\\test\\resources\\Data\\empdetails.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Workbook book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = book.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
		return data;
	}
public static void readmultipledata(String sheetname) {
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\varun\\eclipse-workspace\\com.epdom\\src\\test\\resources\\Data\\empdetails.xlsx");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Workbook book = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int rowcount=book.getSheet(sheetname).getLastRowNum();
	for(int i=1;i<rowcount;i++) {
		String data=book.getSheet(sheetname).getRow(i).getCell(1).getStringCellValue();
	}
	
		
	}
public static void writedata(String sheetname,int rowno,int cellno,String datavalue) {
	try {
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\varun\\\\eclipse-workspace\\\\com.epdom\\\\src\\\\test\\\\resources\\\\Data\\\\empdetails.xlsx");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Workbook book = WorkbookFactory.create(fis);
	} catch (EncryptedDocumentException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	book.getSheet(sheetname).getRow(rowno).getCell(cellno).setCellValue(datavalue);
	try {
		fos=new FileOutputStream("C:\\Users\\varun\\eclipse-workspace\\com.epdom\\src\\test\\resources\\Data\\testdata.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
	
		book.write(fos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		book.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
}

}
