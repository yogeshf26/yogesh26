package includeExcludeUse;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class includeUse {
  @Test
  public void a() {
	  Reporter.log("a is running",true);
	  
  }
  @Test
  public void b() {
	  Reporter.log("b is running",true);
  }
  @Test
  public void c() {
	  Reporter.log("c is running",true);
  }
  @Test
  public void d() {
	  Reporter.log("d is running",true);
  }
  
  @Test
  public void e() {
	  Reporter.log("a is running",true);
  }
  @Test
  public void f() {
  }
}
