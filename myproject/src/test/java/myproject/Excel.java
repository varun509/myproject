package myproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excel {
@Test
	public void ex() throws Exception {
		FileInputStream fis=new FileInputStream("./src/test/resources/test.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		int no=sheet.getLastRowNum();
		System.out.println(no);
		int nocell=sheet.getRow(no).getLastCellNum();
		System.out.println(nocell);
		Object[][] data=new Object[no][nocell] ;
			
		
		for(int i=0;i<no;i++) {
			for(int j=0;j<nocell;j++) {
			data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
				
			}
			
		}

for(Object[] a:data) {
	System.out.println(Arrays.toString(a));
}
	}
}
