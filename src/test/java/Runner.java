import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
              tags = "@test001",
              plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
              publish = true,
              stepNotifications = true
)
public class Runner {
}
