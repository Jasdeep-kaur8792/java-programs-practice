package StepDefinition;
import BaseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.net.MalformedURLException;
public class StepDefinition1  extends BaseClass {


    @Given("User is on Login Page")
    public void user_is_on_Login_Page() throws MalformedURLException, InterruptedException {
        setup();
    }
    @When("^user Enter the Username in \"([^\"]*)\" and enter the password \"([^\"]*)\"$")
    public void user_Enter_on(String userName, String password) throws IOException, InterruptedException {

        pageFactory.getLogInPage().logInUserName(userName,password);
    }

    @Then("should click on Login button")
    public void user_will_click_on_submit() throws InterruptedException {

        pageFactory.getLogInPage().logInSubmitButton();
    }
}