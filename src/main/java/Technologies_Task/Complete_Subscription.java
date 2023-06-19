package Technologies_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Complete_Subscription extends PageBase{

		public Complete_Subscription(WebDriver driver) {
			super(driver);
		}

		//Fourth Step Complete Subscription 
				
		@FindBy(id="#card_holder_name")
		WebElement CardHolderNameinput;
		
		@FindBy(id="#card_number")
		WebElement CardNuminput;
		
		
		@FindBy(id="#expiry_month")
		WebElement expiry_monthInput;
		
		
		@FindBy(id="#expiry_year")
		WebElement expiry_yearInput;
		
		@FindBy(id="#card_security_code")
		WebElement cvv_nput;
		
		
		public void fill_Account_Details(String Holdername, String card_num , String month , String year , String cvv) {
			CardHolderNameinput.sendKeys(Holdername);
			CardNuminput.sendKeys(card_num);
			expiry_monthInput.sendKeys(month);
			expiry_yearInput.sendKeys(year);
			cvv_nput.sendKeys(cvv);
		}
		
		
		// Submit Subscription method
		
		@FindBy(xpath="	//fieldset[@class='credit-card-buttons']//button[@class='form-btn']")
		WebElement submitsubscribtion;
		
		public void submitsubscfunc() {
			submitsubscribtion.click();
		}		
}
