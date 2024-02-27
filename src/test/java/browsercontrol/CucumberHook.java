package browsercontrol;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberHook extends WebConnector{
    @Before
    public void setup()
    {
        openBrowser();
    }
    @After
   public void teardown()
    {
       closeBrowser();
   }


}
