package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDynemicWebElement {
	WebDriver driver;
	
	@Before
	public void Initiazing() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver102.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://cnn.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		@Test
		public void DynemicWebElement() {
			driver.findElement(By.xpath("//section[@id='homepage1-zone-1']/descendant::h2")).click();
		}

	@After
		public void tearDown() {
			driver.close();
			driver.quit();
		}
	
		



	
	}
