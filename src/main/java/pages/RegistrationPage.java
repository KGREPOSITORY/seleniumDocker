package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    @FindBy(name = "phone")
    private  WebElement PHONE_NUMBER_FIELD;

    @FindBy(xpath = "//div[contains(@class, 'EnterLogin__button')]//button")
    private WebElement NEXT_BUTTON;

    public boolean isNextButtonDisabled(){
        return NEXT_BUTTON.isEnabled();
    }

}
