package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application open in chrome browser");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN COMPLETED");
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LOGOUT COMPLETED");
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("Browser close");
		
		
	}
}
