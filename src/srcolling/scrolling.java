package srcolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
JavascriptExecutor j=((JavascriptExecutor)driver);
//j.executeScript("window.scrollBy(100,5000)");
Thread.sleep(1000);

j.executeScript("window.scrollBy(500,8000)");
Thread.sleep(1000);
j.executeScript("window.scrollBy(80,-2000)");
	}

}
