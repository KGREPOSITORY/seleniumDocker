package configurations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Browser {
    private static WebDriver webDriver;

    private static void initDriver(){
        switch (System.getProperty("BROWSER")){
            case ("FIREFOX"):
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;
            case ("CHROME"):
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
            case ("EDGE"):
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
                break;
        }
    }

    public static WebDriver getWebDriver(){
        if (webDriver == null) {
            initDriver();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        }
        return webDriver;
    }

    public static void goToUrl(String url){
        getWebDriver().get(url);
    }


}
