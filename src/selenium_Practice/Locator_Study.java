package selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Study {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// to find locator with help of x-path
		
		//input[@type='text']....find the loctor with the help of x-path by attribute
		
		// find the x-path by text
		//a[text()='Forgotten password?']......(forgot password field)
		
		//find the xpath by contains
		//h2[contains(text(),'Facebook helps yo')].......by text
		
	}

}
