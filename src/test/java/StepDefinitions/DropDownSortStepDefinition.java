package StepDefinitions;

import browsercontrol.WebConnector;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Dropdownpage;
import pageobjects.Loginpage;

public class DropDownSortStepDefinition  extends WebConnector
{
    private Dropdownpage dropdown= new Dropdownpage();
    @And("the user should see {int} options in the sort dropdown")
    public void theUserShouldSeeOptionsInTheSortDropdown(int arg0) {
    }
    @When("the user logins with {string} username and  {string} password")
    public void the_user_logins_with_username_and_password(String username, String password) throws InterruptedException
    {
        Loginpage.setUserName(username);
        Loginpage.setPassWord(password);
        Loginpage.clickloginbutton();
        Thread.sleep(2000);

    }
    @When("the user select {string} option from the dropdownsort list")
    public void the_user_select_option_from_the_dropdownsort_list(String dropdownoption) throws InterruptedException {
        dropdown.selectoptionfromdropdown(dropdownoption);
        Thread.sleep(2000);
    }
    @Then("the user should see {string} option is selected in dropdownsort list")
    public void the_user_should_see_option_is_selected_in_dropdownsort_list(String selectdropdown) throws InterruptedException
    {
     dropdown.CheckSelectedOptions(selectdropdown);
     Thread.sleep(3000);
    }

}
