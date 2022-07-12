package TestNGstudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class myTestClass {
  @Test
  public void validateUserId() {
	  Reporter.log("user id validate", true);
	  
  }@Test
  public void dashboard() {
	  Reporter.log("dashboard", true);}
  
  
  @BeforeMethod
  public void loginTheKiteapp() {
	  
	  Reporter.log("login successfully", true);
	  
  }

  @AfterMethod
  public void logOut() {
	  Reporter.log("logout successfully", true);
  }

  @BeforeClass
  public void openBrowser() { 
	  Reporter.log("browser open succesfully", true);
  
  
  }

  @AfterClass
  public void browserClose() {
	  Reporter.log("browser closed successfully", true);
  }

}
