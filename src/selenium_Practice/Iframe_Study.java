package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[2]")).click();
WebElement text = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]"));
	System.out.println(text.getText());
	Thread.sleep(1000);
	driver.switchTo().frame("frame1");
	String text1 = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
	System.out.println( text1);
	driver.switchTo().defaultContent();
	String frame = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]")).getText();
	
	System.out.println(frame );
	}

}
