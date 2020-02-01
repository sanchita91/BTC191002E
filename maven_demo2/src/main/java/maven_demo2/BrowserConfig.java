package maven_demo2;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import util.Shared;

public class BrowserConfig {
	Properties prop;
	WebDriver driver;
	public WebDriver openBrower() throws IOException {
		prop=Shared.readProp("/Users/sanchita/eclipse-workspace/maven_demo2");
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();

		}
		else if(browser.equals("safari")) {
			driver=new SafariDriver();

		}
		return driver;
	}



//from command line
public WebDriver openBrower1() throws IOException {
	//prop=Shared.readProp("/Users/sanchita/eclipse-workspace/maven_demo2");
	String browser=System.getProperty("browser");
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "Path of chromedriver exe");
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "Path of geckodriver exe");

		driver=new FirefoxDriver();

	}
	else if(browser.equals("safari")) {
		driver=new SafariDriver();

	}
	return driver;
}

}

