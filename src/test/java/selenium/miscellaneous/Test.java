package selenium.miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.commons.DriverInit;

public class Test extends DriverInit {

    public static void main(String[] args) {

        DriverInit.setDriver();
        DriverInit.driverInit("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement username = driver.findElement(By.id("identifierId"));
        username.sendKeys("Vedika");
    }
}