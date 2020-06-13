package selenium.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverInit {

    public static WebDriver driver = null;

    public static WebDriver getDriver() {
        return driver;
    }


    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static void driverInit(String baseUrl) {
        setDriver();
        driver.get(baseUrl);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void driverClose() {
        driver.close();
    }
}
