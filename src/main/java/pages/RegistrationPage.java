package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage{
    private final WebElement PHONE_NUMBER_FIELD = findElement(By.xpath("//input[@name='phone']"));
    private final WebElement NEXT_BUTTON = findElement(By.xpath("//div[contains(@class, 'EnterLogin__button')]//button"));

    public boolean isNextButtonDisabled(){
        return NEXT_BUTTON.isEnabled();
    }

}
