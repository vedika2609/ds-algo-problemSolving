package cucumber.facebooklogin;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import helpers.DriverInit;
import org.openqa.selenium.By;

public class FacebookLogin {

    @Given("^I am on FB login page$")

    public void gotoFacebook() {
        DriverInit.setDriver();
        DriverInit.driverInit("https://www.facebook.com");
    }

    @When("^I enter username as\"(.*)\"$")
    public void enterUsername(String arg1) {
        DriverInit.getDriver().findElement(By.id("email")).sendKeys(arg1);
    }

    @When("^I enter password as\"(.*)\"$")
    public void enterPassword(String arg1) {
        DriverInit.getDriver().findElement(By.id("pass")).sendKeys(arg1);
        DriverInit.getDriver().findElement(By.id("u_0_v")).click();
    }

    @Then("^Login should fail$")
    public void checkFail() {
        if (DriverInit.driver.getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
            System.out.println("Test1 Pass");
        } else {
            System.out.println("Test1 Failed");
        }
        DriverInit.driverClose();
    }

    @Then("^Relogin option should be available$")
    public void checkRelogin() {
        if (DriverInit.getDriver().getCurrentUrl().equalsIgnoreCase(
                "https://www.facebook.com/login.php?login_attempt=1&lwv=110")) {
            System.out.println("Test2 Pass");
        } else {
            System.out.println("Test2 Failed");
        }
        DriverInit.driverClose();
    }
} 