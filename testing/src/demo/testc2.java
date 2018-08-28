package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testc2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//vinod//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/guru99home/");
		//driver.findElement(By.xpath("//*[@id=\"rt-header\"]/div/div[2]/div/ul/li[2]/a")).click();
		driver.get("https://www.google.com/search?q=mercurytours&rlz=1C1MKDC_enUS772US772&oq=me&aqs=chrome.0.69i59j69i60l2j69i57j35i39j0.1742j0j7&sourceid=chrome&ie=UTF-8/");
		//driver.findElement(By.xpath(".//*[@id=\"Navagation\"]/strong/a[1]/span")).click();
		driver.findElement(By.xpath(".//*[@id=\"rso\"]/div/div/div[2]/div/div/h3/a")).click();
		//driver.findElement(By.xpath(".//*[@id=\"Navagation\"]/strong/a[4]/span")).click();
		driver.findElement(By.xpath(".//span[contains(@class,'auto-style8')] [conatins(text(),'San Franscisco Tours')]")).click();
		
		

}
}
