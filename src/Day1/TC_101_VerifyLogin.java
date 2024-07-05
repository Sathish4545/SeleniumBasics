package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class TC_101_VerifyLogin {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(2000);
		System.out.println("Application open in chrome browser");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println("And the actual title is: "+driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN COMPLETED");
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("OrangeHRM")) {
			System.out.println("Title correct");
		}
		else {
			System.out.println("title not correct");
		}
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]"));
		String text = element.getText();
		System.out.println(text);
		
		if(text.equals("Welcome nareshit")) {
			System.out.println("Text matched");
		}
		else {
			System.out.println("Text not matched");
		}
		
		
		
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LOGOUT COMPLETED");
		driver.close();
		System.out.println("Browser Close");
	}
}
