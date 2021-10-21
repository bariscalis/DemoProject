package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.MainPage;
import utilities.Driver;

public class MainPage_StepDefinitions {
    MainPage mainPage = new MainPage();

    @Given("user go to main page {string}")
    public void user_go_to_main_page(String url) {
        Driver.getDriver().get(url);
        mainPage.bestSeller.click();
        Assert.assertTrue(mainPage.houseHold.stream().anyMatch(element -> element.getText().contains("Baumarkt")));
    }
}
