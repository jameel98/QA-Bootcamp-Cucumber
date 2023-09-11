package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Footer extends BasePage {

    //locators
    private final By ABOUT = By.xpath("//p//a//span[text() = 'About Selenium']");
    private final By FACEBOOK = By.xpath("//li//a//span[text() = 'Selenium in Facebook']");
    private final By GITHUB = By.xpath("//li//a//span[text() = 'GitHub']");
    private final By SLACK = By.xpath("//li//a//span[text() = 'Slack']");

    //web elements
    private WebElement about;
    private WebElement facebook;
    private WebElement github;
    private WebElement slack;
    public Footer(WebDriver driver) {
        super(driver);
    }

    private void initComponent() {
        about = waitForElement(ABOUT);
        facebook= waitForElement(FACEBOOK);
        github = waitForElement(GITHUB);
        slack = waitForElement(SLACK);
    }

    public void clickOnAbout(){
        about.click();
    }
    public void clickOnFacebook(){
        facebook.click();
    }
    public void clickOnGithub(){
        github.click();
    }
    public void clickOnSlack(){
        slack.click();
    }


}
