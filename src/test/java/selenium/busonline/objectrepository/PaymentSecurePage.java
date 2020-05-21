package selenium.busonline.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PaymentSecurePage extends BusSelectorPage {

    @FindBy(css = "input#ContentPlaceHolder1_btnProceedPayment")
    protected WebElement proceedToPaymentButton;


    protected WebElement enterUserDetails(UserDetailsKey userDetails, boolean header) {
        String css = "table.table.paxbox tr[style='height: 5']";
        if (!header)
            css = " th";


        List<WebElement> formDetails = driver.findElements(By.cssSelector(css));
        for (WebElement formDetail : formDetails) {
            if (formDetail.getText().equals(userDetails.getLabel()))
                return formDetail;
        }
        return null;
    }
}
