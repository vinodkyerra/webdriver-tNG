package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class report {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//vinod//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("123456");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();
		String alertmessage = driver.switchTo().alert().getText();
		//String alertmessager = driver.switchTo();
		System.out.println(alertmessage);
		Thread.sleep(2000);
		alert.accept();
		
	}

}
