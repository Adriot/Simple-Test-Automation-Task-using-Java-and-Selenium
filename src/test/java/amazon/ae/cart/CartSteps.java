package amazon.ae.cart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
    @Given("A user Go to {string}")
    public void a_user_go_to(String string) {
        // TODO Write Site Opening Code
    }
    @When("Go to Today’s Deals")
    public void go_to_today_s_deals() {
        // TODO Write Today's Deals Code
    }
    @Then("Click on 2nd category")
    public void click_on_2nd_category() {
        // TODO Write 2nd Category Code
    }
    @Then("Click on 1st item in this category")
    public void click_on_1st_item_in_this_category() {
        // TODO Write 1st Item In The Category Code
    }
    @Then("Add it to cart with Qty = {int}")
    public void add_it_to_cart_with_qty(Integer quantity) {
        // TODO Write Add Item With Quantity = 3 Code
    }
    @Then("Go to cart")
    public void go_to_cart() {
        // TODO Write Go To Cart Code
    }
    @Then("Verify correct items are added \\(name, price, qty and subtotal is correct)")
    public void verify_correct_items_are_added_name_price_qty_and_subtotal_is_correct() {
        // TODO Write Correct Items Verification Code
    }
}
