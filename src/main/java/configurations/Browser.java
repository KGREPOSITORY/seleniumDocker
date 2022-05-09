package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Browser {
    private static WebDriver webDriver;
    private static final List<String> options = new LinkedList<>(
            Arrays.asList("--ignore-ssl-errors=yes",
                    "--no-sandbox",
                    "--disable-dev-shm-usage",
                    "--ignore-certificate-errors"));

    private static AbstractDriverOptions<?> getOptions(){
        AbstractDriverOptions<?> result = null;
        switch (System.getProperty("BROWSER")){
            case ("FIREFOX"):
                result = new FirefoxOptions().addArguments(options);
                break;
            case ("CHROME"):
                result = new ChromeOptions().addArguments(options);
                break;
            case ("EDGE"):
                result = new EdgeOptions().addArguments(options);
                break;
        }
        return result;
    }

    public static WebDriver getWebDriver(){
        if (webDriver == null) {
            try {
                webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                        getOptions());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            webDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
        }
        return webDriver;
    }

    public static void goToUrl(String url){
        getWebDriver().get(url);
    }


}
