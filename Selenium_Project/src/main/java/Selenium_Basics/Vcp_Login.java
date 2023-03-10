package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vcp_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://vcp-stg.vmware.com/login");
		//// input[@placeholder='Email' and @name='username']"
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kmewade@vmware.com");
	//	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Uniqueme1@");
		// for click login button below xpath
	// button[@class='btn btn-primary btn-login']
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
