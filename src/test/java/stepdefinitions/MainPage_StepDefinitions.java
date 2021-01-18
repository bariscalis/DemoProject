package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class MainPage_StepDefinitions {

    @Given("user go to main page {string}")
    public void user_go_to_main_page(String url) {
        Driver.getDriver().get(url);
    }
}
