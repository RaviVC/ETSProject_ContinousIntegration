package PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ETS_TestCenterAvailability {
	
	@FindBy(xpath="//span[text()='Select a Test']")
	public WebElement SelectTest;
	
	@FindBy(xpath="//input[@id='location']")
	public WebElement EnterLocation;
	
	@FindBy(xpath="//button[@id='findTestCenterButton']")
	public WebElement FindTestCenters;
	
	@FindBy(xpath=".//*[@id='labelbyDate111216']/a/span")
	public WebElement SelectDayDate;
	
	@FindBy(linkText="Show Test Times")
	public WebElement SelectTestTime;
	
	@FindBy(linkText="Register")
	public WebElement Register;
	
}
