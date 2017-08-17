package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Softwares\\geckodriver-v0.9.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//Validations 
		System.out.println("select the credit card type");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		/*
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@id='card_cardType']"))));*/
		
//		System.out.println(driver.findElement(By.xpath("//table[@role='presentation']//td[text()='Credit Card']")).getText());
//		System.out.println(driver.findElement(By.xpath("//table[@role='presentation']//tr[5]//td[2]/select[@id='card_cardType']")).getAttribute("id"));
//		Object dp = driver.findElement(document.getElementById("card_cardType"));
		
		
		
		//SSL Certificate
		/*FirefoxProfile fp = new FirefoxProfile();
		fp.setAcceptUntrustedCertificates(true);
		System.setProperty("webdriver.ie.driver", "D:\\Softwares\\IEDriverServer");
		driver = new InternetExplorerDriver();*/
		
		/*ProfilesIni prof = new ProfilesIni();				
		FirefoxProfile ffProfile= prof.getProfile ("myProfile");
		ffProfile.setAcceptUntrustedCertificates(true);
		ffProfile.setAssumeUntrustedCertificateIssuer(false);*/
		
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);	*/
		
		//driver.get("https://eregweb-pt-ext.ets.org/ereg/public/jump?_p=GRI");

	}

}
