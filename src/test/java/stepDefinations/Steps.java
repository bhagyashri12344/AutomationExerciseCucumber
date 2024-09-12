package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;

public class Steps {
	private static final String title = null;
	public WebDriver driver;
	public LoginPage lp;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);

	}

@When("User on automation exercise page {string}")
public void user_on_automation_exercise_page(String string) {
	driver.get("https://automationexercise.com/");
}

@When("User enter valid email as {string} and password as {string}")
public void user_enter_valid_email_as_and_password_as(String email, String password ) {
	lp.clickSignup();
	lp.setUserName(email);
	lp.setPassword(password);
}
	@When("click on login")
	public void click_on_login() {
		lp.clicklogin();

	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String string) {
		/*
		 * if (driver.getPageSource().contains("Login was unsuccessful.")) {
		 * driver.close(); Assert.assertTrue(false); } else { Assert.assertEquals(title,
		 * driver.getTitle()); }
		 */

	}

	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
Thread.sleep(2000);
		lp.clicklogout();
		Thread.sleep(2000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();

	}

}
