import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelBookingTest {

	WebDriver driver;  //	Error 1 - Driver path should be set before calling ChromeDriver
	
	//	Error 2 - WebElements need to be in a separate class file.

    @Test
    public void shouldBeAbleToSearchForHotels() {
        
        driver.get("https://www.cleartrip.com/");
        
        PageElements Elements = PageFactory.initElements(driver, PageElements.class);	//	Error 2 Fix - Added a separate class for webelements 
        																				//	named PageElements.class and Initializing  the same
        Elements.hotelLink().click();

        Elements.localityTextBox().sendKeys("Indiranagar, Bangalore");

        new Select(Elements.travellerSelection()).selectByVisibleText("1 room, 2 adults");
        Elements.searchButton().click();

        driver.quit();

    }

    @BeforeMethod
    private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
        
        driver = new ChromeDriver();  //	Error 1 Fix - ChromeDriver is called
    }

}
