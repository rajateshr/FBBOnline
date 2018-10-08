package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import globals.Globles;


public class BaseClass {
	public static WebDriver driver;
	
	 		  
	  @BeforeTest
	  public void launchBrowser(String browser,String url) throws Exception
	  {
		  System.setProperty("browser", "Chrome");
			Globles.setUp();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Globles.browserNav("QA_FutureGroup_URL");
		  
		  /*if(browser.equalsIgnoreCase("firefox")) {
			  
			  System.setProperty("webdriver.firefox.marionette","D:\\Driver\\geckodriver.exe");
			  
			  driver = new FirefoxDriver();
			  System.setProperty("browser", "firefox");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				Globles.browserMax();
				Globles.browserNav(url);
		  }
		  else if (browser.equalsIgnoreCase("chrome")) {  
			  
			  System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
			  System.setProperty("browser", "Chrome");
			  Globles.setUp();
			  driver = new ChromeDriver();
			  Globles.browserMax();
			  Globles.browserNav(url);
		  }*/ 
		 
	  }
	  @AfterTest  
	  public void quitBrowser() throws Exception 
	  {
		   
		  driver.quit();
	  }
}
