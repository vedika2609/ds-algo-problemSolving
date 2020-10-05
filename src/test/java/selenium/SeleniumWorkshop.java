package selenium;


/*
 * Created by : vedikagupta
 * Date : 10/09/20
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumWorkshop {
    @Test
    public void simpleRemoteChromeTest() throws MalformedURLException, InterruptedException {
        /* RemoteWebDriver */
        URL gridUrl = new URL("http://localhost:4444");
        //FirefoxOptions options = new FirefoxOptions();
        //ChromeOptions options = new ChromeOptions();
        OperaOptions options = new OperaOptions();

        RemoteWebDriver webDriver = new RemoteWebDriver(gridUrl, options);
        /* RemoteWebDriver */
        for (int i = 0; i < 3; i++) {
            webDriver.get("http://www.google.com/ncr");
            webDriver.findElement(By.name("q")).sendKeys("webdriver", Keys.RETURN);
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, 5);
            webDriverWait.until(ExpectedConditions.titleContains("webdriver"));
            Thread.sleep(5000);
        }
        webDriver.quit();
    }
}