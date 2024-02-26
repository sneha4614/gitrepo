package StepDefinitions;

import browsercontrol.WebConnector;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pageobjects.Purchaseproductpage;

public class PurchaseProductStepDefinition extends WebConnector {
    private Purchaseproductpage purchase  = new Purchaseproductpage();
    @When("the user clicks on the Add to cart button")
    public void the_user_clicks_on_the_add_to_cart_button() {
        purchase.ClickCartButton();
    }
    @Then("the user proceeds to the checkout")
    public void the_user_proceeds_to_the_checkout() {
        purchase.CheckoutButton();
    }

        @When("the user enters {string} first name, {string} last name and {string} postcode")
    public void the_user_enters_first_name_last_name_and_postcode(String Firstname, String Lastname, String Postcode) throws InterruptedException
        {
     purchase.PersonalInfo(Firstname,Lastname,Postcode);
     Thread.sleep(2000);
    }
    @When("the user click on the {string} button")
    public void the_user_click_on_the_button(String Fin) throws InterruptedException {
        purchase.Finish();

    }

}
