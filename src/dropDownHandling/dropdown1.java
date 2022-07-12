package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		// find webelement 
		WebElement listbox = driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"));
		//2.Create an object of Select class which will accept WebElement as argument
		Select s= new Select(listbox);
		//3.By using one of the select class methods we can select values form list box like
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		s.selectByValue("option1");
		
	}

}
