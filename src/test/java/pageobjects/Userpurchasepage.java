package pageobjects;

import browsercontrol.WebConnector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class Userpurchasepage extends WebConnector {
private String productnameXpath= "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div";

private String AddToCartXpath = "//button[@id='add-to-cart-sauce-labs-backpack']";
private String ShoppingCartXpath = "//div[@id='shopping_cart_container']";


public void userselectsproduct(String ProductName){
    Basepage.findElementByXpath(10,productnameXpath);

}
public void AddProduct(String addedcartitem){
    Basepage.findElementByXpath(10,AddToCartXpath).click();

}
public void ShoppingCart(String basket){
    Basepage.findElementByXpath(10,ShoppingCartXpath).click();
}
}
