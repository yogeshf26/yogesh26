package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Method_Uses {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//sendkeys
		
		driver.findElement(By.id("autocomplete")).sendKeys("INDIA");
		Thread.sleep(1000);
		//Clear method .
		driver.findElement(By.id("autocomplete")).clear();
		
		Thread.sleep(1000);
		// click method
		driver.findElement(By.id("checkBoxOption2")).click();
		Thread.sleep(1000);
		
		//isenable
		boolean Enabled = driver.findElement(By.id("confirmbtn")).isEnabled();
		System.out.println(Enabled);
		
		Thread.sleep(1000);
		//is selected
		
		 boolean selected = driver.findElement(By.xpath("//*[@id=\"serviceid1\"]/div/div/div[1]/input[2]")).isSelected();
		System.out.println(selected);
				 Thread.sleep(1000);
		//is displayed
		boolean displayed = driver.findElement(By.id("show-textbox")).isDisplayed();
		System.out.println(displayed );
		
	}
}
