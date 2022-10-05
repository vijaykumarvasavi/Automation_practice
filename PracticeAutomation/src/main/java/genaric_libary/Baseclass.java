  package genaric_libary;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Baseclass {
	
	
        Datafilehandiling dt = new Datafilehandiling();         
        public WebDriver driver;
        
        Allfunctions all = new Allfunctions();
        
	
		@BeforeSuite	
		public void opendatabase() {
		System.out.println("Open database");		
		}
		
		
		@BeforeClass
	    @Parameters("Browser")
		public void lunchbrowser() throws Exception {
		System.out.println("luncher browser");	
		
//	    switch (Browser.getlowercase()) {
//	    
//	    }
		
		String BROWSER = dt.getdatafile("Browser");
		System.out.println(BROWSER);
		
		if (BROWSER.contains("Chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (BROWSER.contains("Firefox")) 
		{
			driver = new FirefoxDriver();
		}
		    else {
			System.out.println("Invalid browser");
		}

		String URL = dt.getdatafile("url");
		System.out.println(URL);		
		driver.get(URL);
		
		driver.manage().window().maximize();
		all.waitForHTMLDOM(driver);
			
		}	
		
		
		@BeforeMethod
		public void LoginApplication() throws Throwable
		{
			
			System.out.println("LoginApplication");
		}
					
		@AfterMethod
		public void LogoutApplication()
		{
			System.out.println("Logout Application");
			
		}	
			
		@AfterClass
		public void closebrowser() {
			System.out.println("close browser");			
			driver.quit();
		}
					
		@AfterSuite	
		public void closedatabase() {
		System.out.println("Close database");		
		}

		
		
}
  