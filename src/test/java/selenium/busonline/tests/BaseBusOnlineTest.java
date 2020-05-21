package selenium.busonline.tests;

import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import selenium.commons.SeleniumBaseTest;

public class BaseBusOnlineTest extends SeleniumBaseTest {

    String URL;
    private SoftAssert softAssert;

    @BeforeSuite
    public void init() {
        this.URL = "https://www.busonlineticket.com/booking/bus-tickets.aspx";
        softAssert = new SoftAssert();
        launchUrl(URL);
        setSoftAssert(softAssert);
    }
}
