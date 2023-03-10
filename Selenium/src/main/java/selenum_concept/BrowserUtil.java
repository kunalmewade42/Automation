package selenum_concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	WebDriver driver;
	public WebDriver init_driver(String browserName) {

	System.out.println("browser name is : "+browserName);
	{

	switch (browserName) {
	case "chrome":
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "firefox":
		//System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	case "safari":
		driver = new SafariDriver();
		break;

	default:
		System.out.println("Please pass the correct browser : " + browserName);
		break;
	}
	return driver;
	}
	}
	public void launchUrl(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
}
	}


