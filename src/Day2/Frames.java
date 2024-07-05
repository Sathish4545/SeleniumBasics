package Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frames {
	static String un = "nareshit";
	static String pwd = "nareshit";
	static String url = "http://183.82.103.245/nareshit/login.php";
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser maximize");
		driver.navigate().to(url);
		Thread.sleep(2000);
		System.out.println("Title is----> "+driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title);
		
		//Verify title
		if(title.equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title is not matched");
		}
		System.out.println("Current Title is----> "+driver.getCurrentUrl());
		driver.findElement(By.name("txtUserName")).sendKeys(un);;
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);;
		//Login
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN COMPLETED");
		
		System.out.println("Title is----> "+driver.getTitle());
		System.out.println("Current Title is----> "+driver.getCurrentUrl());
		String title1 = driver.getTitle();
		if(title1.equals("OrangeHRM")) {
			System.out.println("Yes, title matched");
		}
		else {
			System.out.println("No, title is not matched");
		}
		//Enter into frame
		driver.switchTo().frame("rightMenu");
		System.out.println("Enter into frame");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("txtEmpLastName"));
		element.sendKeys("Rohit");
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.name("txtEmpFirstName"));
		element2.sendKeys("Sharma");
		Thread.sleep(1000);
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("Adding task is done");
		//Reset btn
		driver.findElement(By.id("btnClearPers")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		
		//navigate to back
		driver.navigate().back();
		//Logout
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LOGOUT COMPLETED");
		Thread.sleep(1000);
		driver.close();
		System.out.println("Browser close");
	}
}
