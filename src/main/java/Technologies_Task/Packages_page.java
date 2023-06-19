package Technologies_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Packages_page extends PageBase{

	public Packages_page(WebDriver driver) {
		super(driver);
	}
	
    // Classic Package 
	
	@FindBy(id="classic-selection")
	WebElement CP_startTrialBTN;	
	
	@FindBy(id="currency-classic")
	WebElement currency_classic;	
	
	
	public void StartTrial_For_Classickpkg() {
		CP_startTrialBTN.click();
	}
	
	// Lite Package 

	@FindBy(id="lite-selection")
	WebElement Lite_startTrialBTN;	
	
	@FindBy(id="currency-lite")
	WebElement currency_lite;	
	
	
	public void StartTrial_For_Litepkg() {
		Lite_startTrialBTN.click();
	}
	
	// Premium Package 

	@FindBy(id="premium-selection")
	WebElement premium_startTrialBTN;	
	
	@FindBy(id="currency-premium")
	WebElement currency_premium;	
	
	
	public void StartTrial_For_premiumpkg() {
		premium_startTrialBTN.click();
	}

	

}
