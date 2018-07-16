package selenium;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import helpers.DriverInit;
import helpers.ElementFinder;

public class Hostar extends DriverInit {

	public static void main(String[] args) throws InterruptedException {

		ElementFinder locator = new ElementFinder();
		DriverInit.setDriver();
		DriverInit.driverInit("https://www.hotstar.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int second = 0;; second++) {
			if(second >=15){
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", ""); //y value '400' can be altered
			Thread.sleep(3000);
		}

		java.util.List<WebElement> links = driver.findElements(By.xpath("//*[@class=\"row tray-head-row\"]//h2/a"));
		int k =0;

		ArrayList<String> arList = new ArrayList<String>();
		while(k<links.size()) {
			arList.add(links.get(k).getText());
			//System.out.println(links.get(k).getText());
			k = k+1;
		}
		System.out.println(arList);
		DriverInit.driverClose();
		
		Thread.sleep(3000);
		
		DriverInit.setDriver();
		DriverInit.driverInit("https://www.hotstar.com/");
		DriverInit.getDriver().findElement( locator.getByType("xpath", "//*[@id=\"autoSearchBox\"]/li[2]/a")).click();
		Thread.sleep(2000);
		DriverInit.getDriver().findElement( locator.getByType("id", "emailaddress")).sendKeys("testprod-999@hotstar.com");
		Thread.sleep(2000);
		DriverInit.getDriver().findElement( locator.getByType("id", "userPwd")).sendKeys("test");
		Thread.sleep(2000);
		DriverInit.getDriver().findElement( locator.getByType("xpath", "//*[@id=\"signinForm\"]/div[3]/div/button")).click();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.hotstar.com/"); // to make sure after login we are at home page
		for (int second = 0;; second++) {
			if(second >=20){
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", ""); //y value '400' can be altered
			Thread.sleep(3000);
		}

		java.util.List<WebElement> linksNew = driver.findElements(By.xpath("//*[@class=\"row tray-head-row\"]//h2/a"));
		int j =0;
		ArrayList<String> arListNew = new ArrayList<String>();
		while(j<linksNew.size()) {
			arListNew.add(linksNew.get(j).getText());
			//System.out.println(links.get(k).getText());
			j = j+1;
		}
		System.out.println(arListNew);

		Set<String> result = new HashSet<String>();
		System.out.println("a. Missing tray titles after login when compared to the list before login");
		int index=1;
		for (String el: arList) {
			if (!arListNew.contains(el)) {
				result.add(el);
				System.out.println(" "+index+"  "+el);
				index++;
			}
		}
		System.out.println("b. Additional tray titles after login");
		index =1;
		for (String el: arListNew) {
			if (!arList.contains(el)) {
				result.add(el);
				System.out.println(" "+index+"  "+el);
				index++;
			}
		}
		System.out.println("");
		
		System.out.println("Discrepancies in pre and post login tray titles : "+ result);
		DriverInit.driverClose();
	}
}	
