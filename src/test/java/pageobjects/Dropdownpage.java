package pageobjects;

import browsercontrol.WebConnector;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpage extends WebConnector {

    private String dropdownXpath= "//select[@class='product_sort_container']";
    private String selectionXpath="//*[@id=\"header_container\"]/div[2]/div/span/span";

    public void selectoptionfromdropdown(String option)
    {
        WebElement dropdown=Basepage.findElementByXpath(10,dropdownXpath);
        Select select= new Select(dropdown);
        select.selectByVisibleText(option);
    }

    public void  CheckSelectedOptions(String expectedoption)
    {
        String actualOption= Basepage.findElementByXpath(10,selectionXpath).getText();
        Assert.assertEquals(expectedoption,actualOption);

    }

}
