package testNGKeywordStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityuse {
	@Test
	public void d()
	{
	Reporter.log("d is running",true);
	}
	@Test
	public void a()
	{
	Reporter.log("a is running",true);
	}
	@Test(priority=-1)
	public void v()
	{
	Reporter.log("v is running",true);
	}
	
	@Test(priority=-3)
	public void z()
	{
	Reporter.log("z is running",true);
	}
	@Test
	public void y()
	{
	Reporter.log("y is running",true);
	}
	@Test(priority=-2)
	public void x()
	{
	Reporter.log("x is running",true);
	}
}
