package Com.Study;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;


public class TestDemo extends Base
{
	login loginpage;

	public TestDemo()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage= new login();
	}

	@Test
	public void LoginTest() throws InterruptedException
	{
		loginpage.Testlogin();

	}
	
	@AfterMethod
	public void End()
	{
	  driver.close();
	}

}
