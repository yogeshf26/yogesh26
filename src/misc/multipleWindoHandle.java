package misc;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindoHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		Thread.sleep(2000);
String parentwindowid = driver.getWindowHandle();
System.out.println(parentwindowid);

Thread.sleep(2000);
driver.findElement(By.linkText("Try it Yourself")).click();

Thread.sleep(2000);
driver.findElement(By.linkText("Try it Yourself")).click();

Thread.sleep(2000);
driver.findElement(By.linkText("Try it Yourself")).click();

Set<String> allwindowsid = driver.getWindowHandles();
ArrayList<String> tabs=new ArrayList<>(allwindowsid);
driver.switchTo().window(tabs.get(2));
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
Thread.sleep(2000);
driver.switchTo().window(tabs.get(1));

driver.findElement(By.xpath("//a[@onclick='restack(currentStack)']")).click();
Thread.sleep(2000);
System.out.println(driver.getTitle());
driver.switchTo().window(tabs.get(0));
	}

}
