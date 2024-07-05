package Day4;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_POI {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\Excel files\\poisheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("poisheet");
		System.out.println(sheet.getSheetName());		
	}
}