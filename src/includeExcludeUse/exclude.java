package includeExcludeUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class exclude {
  @Test
  public void p() {
	Reporter.log("p are running ",true);
  }

  @Test
  public void  q() {
	  Reporter.log("q are running ",true);
  }

  @Test
  public void r() {
	  Reporter.log("r are running ",true);
  }
  
  @Test
  public void s() {
	  Reporter.log("s are running ",true);
  }
}


