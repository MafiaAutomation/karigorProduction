 package pspTech.karigor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pspTech.karigor.baseClass.BaseClass;

public class Home extends BaseClass {

	public Home() {
		super(driver);
			
	}
 @FindBy(xpath="(//a[@href='/about'])[2]")
 public WebElement ClickExploreKarigor;
	
 @FindBy(how= How.XPATH, using ="(//a[@href='/about'])[1]")
 public WebElement ClickOnAboutUsInNavigationBar;
 
 @FindBy(how= How.XPATH, using ="(//a[@href='/about'])[3]")
 public WebElement ClickOnAboutUsFooter;
 
 @FindBy(how= How.XPATH, using ="(//a[@href='/contact'])[1]")
 public WebElement ClickOnContactUsNavBar;
 
 
 
}
