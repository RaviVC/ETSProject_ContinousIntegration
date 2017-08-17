package PageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ETS_LoginPage {
	
	
		@FindBy(xpath="//input[@id='username']")
		public WebElement signinusername;
		
		@FindBy(xpath="//input[@id='password']")
		public WebElement signinpassword;
		
		@FindBy(xpath="//button[@name='submitSign']")
		public WebElement login;
		
		/*@FindBy(xpath="//input[@id='username']")
		public WebElement username;
		
		@FindBy(xpath="//input[@id='password']")
		public WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		public WebElement login;*/
		
	}


