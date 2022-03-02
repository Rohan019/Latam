package Base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Connection {

public static	WebDriver driver ;



//@Before
public  void setup() throws IOException
{
	BufferedReader prop = new BufferedReader(new FileReader("C:\\Users\\RSHERBAH\\Downloads\\Latam\\property\\test.properties"));
	Properties properties = new Properties();
	properties.load(prop);
	 
	
	String browser = properties.getProperty("browser");
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", properties.getProperty("driverPath"));
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", properties.getProperty("driverPath"));
		driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("InternetExplorer")) {
		System.setProperty("webdriver.ie.driver", properties.getProperty("driverPath"));
		driver = new InternetExplorerDriver();
	}
	else {
		System.out.println("No browser available");
	}
	

String url = properties.getProperty("mxurl");
System.out.println(url);
	
	
	driver.manage().window().maximize();
	String implicitlyWait = properties.getProperty("implicitlyWait");
	long wait = Long.parseLong(implicitlyWait);
	driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	
} 
	
//@After

/*public void tearDown() {
	driver.close();
}*/

	
}
