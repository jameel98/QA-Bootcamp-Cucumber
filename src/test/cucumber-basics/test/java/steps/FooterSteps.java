package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverManager;

public class FooterSteps {
    private WebDriver driver;

    @When("On the footer - I click {string}")
    public void onTheFooterIClick(String footerItem) {
        WebElement webDriverLink = driver.findElement(By.linkText(footerItem));
        webDriverLink.click();
    }

    @Then("I’m on the ‘About Selenium’ page")
    public void iMOnTheAboutSeleniumPage() {
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.equals("https://www.selenium.dev/about/");
    }

    @After
    public void closeWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Then("I’m on the ‘Github’ page")
    public void iMOnTheGithubPage() {
    }
}
