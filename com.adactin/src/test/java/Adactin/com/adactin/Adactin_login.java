package Adactin.com.adactin;

import static Adactin.com.adactin.Utils.*;
import java.io.IOException;
import static Adactin.com.adactin.BaseClass.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin_login {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		browserLaunch();

		// User-LoginIn
		WebElement locator = nameLocator("username");
		locator.sendKeys(username);
		WebElement locator1 = nameLocator("password");
		locator1.sendKeys(password);
		idLocator("log").click();

		// User-Selection Preferrance
		WebElement locator2 = nameLocator("location");
		dropdown(locator2, 3);
		WebElement locator3 = nameLocator("hotels");
		dropdown(locator3, 2);
		WebElement locator4 = idLocator("room_type");
		dropdown1(locator4, roomtype);
		WebElement locator5 = idLocator("room_nos");
		dropdown2(locator5, "2");
		WebElement locator6 = idLocator("datepick_in");
		locator6.clear();
		locator6.sendKeys(datein);
		WebElement locator7 = idLocator("datepick_out");
		locator7.clear();
		locator7.sendKeys(dateout);
		WebElement locator8 = idLocator("adult_room");
		dropdown1(locator8, "2 - Two");

		WebElement locator9 = idLocator("child_room");
		dropdown(locator9, 2);

		nameLocator("Submit").click();
		idLocator("radiobutton_0").click();
		idLocator("continue").click();

		// User-Details
		idLocator("first_name").sendKeys(firstname);
		idLocator("last_name").sendKeys(lastname);
		idLocator("address").sendKeys(address);
		idLocator("cc_num").sendKeys(ccno);

		WebElement locator10 = idLocator("cc_type");
		dropdown2(locator10, cardtype);
		WebElement locator11 = idLocator("cc_exp_month");
		dropdown1(locator11, cardexpmonth);

		WebElement locator12 = idLocator("cc_exp_year");
		dropdown(locator12, 3);

		idLocator("cc_cvv").sendKeys(Utils.cardcv);
		idLocator("book_now").click();
		idLocator("my_itinerary").click();

		// Screenshot
		screenshot("pic");

	}

}
