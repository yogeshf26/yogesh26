package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteAppContinuePage {

	// data members
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath ="//*[@id=\"container\"]/div/div/div/form/div[3]/button")private WebElement continueButton;
	 
	//constuctor
	public KiteAppContinuePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//methods 
	public void sendpin() {
		pin.sendKeys("982278");}
		
		
		
	public void clickOnContinueButton() {
			
			
		continueButton.click();
		
		
		
	}
	
}
