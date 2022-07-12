package screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class sc1 {

	private static final String TakesScreenshot = null;
	private static org.openqa.selenium.TakesScreenshot driver;
	public static void main(String[] args) throws InterruptedException {
		
		static Webdriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	}public static void takeScreenshot(String filename) {
		
		//takes screenshot and store it as a file format
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//now copy the screenshot to desired location using copyfile method
		FileUtils.copyfiles()
	}

	

}
