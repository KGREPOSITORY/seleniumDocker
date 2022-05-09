package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    private final WebElement REGISTRATION_BUTTON = findElement(By.xpath("//button[contains(@class,'positive')]/span"));

    public MainPage clickRegistrationButton(){
        REGISTRATION_BUTTON.click();
        return this;
    }


}
