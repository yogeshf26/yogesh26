package groupingStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test(groups= {"regression"})
  public void v() {
	  
	  Reporter.log("v is running regression ",true);
  }
  
  
  @Test(groups= {"regression"})
  public void w() {Reporter.log("w is running regression ",true);
  }
  
  
  @Test(groups= {"sanity"})
  public void x() {Reporter.log("xis running sanity ",true);
  }
  
  
  
  @Test(groups= {"regression"})
  public void y() { {Reporter.log("z is running regression ",true);
  }
  
  }}
