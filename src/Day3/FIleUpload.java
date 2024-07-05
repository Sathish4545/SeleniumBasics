package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIleUpload {
	static String un = "nareshit";
	static String pwd = "nareshit";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Some problem occured");
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Some problem occured");
		}
		
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN COMPLETED");
		
		//Enter into frame
		driver.switchTo().frame(0);
		System.out.println("Enter into frame");
		
		//click on add btn
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		
		driver.findElement(By.name("photofile")).sendKeys("C:\\Users\\Sathish\\Downloads\\Selenium Notes Naresh IT Suresh Sir.pdf");
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Some problem occured");
		}
		
		//Exit from frames
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		
		//Logout 
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LOGOUT COMPLETED");
		
		driver.close();
		System.out.println("Browser close");
	}
}
