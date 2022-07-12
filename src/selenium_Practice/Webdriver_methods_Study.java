package selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// webdriver is used to perform actions of browser
		//1.get method used to enter url or open application .
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
// close is used to closed the current tab by open using selenium tool
		//driver.close();
		
		// quit is used to closed the all tab by open using selenium tool 
		//driver.quit();
		
		//maximise and mininize 
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		Thread.sleep(1000);
		// navigat ....to open application move backward forword,refresh the webpage
		//driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://kite.zerodha.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		// getTitle to get the title of current webpage  return type of getTitle is string
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		//getCurrentURL
		
		String currentUrl = driver.getCurrentUrl();
	
	System.out.println(currentUrl );
	
	}

}
