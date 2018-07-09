package test_cases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class browser_init {

public static WebDriver driver;
	
	@BeforeTest
	public void intibrowser() throws IOException, InterruptedException {
		  Properties prop = new Properties();
		   
		   FileInputStream fi = new FileInputStream("D:\\workspace\\rediffmailverification\\src\\browser.properties");
		   
		   prop.load(fi);
		   
		   String browsertype = prop.getProperty("browser");
		   
		   if (browsertype.equalsIgnoreCase("firefox")) {
			   System.setProperty("webdriver.firefox.marionette", "D:\\geckodriver.exe");
			   driver = new FirefoxDriver();
			
		}	
		   else if (browsertype.equalsIgnoreCase("Chrome")) {
		  
		   System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		   driver = new ChromeDriver();
			
		}else if (browsertype.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","");
			driver = new InternetExplorerDriver();
						
		}
		   Thread.sleep(1000);
		   System.out.println("url>>"+prop.getProperty("url"));
		   driver.get(prop.getProperty("Url"));
		 //  driver.get(prop.getProperty("url2"));
		   driver.manage().window().maximize();
				
			}
			

	
	
	/*@AfterTest
	public void closebrowser(){
		driver.quit();
		
	}*/
	
	
	
	
}
