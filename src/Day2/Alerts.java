package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alerts {
	static String un = "nareshit";
	static String pwd = "nareshit";
	
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(1000);
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		Thread.sleep(1000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000);
		
		Alert a= driver.switchTo().alert();	
		//Retrieve data from alert
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN COMPLETED");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LOGOUT COMPLETED");
		driver.close();	
	}
}
