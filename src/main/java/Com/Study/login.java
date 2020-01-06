package Com.Study;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;


public class login extends Base
{
	@FindBy(xpath = "//input[@id='loginform-username']")
	  WebElement UserName;
	  
	  @FindBy(xpath = "//input[@id='loginform-password']")
	  WebElement Password;
	  
	  @FindBy(xpath = "//input[@id='loginform-rememberme']")
	  WebElement CheckBox;
	  
	  @FindBy(xpath = "//button[@name='login-button']")
	  WebElement SignIn;
	  
	  public login()
	  {
	      PageFactory.initElements(driver, this);
	  }
	  public void Testlogin() throws InterruptedException
	  {
		  UserName.sendKeys("sonu@evolutionco.com");
		  Password.sendKeys("Admin@123");
		  CheckBox.click();
		  SignIn.click();
		  System.out.println("login");
	  }
		 
		  }
