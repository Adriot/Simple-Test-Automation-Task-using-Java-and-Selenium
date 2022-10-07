package amazon.ae;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/cart.feature"},
        glue = {"amazon.ae.cart"}
)
public class CartRunner {
}
