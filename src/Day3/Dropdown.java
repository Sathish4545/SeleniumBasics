package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.name("txtUserName"));
		un.sendKeys("nareshit");
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN COMPLETED");
		
		Thread.sleep(1000);
		
		//Refresh
		driver.navigate().refresh();
		System.out.println("Refresh the page is done");
		Thread.sleep(1000);
		//Back
		driver.navigate().back();
		System.out.println("Navigate to back");
		Thread.sleep(1000);
		
		//Forward
		driver.navigate().forward();
		System.out.println("Navigate to forward");
		
		//Enter into frame
		driver.switchTo().frame(0);
		System.out.println("Enter into frame");
		Thread.sleep(1000);
		
		//Select 
		Select st = new Select(driver.findElement(By.id("loc_code")));
		st.selectByVisibleText("Emp. ID");
		driver.findElement(By.xpath("//select[@id='loc_code']")).sendKeys("2359");
		Thread.sleep(1000);
		
		//Click on search btn 
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("Searching is done");
		Thread.sleep(1000);
		
		//click on check box
		driver.findElement(By.name("chkLocID[]")).click();
		System.out.println("Clicking in the check box");
		Thread.sleep(1000);
		
		//Delete
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		System.out.println("Deleting the record");
		Thread.sleep(1000);
		
		//Exit from frame
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		
		//Logout
		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
		System.out.println("LOGOUT COMPLETED");
		Thread.sleep(1000);
		driver.close();
		System.out.println("Browser close");
		
		
	}
}
