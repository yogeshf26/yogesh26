package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableReading {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		// how to find no of rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int totalNoOfRow = rows.size();
		
		System.out.println(totalNoOfRow);
		
		
		// how to find toatal no of column
		List<WebElement> column = driver.findElements(By.xpath("//table//tr[1]//th"));
		int totalnoofcolumn = column.size();
		System.out.println(totalnoofcolumn);
		// how to read column
//		for(WebElement header:column) {
//			
//			System.out.print(header.getText()+"   ");
//			
//		}
//		
//		// how to read rows 
//		for(WebElement rowss:rows) {
//			System.out.println(rowss.getText()+"  ");
//			
//		}
		//how to read 10th no row
		 List<WebElement> row4 = driver.findElements(By.xpath("//table//tr[4]//td"));
		 for(WebElement r4:row4) {
			 
			 System.out.print(r4.getText()+"     ");
		 }
		 
	}

}
