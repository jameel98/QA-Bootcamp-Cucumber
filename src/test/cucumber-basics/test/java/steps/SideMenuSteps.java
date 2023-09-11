package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverManager;

public class SideMenuSteps {
        private WebDriver driver;

        @Given("I’m on the Selenium documentation site")
        public void i_m_on_the_selenium_documentation_site() {
                System.setProperty("webdriver.chrome.driver", DriverManager.getDriverPath());
                driver = new ChromeDriver();
                driver.get("https://www.selenium.dev/documentation/");
        }
        @When("On the sidebar - I click {string}")
        public void on_the_sidebar_i_click(String sideMenuItem) {
                WebElement webDriverLink = driver.findElement(By.linkText(sideMenuItem));
                webDriverLink.click();
        }
        @Then("I’m on the ‘WebDriver’ documentation page")
        public void i_m_on_the_web_driver_documentation_page() {
                String currentUrl = driver.getCurrentUrl();
                assert currentUrl.equals("https://www.selenium.dev/documentation/webdriver/");
        }

        @After
        public void closeWebDriver() {
                if (driver != null) {
                        driver.quit();
                }
        }

        @Then("I’m on the ‘Grid’ page")
        public void iMOnTheGridPage() {
        }
}