package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.init_driver("chrome");

		//br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		br.launchUrl("https://vcp.vmware.com/");
		
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		//By emailId = By.id("input-email");
		//By password = By.id("input-password");
		By emailID=By.xpath("//input[@name='username']");
		By Password=By.xpath("//input[@name='password']");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailID, "kmewade@vmware.com");
	     eleUtil.doSendKeys(Password, "Uniqueme1@");
		
		System.out.println(br.getPageTitle());
		
		//br.closeBrowser();

	}

}
