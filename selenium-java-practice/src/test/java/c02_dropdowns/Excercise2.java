package c02_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("TEST");
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='email']")).sendKeys("test@test.pl");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Testtest123");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		for (WebElement option: driver.findElements(By.cssSelector("#exampleFormControlSelect1 option"))) {
			if(option.getText().equals("Male")) {
				option.click();
			}
		}
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("11.11.2000");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());
		
		
		

	}

}
