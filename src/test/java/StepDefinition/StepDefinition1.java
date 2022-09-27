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
    public void user_is_on_Login_Page() throws IOException, InterruptedException {
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

    @Given("User click on Admin Page")
    public void user_click_on_Admin_Page() throws IOException, InterruptedException {

        pageFactory.getAdminDetail().admin();
    }

    @Then("Then click om Add And Fill user details")
    public void user_click_on_Add_Button_fill_user_details() throws IOException, InterruptedException {

        pageFactory.getAdminDetail().select();
    }

}
