package Testng1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("make the things clear first");
	  
	 
  }
  
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C://Users//vinod//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		//driver.findElement(By.name("http://newtours.demoaut.com/mercuryregister.php")).click();
		driver.findElement(By.xpath(".//*[contains(@href,'mercuryregister.php')]")).click();
		driver.findElement(By.name("firstName")).sendKeys("vinod");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[contains(@name,'lastName')]")).sendKeys("yerra");
		driver.findElement(By.xpath(".//*[contains(@name,'phone')]")).sendKeys("17036785078");
		 Select country = new Select(driver.findElement(By.name("country")));
	     country.selectByIndex(2);
	     
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.xpath(".//*[contains(@name,'userName')]")).sendKeys("vinodkyerra@gmail.com");

			  
	  
  }

}
