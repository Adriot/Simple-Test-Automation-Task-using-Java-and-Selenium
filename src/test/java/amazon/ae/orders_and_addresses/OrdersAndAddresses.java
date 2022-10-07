package amazon.ae.orders_and_addresses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersAndAddresses {
    @Given("A user Go to {string}")
    public void a_user_go_to(String string) {
        // TODO Write Site Opening Code
    }
    @When("Click on “Hello, sign in Account & Lists” at the top right corner")
    public void click_on_hello_sign_in_account_lists_at_the_top_right_corner() {
        // TODO Write “Hello, sign in Account & Lists” Code
    }
    @Then("Select “Your orders”")
    public void select_your_orders() {
        // TODO Write Select “Your orders” Code
    }
    @Then("Make sure user can’t see orders when not signed in")
    public void make_sure_user_can_t_see_orders_when_not_signed_in() {
        // TODO Write user can’t see orders when not signed in Code
    }
    @Then("Select “Your Addresses”")
    public void select_your_addresses() {
        // TODO Write Select “Your Addresses” Code
    }
    @Then("Select “Your Lists”")
    public void select_your_lists() {
        // TODO Write Select “Your Lists” Code
    }
    @Then("Make sure user can see the screen")
    public void make_sure_user_can_see_the_screen() {
        // TODO Write user can see the screen Code
    }
}
