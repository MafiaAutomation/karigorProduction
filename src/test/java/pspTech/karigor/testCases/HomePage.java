package pspTech.karigor.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pspTech.karigor.baseClass.BaseClass;
import pspTech.karigor.browserFactory.BrowserFactory;
import pspTech.karigor.pages.Home;
import pspTech.karigor.utilities.CommonMethods;

public class HomePage extends BaseClass{
	public HomePage() {
		super(driver);
		
	}
	Home home ;	 
	@BeforeTest
	public void setUp() {
	  driver = BrowserFactory.initiateBrowser();
		logger.info("Browser is getting initialized in Before Test");
		home=PageFactory.initElements(driver, Home.class);
		CommonMethods.maximizeBrowser();	
		CommonMethods.getTitle(getDriver(), "Karigor Production and Cultural Society");
	}
	@Test
	public void TC_001_HomePageHomeButtonClicked() { 
		logger.info("Test case_001 Clicked Home Button has started");
		//CommonMethods.getTitle(getDriver(), "Karigor Production and Cultural Society");
		CommonMethods.click(home.ClickExploreKarigor, driver);
		
	}
	
	
		
	}
	
	
