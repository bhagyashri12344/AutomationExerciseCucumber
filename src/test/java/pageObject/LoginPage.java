package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	
	}
	
	@FindBy(xpath="//input[@data-qa='login-email']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	WebElement txtPassword;
	 
	@FindBy(xpath="//button[normalize-space()='Login']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	@CacheLookup
	WebElement btnSignup;
	
	@FindBy(xpath="//a[text()=' Logout']")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
   public void setPassword(String pwd) {
	   txtPassword.clear();
	   txtPassword.sendKeys(pwd);
   }
   public void clicklogin() {
	   btnLogin.click();
	   
   }
   public void clicklogout() {
	   lnkLogout.click();
   }
   
   public void clickSignup() {
	   btnSignup.click();
   }
   
   }

