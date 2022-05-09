import configurations.Browser;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest  extends Assert {


    @BeforeTest
    public void beforeActions(){
        Browser.goToUrl("https://vk.com/");
    }

    @AfterTest
    public void afterActions(){
        Browser.getWebDriver().quit();
    }
}
