package org.example.pages.newsdo;

import org.example.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewSdoHomePage extends BasePage {
    public NewSdoHomePage(WebDriver driver) {
        super(driver);
    }

    By inputLogin = By.xpath("//*[@id=\"username\"]");
    By inputPassword = By.xpath("//*[@id=\"password\"]");
    By enterButton = By.xpath("//*[@id=\"loginbtn\"]");

    public NewSdoHomePage enterCredentials(){
        driver.findElement(inputLogin).sendKeys("21010056");
        driver.findElement(inputPassword).sendKeys("qweasdzxc");
        return this;
    }

    public NewSdoHomePage clickEnterButton(){
        driver.findElement(enterButton).click();
        return this;
    }



}
