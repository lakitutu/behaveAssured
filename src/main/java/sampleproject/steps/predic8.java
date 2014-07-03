package sampleproject.steps;
import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import com.jayway.restassured.specification.RequestSpecification;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.jbehave.core.annotations.*;

/**
 * Created by Robale on 2014-05-24.
 */
public class Predic8 {
    Configuration config;

    {
        try {
            config = new PropertiesConfiguration("configuration.properties");
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }

    String url = config.getString("url");
    RequestSpecification requestSpecification;

    @Given("A name of client is $name")
    public void specifyClientName(String name) {
        requestSpecification = given().param("name",name);
    }

    @When("the element $element is searched for")
    public void searchForElement(String element) {
    }

    @Then("the resulting element should be $result")
    public void theResultingElementShouldBe(String result) {
    }
}
/*
By default REST assured assumes host localhost and port 8080 when doing a request. If you want a different port you can do:
 given().port(80). ..

or simply:
 .. when().get("http://myhost.org:80/doSomething");
 */