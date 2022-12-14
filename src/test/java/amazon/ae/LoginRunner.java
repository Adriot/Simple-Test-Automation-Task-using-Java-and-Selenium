package amazon.ae;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/login.feature"},
        glue = {"amazon.ae.login"}
)
public class LoginRunner {
}
