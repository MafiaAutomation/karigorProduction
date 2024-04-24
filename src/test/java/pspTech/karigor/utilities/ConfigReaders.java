package pspTech.karigor.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReaders {
	Properties prop = new Properties();
	FileInputStream fis = null;
// if you want to provide value to instance variable
// you need to declare a constructor
	
	public ConfigReaders () {
		try {
			fis = new FileInputStream(".\\src\\test\\resources\\ConfigReaders\\testData.properties");
		prop.load(fis); 
		} catch (FileNotFoundException e) {
		   e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// to get the string value from the property file
	public String getTestData(String element) {
	String value = prop.getProperty(element);
		
		return value;
	
}

}
