package TestCases;
import org.junit.Test;

import Technologies_Task.CompletePaymentPage;
import Technologies_Task.Complete_Subscription;
import Technologies_Task.Packages_page;
import Technologies_Task.PaymentMethodPage;

public class E2ETest extends TestBase {
	
	Packages_page pkg;
	PaymentMethodPage pmp;
	CompletePaymentPage cpp;
	Complete_Subscription CS;
	
	
	@Test
	public void E2EScenario() throws NullPointerException, InterruptedException   {
		
		
		pkg=new Packages_page(driver);
	    pkg.StartTrial_For_Classickpkg();
	
	    
		pmp = new PaymentMethodPage(driver);
		pmp.Navigateto_PaymentMethod_for_selectedPkg();
			
		
		
		cpp = new CompletePaymentPage(driver);
		cpp.fill_Account_Details("heshoahmed868@gmail.com"," 12345678");
		cpp.submitpaymentfunc();
	
		
		//CS = new Complete_Subscription(driver);

		
		}
	}
	

