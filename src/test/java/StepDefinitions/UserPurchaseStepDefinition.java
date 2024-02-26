package StepDefinitions;

import browsercontrol.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Userpurchasepage;

public class UserPurchaseStepDefinition extends WebConnector {
    private Userpurchasepage Products=new Userpurchasepage();
    @When("the user select the product {string} from the inventory")
    public void the_user_selects_the_product_from_the_inventory(String ProductName) throws InterruptedException{
    Products.userselectsproduct(ProductName);
    Thread.sleep(3000);
    }
    @When("the user click on {string} button")
    public void the_user_click_on_button(String addedcartitem)throws InterruptedException
    {
   Products.AddProduct(addedcartitem);
   Thread.sleep(3000);
    }
    @When("the user select {string} on the page")
    public void the_user_select_on_the_page(String basket)throws InterruptedException {
    Products.ShoppingCart(basket);
    Thread.sleep(3000);
    }



}