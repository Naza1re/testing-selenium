package org.example.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.example.common.Config.PLATFORM_AND_BROWSER;

public class CommonAction {
    private static WebDriver driver = null;

    private CommonAction() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();

                default:
                    System.out.println("Failed to find chrome driver");
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.of(10, TimeUnit.SECONDS.toChronoUnit()));


        }
        return driver;
    }
}
