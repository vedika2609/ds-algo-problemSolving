package selenium.busonline.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.commons.SeleniumBaseTest;

import java.util.List;

public class Homepage extends SeleniumBaseTest {

    @FindBy(css = "#ContentPlaceHolder1_txtDepartDate")
    protected WebElement departureDate;

    @FindBy(css = "span.input-group-addon.spndd")
    protected WebElement departureDatePicker;

    @FindBy(css = "input#txtOrigin")
    protected WebElement startPoint;

    @FindBy(css = "input#txtOrigin+div")
    protected WebElement startPointSuggestions;

    @FindBy(css = "input#txtDestination")
    protected WebElement destinationPoint;

    @FindBy(css = "input#txtDestination+div")
    protected WebElement destinationPointSuggestions;

    @FindBy(css = "input#btnBusSearchNew")
    protected WebElement bookNow;


    protected WebElement getDesiredDate(String text) {
        List<WebElement> dates = driver.findElements(By.cssSelector("a.ui-state-default.ui-state-active"));
        for (WebElement element : dates) {
            if (element.getText().equals(text))
                return element;
        }
        return null;
    }

    protected WebElement setCity(String city, String cityType) {
        String type;
        if (cityType.toUpperCase().contains("DESTINATION"))
            type = "Destination";
        else if (cityType.toUpperCase().contains("ORIGIN"))
            type = "Origin";
        else
            throw new IllegalArgumentException("Invalid city type");

        String css = "input#txt" + type + "+div li ul";

        List<WebElement> cities = driver.findElements(By.cssSelector(css));
        for (WebElement element : cities) {
            if (element.getText().equals(city))
                return element;
        }
        return null;
    }
}