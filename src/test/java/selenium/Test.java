package selenium;
import org.openqa.selenium.WebElement;

import helpers.DriverInit;
import helpers.ElementFinder;

public class Test extends DriverInit{

	public static void main(String[] args) {

		ElementFinder locator = new ElementFinder();
		DriverInit.setDriver();
		DriverInit.driverInit("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebElement username = DriverInit.getDriver().findElement( locator.getByType("id", "identifierId"));
		username.sendKeys("Vedika");
	}
}