package StepDefinitionPlaceOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class placeOrderSetup {

	WebDriver driver;
	@Given("^User go to the NopCommerce Home page$")
	public void user_go_to_NopCommerce_HomePage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://training.nop-station.com/");
		Thread.sleep(5000);

	}
	
	@When("^User click Cell phones option from Electronics category$")
	public void User_click_Cell_phones_option_from_Electronics_category() throws InterruptedException {
		WebElement linkElement = driver.findElement(By.linkText("cell-phones"));
		linkElement.click();
		Thread.sleep(5000);
	}
	
	@And("^User click on the Nokia Lumia 1020 for product details$")
	public void User_click_on_the_Nokia_Lumia_1020() throws InterruptedException {
		
		driver.findElement(By.className("Show details for Nokia Lumia 1020")).click();
		Thread.sleep(3000);
	}
		
		@And("^User set the quantity number 2 in the quantity field$")
		public void user_set_quantity() {
		WebElement cartQuantity = driver.findElement(By.xpath("//input[@name='addtocart_20.EnteredQuantity']"));
		Select select = new Select(cartQuantity);
		select.selectByVisibleText("2");
		
	}
		
		@And("^User click on the ADD TO CART button$")
		public void click_add_to_cart_button() throws InterruptedException {
			
			//button[@id='add-to-cart-button-20']
			driver.findElement(By.xpath("//button[@id='add-to-cart-button-20']")).click();
			Thread.sleep(5000);
		}
	
		
		 @And("^User go to the shipping cart page$")
		 public void User_go_to_the_shipping_cart_page() throws InterruptedException {
			 driver.findElement(By.xpath("//span[@class='cart-label']]")).click();
				Thread.sleep(5000);

		 }
		 
		 @And("^User_accept_terms_conditions_and_click_checkout_button$")
		 public void User_accept_terms_conditions_and_click_checkout_button() throws InterruptedException {
			
			 driver.findElement(By.xpath("//input[@id='termsofservice']']]")).click();
				Thread.sleep(5000);
		 }
	
		
		 @And("^User click checkout as guest button$")
		 public void checkout_as_guest() throws InterruptedException {
			 driver.findElement(By.xpath("//button[@class='button-1 checkout-as-guest-button']")).click();
			 Thread.sleep(5000);
		 }
		 
		 @And("^User input all the billing details and click continue$")
		 public void user_input_billing_address() {
			 driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("Kaniz");
			 driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("Mow");
			 driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']")).sendKeys("samiyamow613@gmail.com");
			 driver.findElement(By.xpath("//input[@id=' BillingNewAddress_Company']")).sendKeys("Business Automation Ltd");
			 driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("Mow");
			 WebElement billingCountry = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
			Select selectCountry = new Select(billingCountry);
			selectCountry.selectByVisibleText("Bangladesh");
			WebElement billingState = driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']"));
			Select selectState = new Select(billingState);
			selectState.selectByVisibleText("কুষ্টিয়া");
			driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Dhaka");
			driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("507/3,Senpara,Mirpur-13");
			driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("1216");
			driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("01627957677");
			driver.findElement(By.xpath("//button[@class='button-1 new-address-next-step-button']")).click();
			
			
		 }
		 
		 @And("^User select shipping method Next Day Air and click continue$")
		 public void select_shipping_method() throws InterruptedException {
			
			 driver.findElement(By.xpath("//input[@id=''shippingoption_1']")).click();
			 Thread.sleep(5000);
		 }
		
		 @And("^User select payment method Credit Card and click continue$")
		 public void select_payment_method() throws InterruptedException {
			 driver.findElement(By.xpath("//input[@id='paymentmethod_1']")).click();
			 Thread.sleep(5000);
			
		 }
		 
		
		 @And("^User select Visa card and input card information$")
		 public void select_visa_card_and_input_card_information() throws InterruptedException {
			 driver.findElement(By.xpath("//select[@id='CreditCardType']")).click();
			 Thread.sleep(2000); 
			 driver.findElement(By.xpath("//input[@id='CardholderName']")).sendKeys("Noman");
			 driver.findElement(By.xpath("//input[@id='CardNumber']")).sendKeys("1939393939");
			
			 WebElement expireMonth = driver.findElement(By.xpath("//select[@id='ExpireMonth']"));
			 Select selectExpireMonth = new Select(expireMonth);
			 selectExpireMonth.selectByVisibleText("01");
			 
			 WebElement expireYear = driver.findElement(By.xpath("//select[@id='ExpireYear']"));
			 Select selectExpireYear = new Select(expireYear);
			 selectExpireYear.selectByVisibleText("2022");
			 
			 driver.findElement(By.xpath("//input[@id='CardCode']")).sendKeys("2434");
			
			
		 }
		 
		 @And("^User click confirm button to place the order$")
		 public void click_verify_button() {
			 driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
		 }
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
