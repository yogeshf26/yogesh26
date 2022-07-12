package testNGKeywordStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependonmethod {
	@Test
public void d()
{Assert.fail();
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

@Test(dependsOnMethods= {"d"})
public void z()
{
Reporter.log("z is running",true);
}
}
