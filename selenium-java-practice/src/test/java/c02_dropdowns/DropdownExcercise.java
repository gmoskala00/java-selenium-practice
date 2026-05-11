package c02_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropdownExcercise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());
		checkbox.click();
		Assert.assertFalse(checkbox.isSelected());
		
		driver.findElements(By.cssSelector("inpput[type='checkbox'")).size();

	}

}
