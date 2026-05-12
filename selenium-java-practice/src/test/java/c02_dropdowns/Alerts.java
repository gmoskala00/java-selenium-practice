package c02_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		String name = "TEST";
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello "+ name + ", share this practice page and share your knowledge");
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

	}

}
