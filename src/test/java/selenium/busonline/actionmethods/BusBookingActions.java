package selenium.busonline.actionmethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import selenium.busonline.objectrepository.PaymentSecurePage;
import selenium.busonline.objectrepository.UserDetailsKey;
import selenium.commons.JsCommands;
import selenium.commons.SeleniumBaseTest;

public class BusBookingActions extends PaymentSecurePage {

    public BusBookingActions() {
        PageFactory.initElements(SeleniumBaseTest.driver, this);
    }

    public void setDepartureDateAction(String date, String day) {
        departureDate.click();
        departureDate.clear();
        departureDate.sendKeys(date);
        if (!departureDatePicker.isDisplayed())
            departureDatePicker.click();
        softAssert(departureDatePicker.isDisplayed(), true, "Couldn't find date calendar");
        getDesiredDate(day).click();
        softAssert(departureDatePicker.isDisplayed(), false, "Date calendar should be closed");
    }

    public void selectOriginCityAction(String city) {
        startPoint.click();
        softAssert(startPointSuggestions.isDisplayed(), true, "Start Point suggestions not loaded");
        startPoint.sendKeys(city);
        softAssert(startPointSuggestions.isDisplayed(), true, "Start Point suggestions not loaded");
        setCity(city, "ORIGIN").click();
        softAssert(startPointSuggestions.isDisplayed(), false, "Start Point suggestions should be closed");
    }

    public void selectDestinationCityAction(String city) {
        destinationPoint.click();
        softAssert(destinationPointSuggestions.isDisplayed(), true, "Destination Point suggestions not loaded");
        destinationPoint.sendKeys(city);
        softAssert(destinationPointSuggestions.isDisplayed(), true, "Destination Point suggestions not loaded");
        setCity(city, "DESTINATION").click();
        softAssert(destinationPointSuggestions.isDisplayed(), false, "Destination Point suggestions should be closed");
    }

    public void bookNowAction(String originCity, String destinationCity) {
        bookNow.click();
        String expectedURI = "booking/" + (originCity + " to " + destinationCity).replaceAll(" ", "-");
        boolean selectBusPage = getCurrentUrl().contains(expectedURI);
        softAssert(selectBusPage, true, "Couldn't navigate to select bus page");
    }

    public void selectCheapestBusAndProceedAction(int maxSeats) {
        selectLowestPriceBus().click();
        softAssert(seatSelectionPane.isDisplayed(), true, "Couldn't select the bus");
        for (WebElement element : getAvailableSeats(maxSeats)) {
            element.click();
        }
        softAssertTrue(getSelectedSeats().size() - 1 > 0, "Couldn't select any seats");
        System.out.println("Selected " + (getSelectedSeats().size() - 1) + " seats");
        softAssert(seatProceedButton.isDisplayed(), true, "Proceed button not found");
    }

    public void enterUserNameAction(String firstName) {
        softAssert(enterUserDetails(UserDetailsKey.FULL_NAME, true).isDisplayed(), true, "Couldn't find fullname header");
        enterUserDetails(UserDetailsKey.FULL_NAME, false).sendKeys(firstName);
    }

    public void enterMobileNoAction(String mobileNo) {
        enterUserDetails(UserDetailsKey.MOBILE_NO, false).sendKeys(mobileNo);
    }

    public void enterEmailAction(String email) {
        enterUserDetails(UserDetailsKey.EMAIL, false).sendKeys(email);
    }

    public void reEnterEmailAction(String emailId) {
        enterUserDetails(UserDetailsKey.RE_ENTER_EMAIL, false).sendKeys(emailId);
    }

    public String clickProceedToPayment() {
        executeJsScript(JsCommands.SCROLL, "");
        proceedToPaymentButton.click();
        return getAlertMessage();
    }
}
