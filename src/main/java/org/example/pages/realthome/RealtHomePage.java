package org.example.pages.realthome;

import org.example.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RealtHomePage extends BasePage {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    By countRooms = By.xpath("//span[text()='Кол-во комнат']");
    By optionTwoRooms = By.xpath("//*[contains(text(),'2к квартира')]");
    By findButton = By.xpath("//a[@type='link'][2]/span/span");
    By refuseAlert = By.xpath("//span[text()='Отклонить']");
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
