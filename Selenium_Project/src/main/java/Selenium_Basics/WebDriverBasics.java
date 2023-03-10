package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kmewade\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
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
