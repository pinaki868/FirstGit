package main;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.*;

import java.net.MalformedURLException;
import java.net.URL;

public class DesiredCap {
    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.acceptInsecureCerts();
        dc.setBrowserName(BrowserType.CHROME);
        dc.setVersion("");
        dc.setAcceptInsecureCerts(true);
        dc.setPlatform(Platform.WINDOWS);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("");
        options.merge(dc);

        String URL = "/localhost/port/wd/grid";
        WebDriver driver = new RemoteWebDriver(new URL(URL),options);

    }
}
