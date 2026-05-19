package c04_synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excercise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn"))).click();
		driver.findElement(By.cssSelector("select.form-control")).click();
		driver.findElement(By.cssSelector("option[value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		List<WebElement> addButtons = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.card-footer button")));
		for (WebElement addButton: addButtons) {
			addButton.click();
		}
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		
		
		
	}

}
