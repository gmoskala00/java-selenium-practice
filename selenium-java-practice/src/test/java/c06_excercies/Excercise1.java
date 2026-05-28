package c06_excercies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Excercise1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement input1 = driver.findElement(By.id("checkBoxOption1"));
		input1.click();
		String optionText = input1.findElement(By.xpath("..")).getText().trim();
		
		Select select = new Select(driver.findElement(By.id("dropdown-class-example")));
		select.selectByVisibleText(optionText);
		
		driver.findElement(By.id("name")).sendKeys(optionText);
		driver.findElement(By.id("alertbtn")).click();
		
		Assert.assertTrue(driver.switchTo().alert().getText().contains(optionText));
		
		
		

	}

}
