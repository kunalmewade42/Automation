package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppTest {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			BrowserUtil br = new BrowserUtil();
			
			br.init_driver("Chrome");
			WebDriver driver = br.init_driver("chrome");
			br.launchUrl("https://vcp.vmware.com/");
			String title = br.getPageTitle();
			System.out.println("page title is: " + title);
			
			//br.launchUrl("https://vcp-stg.vmware.com/");
			By emailID=By.xpath("//input[@name='username']");
			By Password=By.xpath("//input[@name='password']");
			
			
			ElementUtil eleUtil = new ElementUtil(driver);

		
	      eleUtil.doSendKeys(emailID, "kmewade@vmware.com");
			
			eleUtil.doSendKeys(Password, "Uniqueme1@");
			System.out.println(br.getPageUrl());
			br.closeBrowser();
			
		}
}


	


