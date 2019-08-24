package bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartPageStepdefs {
    WebDriver driver;

    @Given("^User navigate to Start Page$")
    public void userNavigateToStartPage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @Then("^Results with mentioned Voldoya is shown$")
    public void resultsWithMentionedVoldoyaIsShown() {
    }

    @When("User search the client with word {int}")
    public void userSearchTheClientWithWord(int arg0) {

    }
}
