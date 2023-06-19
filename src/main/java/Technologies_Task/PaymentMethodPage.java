package Technologies_Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentMethodPage extends PageBase{

	public PaymentMethodPage(WebDriver driver) {
		super(driver);
	}

	// First and Second Steps into Payment Method for Selected Package
	
	@FindBy(id="#order-tier-price")
	WebElement orderprice;
	
	@FindBy(xpath  ="//div[@class='summary-group']//button[@id='btnChoosePaymentMethod']")
	WebElement NextBTN;	
	
	@FindBy(xpath  ="//div[@class='summary-group']//button[@id='btnChooseAddons']")
	WebElement Goto_NextPage;	

	public void Navigateto_PaymentMethod_for_selectedPkg() {
		NextBTN.click();
		Goto_NextPage.click();
	}
	
}
