package myseleniumpractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createandwriteexcel {
	
	@SuppressWarnings("unused")
	public static void main (String[]args) throws IOException

	{
		
	// to create the older versrion of excel sheet
	//when we create the older fomat HSSF and given file name as newer extension the file weill create  bt wont open.	
		
		HSSFWorkbook wv=new HSSFWorkbook();
		HSSFSheet sheet=wv.createSheet("Test");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Radhe");
		sheet.getRow(0).createCell(0).setCellValue("Radhe");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Radha");
		sheet.getRow(1).createCell(1).setCellValue("krishna");
		
		File fi=new File("C:\\Users\\Robin\\eclipse-workspace\\myseleniumpractice\\src\\test\\excelreader\\test.xls");
		//FileOutputStream sf=new FileOutputStream(fi);
		wv.write();
		wv.close();
		
		// to create the newer versrion of excel sheet

		XSSFWorkbook wv1=new XSSFWorkbook();
		XSSFSheet sheet1=wv1.createSheet("Test1");
		sheet1.createRow(0);
		sheet1.getRow(0).createCell(0).setCellValue("Radhe");
		sheet1.getRow(0).createCell(0).setCellValue("Radhe");
		
		sheet1.createRow(1);
		sheet1.getRow(1).createCell(0).setCellValue("Radha");
		sheet1.getRow(1).createCell(1).setCellValue("krishna");
		
		File fi1=new File("C:\\Users\\Robin\\eclipse-workspace\\myseleniumpractice\\src\\test\\excelreader\\test1.xlsx");
		//FileOutputStream sf1=new FileOutputStream(fi);
		wv1.write(null);
		wv1.close();

		
	}
}