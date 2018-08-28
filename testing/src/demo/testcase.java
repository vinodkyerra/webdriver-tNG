package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testcase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Users//vinod//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/registration");
		driver.findElement(By.id("name_3_firstname")).sendKeys("sehwag");
		driver.findElement(By.id("name_3_lastname")).sendKeys("viru");
		//Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.findElement(By.name("radio_4[]")).click();
		//driver.findElement(By.name("radio_3[]")).click();
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("checkbox_5[]"))).click();
		//driver.findElement(By.name("checkbox_5[]")).click();
		WebElement uploadelement = driver.findElement(By.id("profile_pic_10"));
		uploadelement.sendKeys("C:\\Users\\vinod\\Pictures\\Camera Roll\\WIN_20180221_08_10_17_Pro.jpg");
		Select country = new Select(driver.findElement(By.id("dropdown_7")));
		country.selectByIndex(1);
		Select month = new Select (driver.findElement(By.id("mm_date_8")));
		month.selectByIndex(8);
		Select day = new Select (driver.findElement(By.id("dd_date_8")));
		day.selectByIndex(15);
		Select year = new Select (driver.findElement(By.id("yy_date_8")));
		year.selectByIndex(4);
		
		driver.findElement(By.id("phone_9")).sendKeys("1234567890");
		
		driver.findElement(By.id("username")).sendKeys("vinod");
		driver.findElement(By.id("email_1")).sendKeys("vinodkyerra@gmail.com");
		//driver.findElement(By.name("profile_pic_10","C:\\Users\\vinod"));
	    driver.findElement(By.id("description")).sendKeys("hope you doing great");
		driver.findElement(By.id("password_2")).sendKeys("demowhere124");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("demowhere124");
		Thread.sleep(7000);
		driver.findElement(By.name("pie_submit")).submit();
		driver.close();
		//driver.quit();
		
		
		
	}

}
