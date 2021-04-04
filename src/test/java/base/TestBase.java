package base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public abstract class TestBase {
    // Resource: WebDriver instance
    // Encapsulation
    private static WebDriver driver;

    protected static WebDriver getDriver(){
        // return the webdriver instance
        return driver;
    }

    // BeforeMethod
    @BeforeMethod
    protected void setUp(){
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();
    }

    //AfterMethod
    @AfterMethod
    public void cleanUp(){
        if(driver != null){
            driver.quit();
        }
    }


}
