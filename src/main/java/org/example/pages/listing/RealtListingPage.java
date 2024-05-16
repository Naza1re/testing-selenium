package org.example.pages.listing;

import org.example.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//*[starts-with(@aria-label, 'Ссылка на объект')]");

    public RealtListingPage checkCountCards() {
        waitElementIsVisible(driver.findElement(card));
        int countCards = driver.findElements(card).size();
        Assert.assertEquals(countCards, 9);
        return this;
    }
}
