package pageobjects;

import browsercontrol.WebConnector;

public class Purchaseproductpage extends WebConnector {

    private String ClickCartXpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]";
    private String ClickCheckoutXpath = "//button[@class='btn btn_action btn_medium checkout_button ']";
    private String FirstNameXpath = "//*[@id=\"first-name\"]";
    private String LastNameXpath = "//*[@id=\"last-name\"]";
    private String PostCodeXpath = "//*[@id=\"postal-code\"]";
    private String ClickContinueXpath = "//*[@id=\"continue\"]";
    private String ClickFinishXpath = "//*[@id=\"finish\"]";

    public void ClickCartButton() {
        Basepage.findElementByXpath(10, ClickCartXpath).click();}

    public void CheckoutButton() {
        Basepage.findElementByXpath(10,ClickCheckoutXpath).click();}

    public void PersonalInfo(String FN, String LN, String PC) {
        Basepage.findElementByXpath(10, FirstNameXpath).sendKeys(FN);
        Basepage.findElementByXpath(10, LastNameXpath).sendKeys(LN);
        Basepage.findElementByXpath(10, PostCodeXpath).sendKeys(PC);
        Basepage.findElementByXpath(10, ClickContinueXpath).click();
    }
    public void Finish() {
        Basepage.findElementByXpath(10, ClickFinishXpath).click();
    }
}
