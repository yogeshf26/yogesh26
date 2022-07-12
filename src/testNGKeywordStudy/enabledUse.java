package testNGKeywordStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledUse {
	@Test(enabled=false)
	public void d()
	{
	Reporter.log("d is running",true);
	}
	@Test
	public void a()
	{
	Reporter.log("a is running",true);
	}
	@Test
	public void v()
	{
	Reporter.log("v is running",true);
	}
	
	@Test(enabled=false)
	public void z()
	{
	Reporter.log("z is running",true);
	}
	
}