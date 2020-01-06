package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static WebDriver driver;
	public static void initialization()
	   {
		   System.setProperty("webdriver.chrome.driver", "../Study/exe/chromedriver79.exe");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   driver.manage().deleteAllCookies();
		   driver.manage().window().maximize();
		   driver.get("http://qc.evolutionco.in:8088/");
		 
	   }
}
