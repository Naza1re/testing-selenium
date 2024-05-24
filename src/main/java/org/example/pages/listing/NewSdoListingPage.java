package org.example.pages.listing;

import org.example.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewSdoListingPage extends BasePage {
    public NewSdoListingPage(WebDriver driver) {
        super(driver);
    }

    By теорияИнформации = By.xpath("//*[@id=\"frontpage-course-list\"]/div/div[41]/div[1]/h3/a//*[@id=\"frontpage-course-list\"]/div/div[41]/div[1]/h3/a");


    public NewSdoListingPage openTуорияИнформации() {
        driver.findElement(теорияИнформации).click();

        return this;
    }
}
