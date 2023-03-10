package Selenium_Basics;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLauncg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kmewade\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		//WebDriver driver= new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("page title is "+title);

		if(title.equals("Google")){
			System.out.println("Title is correct");
			}
		else {
			System.out.println("Title is incorrect");
		}
		driver.quit();
	}

}


