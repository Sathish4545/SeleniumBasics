package Day4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		assertEquals("Droppable | jQuery UI", driver.getTitle());
		System.out.println("Title Matched");
		
		driver.switchTo().frame(0);
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		Thread.sleep(2000);
		System.out.println("Drag and drop completed");
		driver.switchTo().defaultContent();
		
		driver.close();
		System.out.println("Browser close");
	}
}
