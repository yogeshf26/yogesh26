package kiteappTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteappexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File myfile= new File("C:\\selenium\\exel\\exelStudy267.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		String ID = mysheet.getRow(0).getCell(0).getStringCellValue();
		String PWD = mysheet.getRow(1).getCell(0).getStringCellValue();
		String PIN = mysheet.getRow(2).getCell(0).getStringCellValue();
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		WebElement userID = driver.findElement(By.id("userid"));
 WebElement pwd = driver.findElement(By.id("password"));
  WebElement clickLoginButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
		
  userID.sendKeys(ID);
  pwd.sendKeys(PWD );
  clickLoginButton.click();
  Thread.sleep(2000);
  WebElement pin = driver.findElement(By.id("pin"));
  WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[3]/button"));
  
  pin.sendKeys(PIN);
  
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

}
