package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Lib.DataSet;
import Lib.ExcelDataConfig;
import PageObjectRepository.ETS_LoginPage;

public class ETS_RegisterTest {
	
	WebDriver driver;
	ETS_LoginPage loginpage;
	
	
	//*************** Launch FireFox browser  **********************************************************
	@BeforeTest
	public void getBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:\\Softwares\\geckodriver.exe");
		ProfilesIni prof = new ProfilesIni();				
		driver = new FirefoxDriver(prof.getProfile("myProfile"));
				
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
	}
	
	
	//*************** Hit the URL ************************************************************************
	@Test(priority=0)
	public void launchApp() throws InterruptedException
	{		
		driver.navigate().to("https://eregweb-pt-ext.ets.org/ereg/public/jump?_p=GRI");
		Assert.assertEquals(driver.getTitle(), "Sign In for Test Takers");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("JayaLM");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Compaid789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='submitSign']")).click();
		Thread.sleep(20000);
	}
	
	//*************** Enter the login credentials in Login page and submit *******************************
	

	/*@Test(priority=1,dependsOnMethods="launchApp",dataProviderClass=DataSet.class,dataProvider="ETSusernamePwd")
	public void ETSLogin(String username, String password) throws InterruptedException
	{
		
		loginpage=PageFactory.initElements(driver, ETS_LoginPage.class);
		System.out.println("Enter username");
		loginpage.signinusername.sendKeys(username);
		Thread.sleep(2000);
		System.out.println("Enter password");
		loginpage.signinpassword.sendKeys(password);
		Thread.sleep(2000);
		loginpage.login.click();
		Thread.sleep(20000);
		Assert.assertEquals(driver.getTitle(), "Home Page");	
	}*/
	
	
	//*************** Register Test ************************************************************************
	@Test(priority=1)
	public void registerTest() throws InterruptedException
	
	{
		driver.findElement(By.xpath(".//*[@id='contentMain']/div[2]/div[1]/div[1]/div[2]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Select a Test']")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='GRE General Test']"))).click();	
		
		driver.findElement(By.xpath(".//*[@id='location']")).sendKeys("Mumbai, Maharashtra, India");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='findTestCenterButton']")).click();	
		Thread.sleep(7000);
		
		//driver.findElement(By.xpath("//span[text()='November 21, 2016 -  Thursday']")).click();
		driver.findElement(By.xpath(".//*[@id='labelbyDate113016']/a/span")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class='testCenter-data']//span[7]/a")).click();						
		//driver.findElement(By.linkText("Show Test Times")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(20000);
		
		//Actions action = new Actions(driver);
			
		driver.findElement(By.xpath("//input[@id='eligilibityRequirements']")).click();
		//driver.findElement(By.xpath(".//*[@id='beforeScheduleForm']/div[3]/div[3]/div/label/input[1]")).click();
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//a[@id='submitForm']")).click();
		driver.findElement(By.linkText("Next")).click();
		Thread.sleep(20000);	
		
		//driver.findElement(By.xpath("//span[@message-name='profile.create.button.next']")).click();
		//driver.findElement(By.xpath(".//*[@id='contentMain']/div/div[4]/div[2]/form/div[4]/div[2]/button")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-eReg']/span[text()='NEXT']")).click();
		Thread.sleep(7000);	
		
		driver.findElement(By.xpath(".//*[@id='searchService1']")).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		
		
		//Background Information 
		
		//WebDriverWait wait1 = new WebDriverWait(driver, 120);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("9900470114"))).click();
		
		//Of what country are you a citizen?
		Select dropdown1 = new Select(driver.findElement(By.xpath(".//*[@id='9900470114-label']/strong//following::select[1]")));
		dropdown1.selectByValue("100");
		Thread.sleep(5000);
		
		/*System.out.println("Background Information edit fields started");
		driver.findElement(By.id("9900470114")).isDisplayed();
		WebElement Country_dropdown = driver.findElement(By.id("9900470114"));
		Select Country_dropdown1 = new Select(Country_dropdown);
		Country_dropdown1.selectByIndex(101);
		System.out.println("Background Information 1st edit field");
				
		Select dropdown1 = new Select(driver.findElement(By.id("9900470114")));
		dropdown1.selectByValue("9");
		
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@name='9900470114']")));
		dropdown1.selectByValue("9");
		Thread.sleep(5000);*/
		
		//Educational Status at the time you take the GRE test:
		Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='9900470116']")));
		dropdown2.selectByVisibleText("Senior (fourth or final year)");
		Thread.sleep(5000);
		
		//Do you communicate better (or as well) in English than in any other language?
		driver.findElement(By.xpath(".//*[@id='ng-app']/div/div/div/form/div[5]/div/div/fieldset/div/div[1]/label[2]/input")).click();
		Thread.sleep(5000);
		
		//What is your native Language?
		Select dropdown3 = new Select(driver.findElement(By.xpath(".//*[@id='9900470104']")));
		dropdown3.selectByValue("31");
		Thread.sleep(5000);
		
		//What is/are your reason(s) for taking the GRE test(s)? (Select all that apply.) 
		driver.findElement(By.xpath("//input[@id='9900601481']")).click();
		Thread.sleep(5000);
		
		//Subject:		
		driver.findElement(By.xpath("//input[@id='9900604481']")).click();
		Thread.sleep(5000);
		
		//Father or Parent/Guardian 1:
		Select dropdown4 = new Select(driver.findElement(By.xpath("//select[@id='9900470120']")));
		dropdown4.selectByValue("6");
		Thread.sleep(5000);
		
		//Mother or Parent/Guardian 2:
		Select dropdown5 = new Select(driver.findElement(By.xpath("//select[@id='9900470111']")));
		dropdown5.selectByValue("6");
		Thread.sleep(5000);
		
		//Find Your Undergraduate Major Field of Study
		//driver.findElement(By.xpath("//span[@unselectable='on']")).sendKeys("0101 Agriculture - Agricultural Economics");
		driver.findElement(By.xpath("//div[@id='ng-app']/div/div/div/form/div[11]/div/div/span/span/span/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[text()='0101 Agriculture - Agricultural Economics']")).click();
		Thread.sleep(3000);
		
		//Select your grade point average
		Select gradepointselect = new Select(driver.findElement(By.xpath("//select[@id='9900470126']")));
		gradepointselect.selectByValue("0");
		Thread.sleep(5000);
		
		
		//Select your overall undergraduate grade point average.
		Select dropdown6 = new Select(driver.findElement(By.xpath("//select[@id='9900470122']")));
		dropdown6.selectByValue("0");
		Thread.sleep(5000);
		
		//In what calendar year did you receive or do you expect to receive your bachelor's degree?
		driver.findElement(By.xpath("//input[@id='9900470117']")).sendKeys("2016");
		Thread.sleep(5000);
		
		//Find Your Intended Major Field of Graduate Study
		//driver.findElement(By.xpath("//span[@unselectable='on']")).sendKeys("Agricultural Economics (0101)");
		driver.findElement(By.xpath("//div[@id='ng-app']/div/div/div/form/div[15]/div/div/span/span/span/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[text()='Agricultural Production (0102)']")).click();
		Thread.sleep(3000);
		
		//Please indicate any currently documented visual, physical, hearing, or learning disabilities you have.
		Select dropdown7 = new Select(driver.findElement(By.xpath("//select[@id='9900470113']")));
		dropdown7.selectByValue("0");
		Thread.sleep(5000);
		
		//In what type of graduate or business school program do you plan to enroll (or are you enrolled)?
		driver.findElement(By.xpath("//input[@value='9900471086']")).click();
		Thread.sleep(5000);
		
		//What is your eventual graduate education objective?
		driver.findElement(By.xpath("//input[@value='9900471575']")).click();
		Thread.sleep(5000);
		
		//In what geographic region(s) would you prefer to attend graduate school? (Select all that apply.)
		driver.findElement(By.xpath("//input[@value='9900604503']")).click();
		Thread.sleep(5000);
		
		//Indicate your intended date of enrollment in graduate school
		Select dropdown8 = new Select(driver.findElement(By.xpath(".//*[@id='9900470124']")));
		dropdown8.selectByValue("1");
		Thread.sleep(5000);
		
		//Indicate how many years of post-graduate full-time work experience you have.
		Select dropdown9 = new Select(driver.findElement(By.xpath("//select[@id='9900470110']")));
		dropdown9.selectByValue("4");
		Thread.sleep(5000);
		
		//How would you like to pursue your graduate/business degree?
		driver.findElement(By.xpath("//input[@value='9900471070']")).click();	
		Thread.sleep(5000);
		
		//Background Information finished
		
		//click on next 
		//driver.findElement(By.xpath("//span[@message-name='profile.create.button.next']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-eReg']/span[text()='NEXT']")).click();
		Thread.sleep(25000);
		
		//proceed to checkout
		driver.findElement(By.xpath("//button[@id='nextButton']")).click();
		Thread.sleep(10000);
		
		//Voucher/Promotional Code
		driver.findElement(By.xpath("//input[@id='voucherCodeInput']")).sendKeys("1234");
		Thread.sleep(5000);
		
		//Apply
		driver.findElement(By.xpath("//button[@class='btn btn-eReg showBlocker']")).click();
		Thread.sleep(5000);
		
		//paynow
		driver.findElement(By.xpath("//button[@id='paynow']")).click();
		Thread.sleep(5000);
		
		//Payment Method
		driver.findElement(By.xpath("//input[@id='cardPayment']")).click();
		Thread.sleep(5000);
		
		//Continue 
		driver.findElement(By.xpath("//input[@id='submit1']")).click();
		Thread.sleep(50000);
		
		System.out.println("select the credit card type");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.findElements(By.xpath("//select")).size());
	
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@id='card_cardType']"))));
		
