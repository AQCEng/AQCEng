package TestCases;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import Utility.Helper;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static WebDriver driver;
	
	@Before
	public void StartDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=(WebDriver) new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://subscribe.jawwy.tv/eg-en?");
	}
	
	/*
	@After
	public void StopDriver() {
		driver.quit();
	}
	@AfterMethod
	public void TakeScreenShot(ITestResult result) {
			if (ITestResult.FAILURE==result.getStatus()) {
				System.out.println("Failed");
				System.out.println("Taking .. ScreenShot");
				Helper.CaptureScreenShot(driver, result.getName());
			}
		}
*/
}
