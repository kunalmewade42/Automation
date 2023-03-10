package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kmewade\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		String title=driver.getTitle();
		System.out.println("page title is "+title);

		if(title.equals("Google")){
			System.out.println("Title is correct");
			}
		else {
			System.out.println("Title is incorrect");
		}
		//driver.quit();

		//driver.quit();
		driver.close();//123
		
		driver = new ChromeDriver();//456
		driver.get("http://www.google.com");//enter the url -- 456
		
		System.out.println(driver.getTitle());
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//NoSuchSessionException: invalid session id
	}
}	


