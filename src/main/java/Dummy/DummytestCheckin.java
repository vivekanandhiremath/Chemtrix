package Dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummytestCheckin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://20.219.107.162:8082");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("1024");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Che@1234");
		driver.findElement(By.xpath("//button[.='Log In']")).click();

		driver.findElement(By.xpath("(//p[contains(.,'Check In/check Out')])[1]")).click();

		Thread.sleep(2000);
		driver.close();

	}
}
