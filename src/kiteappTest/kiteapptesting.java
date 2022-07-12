package kiteappTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteapptesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		WebElement userID = driver.findElement(By.id("userid"));
 WebElement pwd = driver.findElement(By.id("password"));
  WebElement clickLoginButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
		
  userID.sendKeys("ELR321");
  pwd.sendKeys("Dhana1111");
  clickLoginButton.click();
  Thread.sleep(2000);
  WebElement pin = driver.findElement(By.id("pin"));
  WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[3]/button"));
  
  pin.sendKeys("982278");
  
  continueButton.click();
  Thread.sleep(2000);
 WebElement username= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/div/a/span"));
String actualID= username.getText();
	String expecteduserId = "ELR321";
	if(actualID.equals(expecteduserId)) {
		
		
		System.out.println("UserId macthing tc passed");
	}else {
		
		System.out.println("UserId not macthing tc failed");
	}
		
		username.click();
		 Thread.sleep(2000);
		WebElement logout = driver.findElement(By.linkText( "Logout"));
		
		logout.click();
	}

}
