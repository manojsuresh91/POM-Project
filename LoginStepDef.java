package cucumberJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 


public class LoginStepDef { 

	WebDriver driver = null; 

	@Given("^open browser and start application$") 
	public void openBrowserStartApplication() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  //ChromeDriver v2.29.461591
		ChromeOptions options = new ChromeOptions(); // Chrome Version 58.0.3029.96 (64-bit)
		options.addArguments("test-type");
		options.addArguments("chrome.switches", "--disable-extensions");
		options.addArguments("--enable-precise-memory-info");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://ctiapps.cns-inc.com/AsOneES/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Landed in AsOne Login Page");
	} 

	@When("^I enter valid Username as \"([^\"]*)\" and valid Password as \"([^\"]*)\"$") 
	public void enterUsernameAndPassword(String uName, String pwd) {		
		driver.findElement(By.id("loginUsername")).sendKeys(uName);
		driver.findElement(By.id("loginPassword")).sendKeys(pwd);
	} 

	@Then("^User should be able to login successful$") 
	public void clickLoginButton() {
		driver.findElement(By.id("login_submit")).click();
		System.out.println("Loged in successfully");
		
	}
	
	@And("^Close the Browser$")
	public void closeBrowser() throws Exception{
		Thread.sleep(20000);
		driver.close();
		System.out.println("Browser Closed");
	}
}
