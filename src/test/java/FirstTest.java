import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;

public class FirstTest extends BaseTest{

    @Test
    public void someSimpleTest(){
        new MainPage().clickRegistrationButton();
        assertFalse(new RegistrationPage().isNextButtonDisabled(),
                "Assert that continue button is disabled");
    }
}
