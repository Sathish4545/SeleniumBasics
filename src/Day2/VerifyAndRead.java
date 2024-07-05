package Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyAndRead {
	static String un = "nareshit";
	static String pwd = "nareshit";
	
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("Some problem occured here");
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("LOGIN COMPLETED");
		WebElement element = driver.findElement(By.xpath("//li[normalize-space()='Welcome nareshit']"));
		if(element.getText().matches("Welcome nareshit")) {
			System.out.println("Yes text matched");
		}
		else {
			System.out.println("Text not matched");
		}
	
		//frame 
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		
		String code = driver.findElement(By.id("txtEmployeeId")).getAttribute("value");
		System.out.println(code);
		driver.switchTo().defaultContent();
		
		driver.close();
	}
}
