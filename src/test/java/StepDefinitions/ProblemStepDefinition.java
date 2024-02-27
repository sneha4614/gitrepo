package StepDefinitions;

import browsercontrol.WebConnector;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageobjects.Loginpage;


public class ProblemStepDefinition extends WebConnector {


    @When("the user login with {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username, String password) throws InterruptedException{
        Loginpage.setUserName(username);
        Loginpage.setPassWord(password);
        Loginpage.clickloginbutton();
        Thread.sleep(3000);


    }
    @Then("the user should see {string} text on page")
    public void the_user_should_see_text_on_page(String expectedtext) {
        Assert.assertTrue(driver.getPageSource().contains(expectedtext));

    }

}
