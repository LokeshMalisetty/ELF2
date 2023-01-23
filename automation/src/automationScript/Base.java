package automationScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	public static WebDriver driver=null;
	@BeforeTest
	public static void browserSetUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 Reporter.log("browser launched",true);
		driver.manage().window().maximize();
		 Reporter.log("browser maximized",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/index.php#");
		Reporter.log("Application opened",true);
		driver.findElement(By.id("nav_motorcycle")).click();
		Reporter.log("navigated to the Motorcycle Module",true);
	}
	@AfterTest
	public static void browserTearDown() {
		driver.quit();
	}

}
