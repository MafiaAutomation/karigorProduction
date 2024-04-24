package pspTech.karigor.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pspTech.karigor.baseClass.BaseClass;

public class ContactUs extends BaseClass {

	public ContactUs() {
		super(driver);
		
	}

	//@FindBy(xpath="(//a[@href='/about'])[2]")
	 //public WebElement ClickExploreKarigor;
	
	
	//@FindBy(xpath="(//input[@placeholder='Full Name']")
	//@FindBy(xpath="(//input[@name='user_name']")
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/div/form/input[1]")
	public WebElement EnterName;
		
	@FindBy(xpath="//input[@name='user_email']")
	public WebElement EnterEmail;
	
	@FindBy(xpath="//input[@name='subject']")
	public WebElement EnterSubject;
	
	@FindBy(xpath="//textarea[@name='message']")
	public WebElement EnterMessage;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement ClickOnSendMessageButton;
	
	@FindBy(xpath="//*[@id=\"contact_email\"]")
	public WebElement ClickOnEmailButton;
	
	@FindBy(xpath="//*[@id=\"address-link\"]")
	public WebElement ClickOnAddressButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/div/div/section[4]/a[1]/img")
	public WebElement ClickOnFacebookButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/div/div/section[4]/a[1]/img")
	public WebElement ClickOnYoutubeButton;
	
	 
	@FindBy(how= How.XPATH, using ="(//a[@href='/contact'])[2]")
	 public WebElement ClickOnContactUsFooter;
	 
	
}


