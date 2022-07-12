package groupingStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test (groups= {"sanity"})
  public void a() {
	 Reporter.log("a is running sanity",true); 
	  
  }
  
  
  @Test
  public void b() {
	  Reporter.log("b is running ",true); 
  }
  
  
  
  @Test(groups= {"sanity"})
  public void c() {Reporter.log("c is running sanity",true); 
  }
  
  
  @Test(groups= {"regression"})
  public void d() {Reporter.log("d is running regression",true); 
  }
}
