package PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ETS_GRESearchService {
	
	@FindBy(xpath="//input[@id='searchService2']")
	public WebElement ClickEligilibityRequirements;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement ClickNext;

}
