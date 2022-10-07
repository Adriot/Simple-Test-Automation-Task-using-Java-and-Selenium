package amazon.ae;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/orders_and_addresses.feature"},
        glue = {"amazon.ae.orders_and_addresses"}
)
public class OrdersAndAddressesRunner {
}
