package Day3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Sathish/OneDrive/Desktop/WH_Selenium/index.html");
		Thread.sleep(2000);
		String wh = driver.getWindowHandle();

		driver.findElement(By.id("btn1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn3")).click();
		
		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(0));
		Thread.sleep(2000);
		
		driver.close();
		System.out.println("Browser close");
	}
}
