package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static configurations.Browser.getWebDriver;


public abstract class BasePage {
    private static final int DURATION = 3;

    protected static WebElement findElement(By by){
        return new WebDriverWait(getWebDriver(), Duration.ofMinutes(DURATION))
                .until(webDriver -> webDriver.findElement(by));
    }

    protected boolean isElementVisible(By by){
        return new WebDriverWait(getWebDriver(), Duration.ofMinutes(DURATION))
                .until(webDriver -> webDriver.findElement(by).isDisplayed());
    }

    protected boolean isElementVisible(WebElement webElement){
        return new WebDriverWait(getWebDriver(), Duration.ofMinutes(DURATION))
                .until(webDriver -> webElement.isDisplayed());
    }

}
