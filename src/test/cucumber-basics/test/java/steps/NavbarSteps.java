package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverManager;

public class NavbarSteps {
    private WebDriver driver;



    @When("On the navbar - I click {string}")
    public void onTheNavbarIClick(String navbarItem) {
        WebElement webDriverLink = driver.findElement(By.linkText(navbarItem));
        webDriverLink.click();
    }

    @Then("I’m on the ‘Projects’ page")
    public void iMOnTheProjectsPage() {
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.equals("https://www.selenium.dev/projects/");
    }


    @After
    public void closeWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
