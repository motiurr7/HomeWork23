package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;
	@BeforeMethod
	
	public void setup() {
		
			//System.setProperty("webdriver.chrome.driver", "/Users/motiur/eclipse-workspace/Homework23/driver/chromedriver");
			//driver = new ChromeDriver();
		
			//System.setProperty("webdriver.gecko.driver","./drive/geckodriver");
			System.setProperty("webdriver.gecko.driver","/Users/motiur/eclipse-workspace/Homework23/driver/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().fullscreen();
			driver.manage().deleteAllCookies();
			//driver.get("https://www.facebook.com/");		
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
			
			
			driver.get("https://www.amazon.com/");		
			homePage = new HomePage(driver);
		}

		
		
		@AfterMethod
		public void tearUp() {
			driver.quit();
		}
			
	
	
	
	
}
