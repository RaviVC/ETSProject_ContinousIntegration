package PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ETS_HomePage {
	
	@FindBy(xpath=".//*[@id='contentMain']/div[2]/div[1]/div[1]/div[2]/a")
	public WebElement RegisterFindTestCentersDates;
	
}
