package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium guru");
		//arrow down
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		System.out.println("First time arrow down done");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		System.out.println("Second time arrow down done");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		System.out.println("Third time arrow down done");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Click enter btn");
		Thread.sleep(2000);
		driver.close();
		System.out.println("Browser close");
	}
}
