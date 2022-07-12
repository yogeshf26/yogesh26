package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(1000);
//String text = driver.findElement(By.xpath("//*[@id=\"rt-feature\"]/div[1]/div/h3")).getText();
	//System.out.println(text);
	
	 int size = driver.findElements(By.tagName("iframe")).size();
	System.out.println(size);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"form\"]")).sendKeys("fdjgkhl");
	
	
	}

}
