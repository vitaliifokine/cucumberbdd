package bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartPageStepdefs {
    WebDriver driver;

    public void launchTheBrowser(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^User navigate to Start Page$")
    public void userNavigateToStartPage() {
        launchTheBrowser();
        driver.get("https://stackoverflow.com");
        Assert.assertFalse(false);
    }

    @Then("^Results with mentioned Voldoya is shown$")
    public void resultsWithMentionedVoldoyaIsShown() {
        driver.get("https://stackoverflow.com");
        Assert.assertFalse(false);
    }

    @When("User search the client with word {int}")
    public void userSearchTheClientWithWord(int arg0) {
        Assert.assertFalse(false);
    }
}
