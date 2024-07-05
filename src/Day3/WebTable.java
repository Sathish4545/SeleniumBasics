package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Sathish/OneDrive/Desktop/WebTable/index.html");
		Thread.sleep(2000);
		
		//row count
		int rowCount = driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println(rowCount);
		
		//col count
		int colCount = driver.findElements(By.xpath("/html/body/table/tbody/tr[1]/th")).size();
		System.out.println(colCount);	
		
		// row col count
		int rowcol = driver.findElements(By.xpath("/html/body/table/tbody/tr/td")).size();
		System.out.println(rowcol);
		
		//to get data from particular text
		String data = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[3]")).getText();
		System.out.println(data);
		
		//to get data from all rows
		for(int i=1; i<=rowCount; i++) {
//			for(int j=1; j<=colCount; j++) {
				String allData = driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]")).getText();
				System.out.println(allData);
//			}
		}
		
		
		driver.close();
		System.out.println("Browser close");
		
	}
}
