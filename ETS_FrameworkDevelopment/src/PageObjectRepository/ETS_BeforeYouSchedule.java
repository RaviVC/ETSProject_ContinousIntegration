package PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ETS_BeforeYouSchedule {
	
	@FindBy(xpath="//input[@id='eligilibityRequirements']")
	public WebElement ClickEligilibityRequirements;
	
	@FindBy(xpath="//a[@id='submitForm']")
	public WebElement ClickNext;

}