//		System.out.println(driver.findElement(By.xpath("//table[@role='presentation']//td[text()='Credit Card']")).getText());
//		System.out.println(driver.findElement(By.xpath("//table[@role='presentation']//tr[5]//td[2]/select[@id='card_cardType']")).getAttribute("id"));
//		Object dp = driver.findElement(document.getElementById("card_cardType"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		WebElement a = (WebElement)js.executeScript("return document.getElementById('card_cardType');");
		System.out.println("found the dropdown"+a.getAttribute("id"));
		
		
		Select cardtype = new Select(driver.findElement(By.xpath("//select[@id='card_cardType']")));
//		cardtype.selectByVisibleText("MasterCard");
		cardtype.selectByValue("001");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='card_accountNumber']")).sendKeys("4111111111111111");
		Thread.sleep(5000);
		
		Select selectmonth = new Select(driver.findElement(By.xpath("//select[@id='card_expirationMonth']")));
		selectmonth.selectByValue("03");
		Thread.sleep(5000);
		
		Select selectyear = new Select(driver.findElement(By.xpath("//select[@id='card_expirationYear']")));
		selectyear.selectByValue("2021");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='card_cvNumber']")).sendKeys("123");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='submit2']")).click();
		Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void closeBrowser(){
		//driver.close();
		//driver.quit();
	}
	

}
