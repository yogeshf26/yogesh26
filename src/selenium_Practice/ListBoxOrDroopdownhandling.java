package selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxOrDroopdownhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		// find listbox and store in reference variable
		WebElement listBox = driver.findElement(By.id("dropdown-class-example"));
		
		//create object of select class which will accept the webelement as argument
		Select s=new Select(listBox);
		
		// then using select class method we can select value from list box
s.selectByIndex(2);
Thread.sleep(1000);
s.selectByVisibleText("Option3");
Thread.sleep(1000);
s.deselectByVisibleText("Option3");

	
	
		
	}

}
