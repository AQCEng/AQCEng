package Technologies_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePaymentPage extends PageBase{

	public CompletePaymentPage(WebDriver driver) {
		super(driver);
	}
	
	// Fill Account Details Step

	@FindBy(xpath="//div[@class='option-group']//input[@id='readonlyEmail']")
	WebElement EmailAddress_Input;
	
	@FindBy(xpath="//div[@class='option-group']//input[@id='readonlyPassword']")
	WebElement Password_Input;
	
	
	@FindBy(className=".payment-header")
	WebElement payment_header;

	
	


	public void fill_Account_Details(String Email, String Password) throws InterruptedException {
		EmailAddress_Input.click();
		Thread.sleep(1000);

		EmailAddress_Input.sendKeys(Email);
		Password_Input.sendKeys(Password);

	}
	
	
	// Click on Next BTN to go to Forth Step
	
	@FindBy(xpath="	//div[@class='summary-group']//button[@id='btnFinalStepSubscribe']")
	WebElement submitpaymentbtn;
	
	public void submitpaymentfunc() {
		submitpaymentbtn.click();
	}
	
	
}
