package org.example.pages.realthome;

import org.example.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RealtHomePage extends BasePage {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/main/div/div/div/div[4]/div/div[2]/form/div/div[1]/div[2]/div/div/span[1]");
    By optionTwoRooms = By.xpath("//*[contains(text(),'2к квартира')]");
    By findButton = By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/main/div/div/div/div[4]/div/div[2]/form/div/div[2]/div/a[2]");
    By refuseAlert = By.xpath("//*[@id=\"gdpr-portal-root\"]/div/div/div/button[1]");
    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(optionTwoRooms).click();
        return this;
    }

    public RealtHomePage closeAlert() {
        driver.findElement(refuseAlert).click();
        return this;
    }

    public RealtHomePage clickToFind(){
        driver.findElement(findButton).click();
        return this;
    }
}
