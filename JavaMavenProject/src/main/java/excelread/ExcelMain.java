package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		System.out.println(ExcelRead.readstringdata(0, 0));
		System.out.println(ExcelRead.readintegerdata(0,1));
		System.out.println(ExcelRead.readstringdata(1, 0));
		System.out.println(ExcelRead.readintegerdata(1,1));

	}

}
