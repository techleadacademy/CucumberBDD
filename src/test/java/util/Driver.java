package util;

import contstants.SeleniumConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver = null;
    public static final String propertyPath = "./src/test/resources/conf/configuration.properties";

    public static final String sauceUsername = ConfigReader.readProperty("sauceUser");
    public static final String sauceKey = ConfigReader.readProperty("sauceKey");
    public static final String URL = "http://" + sauceUsername + ":" +sauceKey + "@ondemand.saucelabs.com:80/wd/hub";

    public static void initialize(String browser){
        if (driver != null )
            return;
        if (ConfigReader.readProperty("runInSaucelabs").equalsIgnoreCase("true")){
            driver = getRemoteDriver();
        }else {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    System.out.println("Invalid browser type");
            }
        }
        driver.manage().timeouts().implicitlyWait(SeleniumConstants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(SeleniumConstants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
    }

    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null;
        }
    }

    public static void quitDriver(){
        if (driver!=null)
            driver.quit();
        driver = null;
    }

    public static WebDriver getDriver(){
        if (driver != null)
            return driver;
        initialize(ConfigReader.readProperty("browser"));
        return driver;
    }

    public static WebDriver getRemoteDriver(){
        WebDriver driver = null;
        try{
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability("BrowserName","chrome");
            capabilities.setCapability("version", ConfigReader.readProperty("browser_version"));
            capabilities.setCapability("platform", ConfigReader.readProperty("os"));
            driver = new RemoteWebDriver(new URL(URL), capabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }


}
