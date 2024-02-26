package StepDefinitions;

import browsercontrol.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.Loginpage;
import utilities.ConstantUtils;


import java.time.Duration;


public class StepDefinitions extends WebConnector {
    private final Loginpage login = new Loginpage();
    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String URL) throws InterruptedException {
        driver.get(ConstantUtils.BASE_URL);
        Thread.sleep(2000);
    }
    
    @When("the user follows{string} link")
    public void the_user_follows_link(String linkTest){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.linkText(linkTest))).click();
    }
    @When("the user enters {string} in username field")
    public void the_user_enter_in_username_field(String userName) throws InterruptedException {
        Loginpage.setUserName(userName);
        Thread.sleep(2000);
    }
    @When("the user enters {string} in password field")
    public void the_user_enter_in_password_field(String passWord) {
        Loginpage.setPassWord(passWord);
    }
    @And("the user clicks login button")
    public void the_user_clicks_login_button() throws InterruptedException {
        Loginpage.clickloginbutton();
        Thread.sleep(2000);
    }

    @When("the user enters {string} username and {string} password")
    public void the_user_login_with_username_and_password(String username ,String password) throws InterruptedException
    {
        Loginpage.setUserName(username);
        Loginpage.setPassWord(password);
        Loginpage.clickloginbutton();
        Thread.sleep(2000);

    }
    @Then("the user should see {string} text on the page")
    public void the_user_should_see_text_on_the_page(String expectedText) {
        Assert.assertTrue(driver.getPageSource().contains(expectedText));
        //Assert.assertFalse(driver.getPageSource().contains(expectedText));

    }


}