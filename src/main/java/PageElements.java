import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElements {
	
	//	Error 2 Fix - Class that holds the WebElements
	
    @FindBy(linkText = "Hotels")				
    private WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;
    
    
    public WebElement hotelLink() 
    	{return hotelLink;}

    public WebElement localityTextBox()
    	{return localityTextBox;}

    public WebElement searchButton()
    	{return searchButton;}

    public WebElement travellerSelection()
    	{return travellerSelection;}
    
}
