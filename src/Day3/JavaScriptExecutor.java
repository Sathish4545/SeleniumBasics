package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement username = driver.findElement(By.name("txtUserName"));
		js.executeScript("arguments[0].value='nareshit';", username);
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("txtPassword"));
	    js.executeScript("arguments[0].value='nareshit';", password);		
	    Thread.sleep(2000);
		
		
//		WebElement un = driver.findElement(By.name("txtUserName"));
//		un.sendKeys("nareshit");
//		
//		WebElement pwd = driver.findElement(By.name("txtPassword"));
//		pwd.sendKeys("nareshit");
		
	    //click 

	    WebElement login = driver.findElement(By.name("Submit"));
	    js.executeScript("arguments[0].click();", login);
	    System.out.println("LOGIN COMPLETED");
	    Thread.sleep(2000);
	    
        WebElement logout = driver.findElement(By.linkText("Logout"));
        js.executeScript("arguments[0].click();", logout);
        System.out.println("LOGOUT COMPLETED");
	    
        driver.close();
        System.out.println("Browser close");
        
	}
}
