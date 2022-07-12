package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		 kiteappPOM loginPage=new kiteappPOM(driver);
		 
		 loginPage.SendUserId();
		 loginPage.Sendpassword();
		 loginPage.clickOnLoginButton();
		 Thread.sleep(2000);
	
			KiteAppContinuePage kit=new KiteAppContinuePage(driver);
	kit.sendpin();
	kit.clickOnContinueButton();
	}
		 
	
	

}
