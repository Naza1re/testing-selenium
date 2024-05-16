package tests.base;

import org.example.common.CommonAction;
import org.example.pages.base.BasePage;
import org.example.pages.listing.RealtListingPage;
import org.example.pages.realthome.RealtHomePage;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver driver = CommonAction.getDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);

}
