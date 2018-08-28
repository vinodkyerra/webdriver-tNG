import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class itestmerc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//vinod//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[contains(@href,'mercuryregister.php')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[contains(@name,'firstName')]")).sendKeys("vinod");
		//driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input")).sendKeys("viru");// copied from the xpath from the link in the page
		driver.findElement(By.xpath(".//*[contains(@name,'lastName')]")).sendKeys("viru");// created dynamic xpath 
		driver.findElement(By.xpath(".//*[contains(@name,'address1')]")).sendKeys("har");
		driver.findElement(By.xpath(".//*[contains(@name,'city')]")).sendKeys("glen");
		driver.findElement(By.xpath(".//*[contains(@name,'state')]")).sendKeys("VA");
		driver.findElement(By.xpath(".//*[contains(@name,'postalCode')]")).sendKeys("23060");
		Thread.sleep(2000);
	
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("172");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("vin@gmail");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[contains(@href,'mercuryunderconst.php')]")).click();
		Thread.sleep(2000);

		driver.close();
	}

}
