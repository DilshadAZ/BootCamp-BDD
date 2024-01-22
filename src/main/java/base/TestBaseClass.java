package base;



import static constant.Key.EXPLICIT_WAIT;
import static constant.Key.PAGELOAD_WAIT;
import static constant.Key.URL;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import constant.FileName;

import pageobject.HomeLoansPage;
import pageobject.HomePage;
import static constant.Key.*;
import util.ConfigUtil;

public class TestBaseClass {
	 
	public static WebDriver driver; // or we can use protected type, otherwise it is default type
	    ConfigUtil config;
	    public WebDriverWait wait;
	    public static JavascriptExecutor javascriptExecutor;
	    
	    public static HomePage homepage;
	    public static HomeLoansPage homeloanspage;
	    

	    public void setUp() {
	    	 config = new ConfigUtil(FileName.CONFIG_PROPERTIES);
	         driver = initDriver();
	         driver.manage().window().maximize();
	         driver.manage().deleteAllCookies();
	         driver.get(config.getPropertyValue(URL));
	         long pageLoadTime = Long.parseLong(config.getPropertyValue(PAGELOAD_WAIT));
	         long explicitlyWait =	Long.parseLong(config.getPropertyValue(EXPLICIT_WAIT));
	         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(explicitlyWait));
	         wait = new WebDriverWait(driver, Duration.ofSeconds(explicitlyWait));
	         javascriptExecutor = (JavascriptExecutor)driver;
	         initClasses(driver);
	    }

	    public WebDriver initDriver () {
	    	String browserName = config.getPropertyValue(BROWSER);

	        switch (browserName) {

	            case "chrome":
	                WebDriverManager.chromedriver().setup();
	                return new ChromeDriver();
	            case "firefox":
	                WebDriverManager.firefoxdriver().setup();
	                return new FirefoxDriver();
	            case "edge":
	                WebDriverManager.edgedriver().setup();
	                return new EdgeDriver();
	            default:
	                WebDriverManager.chromedriver().setup();
	                return new ChromeDriver();
	        }
	    }

	    public void initClasses(WebDriver driver) {
	    	homepage = new HomePage(driver);
	    	homeloanspage = new HomeLoansPage(driver);
	    	
	    }
	    
	    // After a test is done, what need to do
	    public void tearUp(){
	        driver.quit();
}
	    
}
