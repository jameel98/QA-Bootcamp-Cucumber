package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class NavBar extends BasePage {

    // Locators
    private final By DOWNLOADS_LINK = By.xpath("//li//a//span[text() = 'Downloads']");
    private final By DOCUMENTATION_LINK = By.xpath("//li//a//span[text() = 'Documentation']");
    private final By PROJECTS_LINK = By.xpath("//li//a//span[text() = 'Projects']");
    private final By SUPPORT_LINK = By.xpath("//li//a//span[text() = 'Support']");
    private final By BLOG_LINK = By.xpath("//li//a//span[text() = 'Blog']");

    // Web Elements
    private WebElement downloadsLink;
    private WebElement documentationLink;
    private WebElement projectsLink;
    private WebElement supportLink;
    private WebElement blogLink;

    public NavBar(WebDriver driver) {
        super(driver);
        initializeComponents();
    }

    private void initializeComponents() {
        downloadsLink = waitForElement(DOWNLOADS_LINK);
        documentationLink = waitForElement(DOCUMENTATION_LINK);
        projectsLink = waitForElement(PROJECTS_LINK);
        supportLink = waitForElement(SUPPORT_LINK);
        blogLink = waitForElement(BLOG_LINK);
    }

    public void clickDownloadsLink() {
        downloadsLink.click();
    }

    public void clickDocumentationLink() {
        documentationLink.click();
    }

    public void clickProjectsLink() {
        projectsLink.click();
    }

    public void clickSupportLink() {
        supportLink.click();
    }

    public void clickBlogLink() {
        blogLink.click();
    }
}
