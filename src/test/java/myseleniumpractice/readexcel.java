package myseleniumpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	// Read Excel from Apache Poi
	// Fileinputstream will read the data from the given location in the form of
	// bytes and then we will convert that data into excel format

	public static void main(String[] args) throws IOException {

		// we eill use the index numfor the sheet when we have 2 or 3 sets of data of
		// same data types.

		/*
		 * File fi = new File(
		 * "C:\\Users\\Robin\\eclipse-workspace\\myseleniumpractice\\excel\\test.xlsx");
		 *                //assume that this file ahs only 4 values FileInputStream fis = new
		 * FileInputStream(fi); // raw data is present in it XSSFWorkbook wb = new
		 * XSSFWorkbook(fis); XSSFSheet sheet = wb.getSheetAt(0); String
		 * cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
		 * System.out.println(cellvalue);
		 * 
		 * wb.close(); fis.close();
		 */

		// we will use this method when we have n number of rows and colums

		File fi = new File("C:\\Users\\Robin\\eclipse-workspace\\myseleniumpractice\\excel\\test1.xlsx"); // assume  that this file having multiple lines of data
																											
		FileInputStream fis = new FileInputStream(fi); // raw data is present in it
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(1);

		int rowcount = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowcount; i++) {

			XSSFRow row = sheet.getRow(i);
			int cellcount = row.getPhysicalNumberOfCells();

			for (int j = 0; j < cellcount; j++) {
				XSSFCell cell = row.getCell(j);
				String cellvalue = getcellvalue(cell);
				System.out.print("||" + cellvalue);
			}
			System.out.println();

		}

		wb.close();
		fis.close();
	}

	public static  String getcellvalue(XSSFCell cell) {

		switch (cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
		default:
			return cell.getStringCellValue();
		}

	}
}
