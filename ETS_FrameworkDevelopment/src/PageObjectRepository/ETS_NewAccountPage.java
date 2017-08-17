package PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ETS_NewAccountPage {
	
	@FindBy(xpath="//input[@id='personalInfo-Username']")
	public WebElement Username;
	
	@FindBy(xpath="//input[@id='personalInfo-middleName']")
	public WebElement middleName;
	
	@FindBy(xpath="//input[@id='personalInfo-lastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='genderM']")
	public WebElement genderM;
	
	@FindBy(xpath="//input[@id='socialSecurity']")
	public WebElement socialSecurity;
	
	@FindBy(xpath="//input[@id='personalInfo-email']")
	public WebElement email;
	
	@FindBy(xpath="//select[@name='countryCode']")
	public WebElement countryCode;
	
	@FindBy(xpath="//input[@id='personalInfo-addressLine1']")
	public WebElement addressLine1;
	
	@FindBy(xpath="//input[@id='personalInfo-addressLine2']")
	public WebElement addressLine2;
	
	@FindBy(xpath="//input[@id='personalInfo-city']")
	public WebElement city;
	
	@FindBy(xpath="//input[@id='stateProvTxt']")
	public WebElement state;
		
	@FindBy(xpath="//input[@id='personalInfo-postalCode']")
	public WebElement postalcode;
	
	@FindBy(xpath="//input[@id='personalInfo-pPhone']")
	public WebElement phone;
	
	@FindBy(xpath=".//*[@id='ng-app']/div[2]/div/div[4]/div/form/div[6]/fieldset/div/label[2]/input")
	public WebElement type;
	
	@FindBy(xpath="//input[@id='alternativePhoneNumber']")
	public WebElement Alternatephone;
	
	@FindBy(xpath=".//*[@id='ng-app']/div[2]/div/div[4]/div/form/div[7]/fieldset/div/label[4]/input")
	public WebElement AlternateType;
			
	@FindBy(xpath="//label[@class='radio']/span[text()='No, I do not wish to receive text messages.']")
	public WebElement NoTextMsgs;
	
	@FindBy(xpath="//button[@class='btn btn-eReg']/span[text()='NEXT']")
	public WebElement next;
	
	@FindBy(xpath=".//*[@id='addressModel']/div/div[2]/div[2]/div[2]/table/tbody/tr/td/button")
	public WebElement SelectAddress;
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement UsernameUP;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement PasswordUP;
	
	@FindBy(xpath="//input[@id='passwordConfirmation']")
	public WebElement ReconfirmPassword;
	
	@FindBy(xpath="//input[@name='securityQuestionAnswer']")
	public WebElement Answer;
	
	@FindBy(xpath="//input[@id='termsConditions']")
	public WebElement termsConditions;
	
	@FindBy(xpath="//button[@id='accountButton']/span[text()='NEXT']")
	public WebElement accountButton;
	
	//@FindBy(xpath="//button[@class='btn btn-eReg']/span[text()='SUBMIT']")
	@FindBy(xpath="//body[@id='ng-app']/div[2]/div/div[3]/div[3]/div[2]/button")
	public WebElement Submit;
	
	@FindBy(xpath="//button[@class='btn btn-eReg']/span[text()='Sign in to Continue']")
	public WebElement signin;
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement loginusername;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement loginpassword;
	
	@FindBy(xpath="//button[@name='submitSign']")
	public WebElement submitSign;
	
	@FindBy(xpath="//div[@id='ereg-navbar-collapse']/ul/li[4]/a")
	public WebElement SignOut;
	
}
