package selenium.busonline.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class BusSelectorPage extends Homepage {

    @FindBy(css = "input.seatproceed")
    protected WebElement seatProceedButton;

    @FindBy(css = "div.businnerdiv")
    protected WebElement seatSelectionPane;

    protected WebElement selectLowestPriceBus() {
        List<Double> priceList = new ArrayList<>();
        List<WebElement> buses = driver.findElements(By.cssSelector("tr.bustr1 div.busprice1"));
        for (int i = 0; i < buses.size(); i++) {
            priceList.add(Double.parseDouble(buses.get(i).getText().split(" ")[1]));
        }
        int minIndex = IntStream.range(0, priceList.size())
                .reduce((i, j) -> priceList.get(i) > priceList.get(j) ? j : i)
                .getAsInt();

        List<WebElement> selectButtons = driver.findElements(By.cssSelector("tr.bustr1 a.btn.btn-orange.selectseatbutton"));
        return selectButtons.get(minIndex);
    }

    protected List<WebElement> getAvailableSeats(int maxSeats) {
        List<WebElement> availableSeats = driver.findElements(By.cssSelector("table.seat_panel1 div.seat_available"));
        if (availableSeats.size() > maxSeats)
            return availableSeats.subList(0, maxSeats);
        else
            return availableSeats;
    }

    protected List<WebElement> getSelectedSeats() {
        List<WebElement> selectedSeats = driver.findElements(By.cssSelector("div.seat_selected"));
        return selectedSeats;
    }
}