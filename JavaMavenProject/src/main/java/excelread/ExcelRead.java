package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static FileInputStream fs;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	public static String readstringdata(int a,int b) throws IOException {
		
		fs =new FileInputStream("C:\\Users\\dyuth\\Documents\\Java Programs\\SalarySample.xlsx");
		w = new XSSFWorkbook(fs);
		s=w.getSheet("Sheet1");
		XSSFRow r =s.getRow(a);
		XSSFCell c = r.getCell(b);
		return c.getStringCellValue();
		
	}
	
public static String readintegerdata(int a,int b) throws IOException {
		
		fs =new FileInputStream("C:\\Users\\dyuth\\Documents\\Java Programs\\SalarySample.xlsx");
		w = new XSSFWorkbook(fs);
		s=w.getSheet("Sheet1");
		XSSFRow r =s.getRow(a);
		XSSFCell c = r.getCell(b);
	   int x = (int) c.getNumericCellValue();
	   return String.valueOf(x);
		
	}

}
