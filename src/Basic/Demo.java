package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static WebDriver driver;
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();
		openApplication();
		login();
		logout();
		closeBrowser();
	}

	static void openApplication() throws Exception{
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(2000);
			
	}
	static void login() throws Exception{
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("Submit"));
		login.click();
		System.out.println("LOGIN COMPLETED");
		
	}
	
	static void logout() throws Exception{
		WebElement element = driver.findElement(By.linkText("Logout"));
		Thread.sleep(2000);
		element.click();
		System.out.println("LOGOUT COMPLETED");
	}
	
	static void closeBrowser() {
		driver.close();
		System.out.println("Browser close");
	}
	
}
