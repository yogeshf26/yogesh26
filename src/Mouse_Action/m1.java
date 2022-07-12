package Mouse_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(2000);
// create object of actions class
	Actions act=new Actions(driver);
	// perform click action method
WebElement seleniumButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	act.click(seleniumButton).perform();
	Thread.sleep(2000);
	
	
	//perform double click action
	WebElement doubleclickme = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	act.doubleClick(doubleclickme).perform();
	
	Thread.sleep(2000);
	//perform right click /context click
	WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	}

}
