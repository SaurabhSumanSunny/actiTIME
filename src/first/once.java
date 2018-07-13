package first;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class once {
	
	

		public static void main(String[] args) throws InterruptedException {

			WebDriver driver;

			// For firefox browser

			System.setProperty("webdriver.gecko.driver",
					"C:\\seleniumdrivers\\geckodriver-v0.11.1-win64\\geckodriver.exe");

			// For chrome browser
			
			 /*System.setProperty("webdriver.chrome.driver",
			 "C:\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");*/
			 

			driver = new FirefoxDriver();

			driver.get("https://www.google.co.in/");
			
			Thread.sleep(5000);
			
			
			
			//WebElement searchBox;
			
			//searchBox = driver.findElement(By.xpath("//input[@id='gs_htif0']"));
			
			//searchBox.sendKeys("Sachin tendurkar");
			
			driver.findElement(By.xpath("//div[@id='gs_lc0']/input[@id='lst-ib']")).sendKeys("Sachin tendulkar");
			
			driver.findElement(By.xpath("//div[@id='gs_lc0']/input[@id='lst-ib']")).sendKeys(Keys.ENTER);
			
			
			Thread.sleep(5000);
			
			driver.quit();
		}
}
