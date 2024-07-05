package Day4;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
			driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
			Thread.sleep(3000);
			driver.findElement(By.name("Submit")).click();
			System.out.println("LOGIN COMPLETED");

			WebElement element = driver.findElement(By.linkText("PIM"));
			
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			Thread.sleep(3000);
			driver.findElement(By.linkText("Add Employee123")).click();
			Thread.sleep(2000);
			
			//Logout
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("LOGOUT COMPLETED");
		}
		catch(Exception e) {
			File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1, new File("C:\\Users\\Sathish\\OneDrive\\Desktop\\Fakescreenshot\\image.bmp"));
		}
		driver.close();
	}
}
