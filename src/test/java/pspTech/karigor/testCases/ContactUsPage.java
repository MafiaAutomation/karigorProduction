package pspTech.karigor.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pspTech.karigor.baseClass.BaseClass;
import pspTech.karigor.browserFactory.BrowserFactory;
import pspTech.karigor.pages.ContactUs;
import pspTech.karigor.pages.Home;
import pspTech.karigor.utilities.CommonMethods;

public class ContactUsPage extends BaseClass {

	public ContactUsPage() {
		super(driver);
			
	}
	Home home ;
	ContactUs contact;
	@BeforeTest
	public void setUp() {
	  driver = BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		home=PageFactory.initElements(driver, Home.class);
		CommonMethods.maximizeBrowser();	
	}
	
	@Test
	public void TC_001_ContactUsButtonClicked() { 
		logger.info("Test case_001 Clicked ContactUs Button has started");
		CommonMethods.click(home.ClickOnContactUsNavBar, driver);
	    CommonMethods.getUrl(driver,"https://karigorproduction.com/contact");	
	}
	@Test
	public void TC_002_Sending_Message() throws InterruptedException {
		
		logger.info("Entering data to message form");
		//logger.info("Entering data to message form");
		
		//CommonMethods.sendData(contact.EnterName,driver,"Mafia Rahman");
		//CommonMethods.sendData(contact.EnterEmail, driver, "mafia1234@gmail.com");
		//CommonMethods.sendData(contact.EnterSubject, driver, "Request to join Pohela Boishakh");
		//CommonMethods.sendData(contact.EnterMessage, driver, "Hello Rima Apu, I want to join your Pohela Boishakh and contribute $1000");
		//CommonMethods.click(contact.ClickOnSendMessageButton, driver);
		
		driver.findElement(By.name("user_name")).sendKeys("Mafia Rahman");
		driver.findElement(By.name("user_email")).sendKeys("mafia1234@gmail.com");
		driver.findElement(By.name("subject")).sendKeys("Request to join Pohela Boishakh");
		driver.findElement(By.tagName("textarea")).sendKeys("PSP Tech");
		driver.findElement(By.name("message")).sendKeys("Hello Rima Apu, I want to join your Pohela Boishakh and contribute $1000");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Your message has been successfully sent to Karigor Production. Thanks for contacting Karigor.
			
	}
	
	@Test	
	public void TC_003_Sending_Message_ByEmail() throws InterruptedException { 
	driver.findElement(By.xpath("//*[@id=\"contact_email\"]")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"address-link\"]")).click();
	
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/section[4]/a[1]/img")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/section[4]/a[3]/img")).click();
	
}
	
}	



