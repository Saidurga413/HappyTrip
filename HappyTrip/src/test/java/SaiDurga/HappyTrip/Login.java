package SaiDurga.HappyTrip;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

public class Login extends TestCase {
	  private WebDriver driver;
	  private String baseUrl;
	  @Before
	  public void setUp() throws Exception {
		
			// declaration and instantiation of objects/variables
		   //System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		  System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");

			//driver = new FirefoxDriver();

		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			baseUrl = "https://test-claims.accesshealthcarephysiciansllc.net";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	  }
	 @Test
	  public void testUntitledTestCase() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.id("userId")).clear();
        driver.findElement(By.id("userId")).sendKeys("t_sdevi@ahcpllc.com");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("Password@123");
        driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
	    driver.close();
	
	  }
	@After
	public void tearDown() throws Exception {

	    driver.close();
	
	  }
}
