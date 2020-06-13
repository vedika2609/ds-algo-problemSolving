package selenium.commons;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;

public class SeleniumBaseTest extends DriverInit {

    @Setter
    @Getter
    private static SoftAssert softAssert;

    protected void launchUrl(String url) {
        driverInit(url);
    }

    protected void executeJsScript(JsCommands command, String attribures) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ThreadLocal<JavascriptExecutor> localJs = new ThreadLocal<>();
        localJs.set((JavascriptExecutor) driver);
        switch (command) {
            case SCROLL:
                localJs.get().executeScript("window.scrollBy(0,800)", "");
                return;
            case CLICK:
                String cssSelector = attribures.replaceAll("\"", "'");
                localJs.get().executeScript("document.querySelector(\"" + cssSelector + "\").click()");
            default:
                localJs.get().executeScript(attribures);
        }
    }

    protected String getAlertMessage() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    protected String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    protected void softAssert(Object actualValue, Object expectedValue, String message) {
        softAssert.assertEquals(actualValue, expectedValue, "\n" + message + " expected: " + expectedValue + "; actualValue: " + actualValue + "\n");
    }

    protected void softAssertTrue(Object actualValue, String message) {
        softAssert.assertTrue(Boolean.parseBoolean(actualValue.toString()), "\n" + message + "\n");
    }
}
