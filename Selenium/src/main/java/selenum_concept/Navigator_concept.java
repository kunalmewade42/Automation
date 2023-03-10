package selenum_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigator_concept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www-test35.vmware.com/admin/login.portal");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kmewade");
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/table/tbody/tr[2]/td[2]/input")).sendKeys("2709Uniqueme1@");
		 driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/input")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("VSPP Order Status")).click();
		 driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div[2]/div[2]/div[1]/table/tbody/tr/td/form/div/div/div/div/table/tbody/tr[1]/td[2]/input")).sendKeys("C-1110923-72885-2109-0056656");
		 driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div[2]/div[2]/div[1]/table/tbody/tr/td/form/div/div/div/div/table/tbody/tr[3]/td/input")).click();
		//driver.get("https://www.vmware.com/admin/admin.portal");
	
	//	System.out.println(driver.getTitle());
		
	//	driver.navigate().back();
	//	System.out.println(driver.getTitle());
		
		//driver.navigate().forward();
		//System.out.println(driver.getTitle());

		//driver.navigate().back();
		//System.out.println(driver.getTitle());
		
		//driver.close();
	}

}
