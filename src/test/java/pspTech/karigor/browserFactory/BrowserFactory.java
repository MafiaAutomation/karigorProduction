package pspTech.karigor.browserFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import pspTech.karigor.baseClass.BaseClass;
import pspTech.karigor.utilities.ConfigReaders;

public class BrowserFactory extends BaseClass{
	static ConfigReaders cf = PageFactory.initElements(driver, ConfigReaders.class);
	public BrowserFactory() {
		super(driver);		
	}
 
	public static WebDriver initiateBrowser() {
		driver = BaseClass.getDriver();
		if(cf.getTestData("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Driver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		}
		else if(cf.getTestData("browser").equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", ".\\src\\test\\resources\\Driver\\IEDriverServer.exe" );
		driver = new InternetExplorerDriver();
		}
		else if(cf.getTestData("browser").equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", ".\\src\\test\\resources\\Driver\\geckodriver.exe" );
		driver = new FirefoxDriver();
		}
		else if(cf.getTestData("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\resources\\Driver\\msedgedriver.exe" );
		driver = new EdgeDriver();
		}else {
			System.out.println("Invalid Browser Selected");
		}
		
		driver.get(cf.getTestData("URL"));
		return driver;
		}
	
	

}
