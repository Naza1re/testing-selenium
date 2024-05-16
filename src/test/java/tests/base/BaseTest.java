package tests.base;

import org.example.common.CommonAction;
import org.example.pages.base.BasePage;
import org.example.pages.listing.NewSdoListingPage;
import org.example.pages.listing.RealtListingPage;
import org.example.pages.newsdo.NewSdoHomePage;
import org.example.pages.realthome.RealtHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.getDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);
    protected NewSdoHomePage newSdoHomePage = new NewSdoHomePage(driver);
    protected NewSdoListingPage newSdoListingPage = new NewSdoListingPage(driver);


    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    protected void switchWindow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String window1 = driver.getWindowHandle();

        js.executeScript("window.open()");

        Set<String> handles = driver.getWindowHandles();
        String window2 = null;
        for (String handle : handles) {
            if (!window1.equals(handle)) {
                window2 = handle;
                break;
            }
        }

        driver.switchTo().window(window2);

    }




}
