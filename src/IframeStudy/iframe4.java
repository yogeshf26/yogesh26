package IframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//Navigate to the demo site
        driver.get("https://demoqa.com/nestedframes");
        
        Thread.sleep(1000);
        driver.switchTo().frame("frame1");
        driver.findElements(by)
        
        
        
	}

}
