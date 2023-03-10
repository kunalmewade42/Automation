package selenum_concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExceptions {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
		//FE:
		//driver.findElement(By.name("username1111")).sendKeys("groupautomation");
		//NoSuchElementException -- selenium
		//ElementNotFoundException -- this exception is not present in selenium
		
		//FEs:
//		List<WebElement> list = driver.findElements(By.name("username1111"));
//		System.out.println(list.size());
//		
//		if(list.size()==0) {
//			System.out.println("element not available");
//			throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
//		}
		
		//validate that element is available on the page or not:
		//1. isDisplayed
		//2. List<WE> -- get the size==1
		
		//StaleElementRefException?
		//when page DOM is changed and element is no more attached on the latest PAGE DOM
		
		//IllegaltStateException? -- WebDriverException:
		//when you dont pass the System prop with binary path
		
		//ElementNotInteractableException?
		//to handle this, we use Actions click or JSE
		
		//InvalidSelectorException:
		//when you pass the wrong locator String (Wrong Syntax for locators)
		//driver.findElement(By.xpath("//input[name=='username']")).sendKeys("naveen123");
		
		//NoSuchSessionException:
		//Session ID is expired or null
		//expired/invalid --> close --NoSuchSessionException: invalid session id
		//null ->  quit --> NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		//NoAlertPresentException: no such alert
		//driver.switchTo().alert();
		//NoSuchFrameException
		//NoSuchWindowException
		
		
	}

}