package IframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
driver.switchTo().frame("courses-iframe");

Thread.sleep(2000);
WebElement text = driver.findElement(By.xpath("//*[@id=\"et-info-email\"]"));
System.out.println(text.getText());
Thread.sleep(2000);
WebElement text1=driver.findElement(By.xpath("//*[@id=\"post-91\"]/div/div/div/div[4]/div/div/div[1]/div/div[2]/h2/span"));
System.out.println(text1.getText());
Thread.sleep(2000);

driver.switchTo().parentFrame();
WebElement main = driver.findElement(By.xpath("//*[@id=\"topheader\"]/section/div/h1"));
System.out.println( main.getText());
	}

}
