package browsercontrol;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import utilities.ConstantUtils;


import java.util.concurrent.TimeUnit;

public class WebConnector {
    public static WebDriver driver;

    public static void openBrowser() {
        if (ConstantUtils.BROWSER_NAME.equalsIgnoreCase("firefox")) {
            FirefoxOptions fo = new FirefoxOptions();
            fo.addArguments("start-maximized");
            driver = new FirefoxDriver(fo);
            //System.setProperty(WebDriver.Firefox,)
            if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                fo.addArguments("--headless");
            }
        } else {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("start-maximized");
            driver = new ChromeDriver(co);
            if (ConstantUtils.BROWSER_TYPE.equalsIgnoreCase("headless")) {
                co.addArguments("--headless");
            }
            //If using implicit wait
            // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }
    }
    public static void closeBrowser(){
        driver.quit();
    }
}

