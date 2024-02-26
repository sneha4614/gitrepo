package pageobjects;

import browsercontrol.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends WebConnector {

    //public WebDriver driver;
    private static String usernameXpath = "//input[@placeholder='Username']";
    private static String passwordXpath = "//input[@placeholder='Password']";
    private static String loginXpath = "//input[@type='submit']";


    public static void setUserName(String userName) {
        Basepage.findElementByXpath(10, usernameXpath).clear();
        Basepage.findElementByXpath(10, usernameXpath).sendKeys(userName);
    }

    public static void setPassWord(String passWord) {
        Basepage.findElementByXpath(10, passwordXpath).clear();
        Basepage.findElementByXpath(10, passwordXpath).sendKeys(passWord);
    }

    public  static void clickloginbutton() {
        Basepage.findElementByXpath(10, loginXpath).click();
    }



}
