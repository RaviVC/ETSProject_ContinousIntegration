package PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ETS_EReg_ViewProfile {
	
	@FindBy(xpath="//span[@message-name='profile.create.button.next']")
	public WebElement ClickEligilibityRequirements;

}
