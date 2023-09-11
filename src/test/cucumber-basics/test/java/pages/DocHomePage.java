package pages;

import components.NavBar;
import components.SideMenu;
import org.openqa.selenium.WebDriver;

public class DocHomePage extends BasePage {
    private SideMenu sideMenu;
    private NavBar navBar;

    public DocHomePage(WebDriver webDriver){
        super(webDriver);
        sideMenu = new SideMenu(driver);
        navBar = new NavBar(driver);
    }

    public SideMenu getSideMenu() {
        return sideMenu;
    }

    public NavBar getNavBar() {
        return navBar;
    }


}
