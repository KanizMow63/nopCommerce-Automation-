package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegSteps {
	WebDriver driver;
	@Given("User go to the NopCommerce Home page")
	public void user_go_to_the_nop_commerce_home_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://training.nop-station.com/");
		Thread.sleep(5000);

	}
	
	@Given("User navigate to the Registration page")
	public void user_navigate_to_the_registration_page() throws InterruptedException {
		WebElement RegBtn = driver.findElement(By.className("ico-register"));
		RegBtn.click();
		Thread.sleep(5000);
	}
	
	@When("User select the {string} as gender")
	public void user_select_the_as_gender(String string) {
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='F']"));
		radio1.click();
		
	}
	
	@When("User set first name and last name")
	public void user_set_first_name_and_last_name()  {
		driver.findElement(By.id("FirstName")).sendKeys("Kaniz Fatema");
		driver.findElement(By.id("LastName")).sendKeys("Mow");
	}
	
	@When("User set {string} as date of birth")
	public void user_set_as_date_of_birth(String string) {
		
		WebElement birth_date= driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		Select selectBirthDate = new Select(birth_date);
		selectBirthDate.selectByVisibleText(string);
		
		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		Select selectBirthMonth = new Select(birthMonth);
		selectBirthMonth.selectByVisibleText(string);
		
		WebElement birthYear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		Select selectYear = new Select(birthYear);
		selectYear.selectByVisibleText(string);
		
		
	}
	//Dynamic Email
	
	@When("User set {string} as email")
	public void user_set_as_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@When("User set {string} as company details")
	public void user_set_as_company_details(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys(string);
		Thread.sleep(3000);
		
	}
	
	@When("User set Newsletter option as {string}")
	public void user_set_newsletter_option_as(String string) {
	WebElement CheckBox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
	}
	
	@When("User set {string} as password and confirm password again")
	public void user_set_as_password_and_confirm_password_again(String string) throws InterruptedException {
		
		driver.findElement(By.xpath("//label[@for='Password']")).sendKeys(string);
		driver.findElement(By.xpath("//label[@for='ConfirmPassword']")).sendKeys(string);
		Thread.sleep(5000);
	}
	
	
	@When("User click on the Register button")
	public void user_click_on_the_register_button() throws InterruptedException {
		WebElement RegBtn = driver.findElement(By.xpath("//button[@id='register-button']"));
		RegBtn.click();
		Thread.sleep(5000);
	}
	
	
	@Then("Verify that the new account registration message {string} is displayed")
	public void verify_that_the_new_account_registration_message_is_displayed(String string) {
		//div[@class='result']
		
		String RegSuccessMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
		//System.out.println("The actual success message is", +RegSuccessMessage);
		//Assert.assertEquals(RegSuccessMessage, msg);
		
		
	}
	
	
	
}














