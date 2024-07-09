package SikuliExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Example1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\OneDrive\\Desktop\\Selinium\\present chromedriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Screen sc = new Screen();
		//Add image path
		Pattern image = new Pattern("C:\\searchimage\\search.png");
		sc.click(image);
		System.out.println("Clicking is done");
		
	}
}
