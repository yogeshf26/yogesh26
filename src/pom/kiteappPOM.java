package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteappPOM {

	// data member
	@FindBy(id="userid") private WebElement UserId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath ="//*[@id=\"container\"]/div/div/div/form/div[4]/button") private WebElement LoginButton;
	
	
	//constuctor
	public kiteappPOM (WebDriver driver ) {
		
		PageFactory.initElements(driver, this);
		
	}
	// methods
	public void SendUserId() {
		
		 UserId.sendKeys("ELR321");
	}
	
	
public void Sendpassword() {
	
	Password.sendKeys("Dhana1111");
	
	
}
	
	public void clickOnLoginButton() {
		
		 LoginButton.click();
		
	} 
	
	
}
