package MAX;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;



 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class SeleniumHQJUNIT {
	 	private static ChromeDriver driver;
	 	WebElement element;
 
	 @BeforeClass
     public static void openBrowser(){
			System.setProperty("webdriver.chrome.driver",
		            "src/main/resources/drivers/chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} 
	 @Test
     public void valid_UserCredential(){
 
		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     driver.get("http://www.store.demoqa.com");	
	     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	     driver.findElement(By.id("log")).sendKeys("testuserzx");
	     driver.findElement(By.id("pwd")).sendKeys("pavany9989");
	     driver.findElement(By.id("login")).click();
	     try{
			 element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
		 }catch (Exception e){
			}
	     AssertJUnit.assertNotNull(element);
	     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
     }
 
	 
 
	 @AfterClass
	 public static void closeBrowser(){
		 driver.quit();
	 }
}