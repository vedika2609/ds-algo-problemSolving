package selenium.busonline.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.busonline.actionmethods.BusBookingActions;

public class PaymentAlertTest extends BaseBusOnlineTest {

    @BeforeTest
    public void validateSetup() {
        Assert.assertEquals(getCurrentUrl(), URL, "Couldn't launch the given url: " + URL + "; exiting test");
    }

    @Test(testName = "PaymentAlertTest", alwaysRun = true)
    public void paymentAlertTest() {
        String originCity = "Cameron Highlands"; //to be read from dataprovider
        String destinationCity = "Kuala Lumpur"; //to be read from dataprovider
        String dateOfTravel = "2020-05-05"; //to be read from dataprovider
        String dayOfTravel = "5"; //to be read from dataprovider
        int maxSeats = 6; //to be read from dataprovider
        String expectedAlertMessage = "Please select a payment method"; //to be read from dataprovider

        BusBookingActions busBookingActions = new BusBookingActions();
        busBookingActions.setDepartureDateAction(dateOfTravel, dayOfTravel);
        busBookingActions.selectOriginCityAction(originCity);
        busBookingActions.selectDestinationCityAction(destinationCity);
        busBookingActions.bookNowAction(originCity, destinationCity);
        busBookingActions.selectCheapestBusAndProceedAction(maxSeats);


        //to be read from a csv file
        busBookingActions.enterUserNameAction("ABC");
        busBookingActions.enterMobileNoAction("1234567890");
        busBookingActions.enterEmailAction("abc@gmail.com");
        busBookingActions.reEnterEmailAction("abc@gmail.com");

        String alertMessage = busBookingActions.clickProceedToPayment();

        softAssert(alertMessage, expectedAlertMessage, "Discrepancy in alert message");
        getSoftAssert().assertAll();
    }
}
