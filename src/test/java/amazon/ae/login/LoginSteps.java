package amazon.ae.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("A user Go to {string}")
    public void userGoTo(String siteUrl) {
        // TODO Write Site Opening Code
    }
    @When("A user logs in with valid but not registered email {string} and {string}")
    public void userLogsInWithValidButNotRegisteredEmail(String username, String password) {
        // TODO Write User Login Opening Code
    }
    @Then("Verify user can’t login")
    public void verifyUserCantLogin() {
        // TODO Write Login Verification Code Opening Code
    }
}
