package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C://Users//vinod//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		//Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[contains(@name,'first')]")).sendKeys("sehwag");
		//driver.findElement(By.xpath(".//*[starts with(@class,'loader')]")).click();
		
        //driver.findElement(By.xpath().click();
	}

}
