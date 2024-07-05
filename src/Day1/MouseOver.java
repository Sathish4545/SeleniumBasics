package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {
	public static String un="nareshit";
	public static String pwd="nareshit";
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN COMPLETED");
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"pim\"]/a/span"));
		
		action.moveToElement(element).perform();
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Mouse hover done");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement element2 = driver.findElement(By.linkText("Admin"));
//		Actions action2 = new Actions(driver);
		action.moveToElement(element2).perform();
		Thread.sleep(3000);
		
		WebElement element3 = driver.findElement(By.linkText("Project Info"));
		action.moveToElement(element3).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(2000);
		System.out.println("Mouse over completly done in this step");
		driver.navigate().back();
		System.out.println("Backward done");
		
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LOGOUT COMPLETED");
		driver.close();
		System.out.println("Browser close");
		
	}
}
