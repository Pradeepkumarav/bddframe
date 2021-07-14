package addproductstestrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = ".//features/products.feature",
 //junit= "---step-notification",
 glue={"com.addproducts"}
 )

public class Addproductstestrunner {

}
