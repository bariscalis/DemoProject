package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-csa-c-content-id='nav_cs_bestsellers']")
    public WebElement bestSeller;

    @FindBy(xpath = "//ul[@id='zg_browseRoot']//ul//li")
    public List<WebElement> houseHold;

}
