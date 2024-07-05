package Day4;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel {
	public static void main(String[] args) throws Exception{
		FileInputStream f1 = new FileInputStream("C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\Excel files\\sheet1.xls");
		Workbook w1 = Workbook.getWorkbook(f1);
		Sheet s1 = w1.getSheet("Sheet1");
		System.out.println(s1.getName());
		int i=2;
		String empId = s1.getCell(0,i).getContents();
		String empName = s1.getCell(1,i).getContents();
		String empEmail = s1.getCell(2,i).getContents();
		String empNo = s1.getCell(3,i).getContents();
		
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empEmail);
		System.out.println(empNo);
		
	}
}
