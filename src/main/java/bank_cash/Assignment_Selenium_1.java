package bank_cash;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Selenium_1 {

	WebDriver driver;

	@Before
	public void launchBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\DecemberQA2021_Selenium\\crm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies(); // before going to the website, I need to have this delete cookies
		driver.get("https://techfios.com/billing/?ng=dashboard");
		driver.manage().window().maximize(); // maximize the window
		Thread.sleep(4000);
	}
	
	@Test

	public void bankCash() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");//
		driver.findElement(By.id("password")).sendKeys("abc123"); //
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Bank & Cash")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("New Account")).click();
		Thread.sleep(4000);
		// now I am assigning the value in the New Account input box
		
		driver.findElement(By.id("account")).sendKeys("Checking Account");
		driver.findElement(By.id("description")).sendKeys("House Hold expense");
		driver.findElement(By.id("balance")).sendKeys("3000");
		driver.findElement(By.id("account_number")).sendKeys("0000-444-666-339");
		driver.findElement(By.id("contact_person")).sendKeys("112-334-5648");
		driver.findElement(By.id("contact_phone")).sendKeys("123-456-7890");
		driver.findElement(By.id("ib_url")).sendKeys("https://techfios.com/billing/?ng=accounts/add/");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@class='btn btn-primary'and @type='submit']")).click();
		
	
	
		Thread.sleep(4000);
	}
	
	
	@After
	public void teardown() {
		
		driver.close();
		driver.quit();
	}

}
