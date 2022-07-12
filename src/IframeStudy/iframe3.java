package IframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
driver.switchTo().frame("iframeResult");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/button")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/a[4]")).click();
	}

}
