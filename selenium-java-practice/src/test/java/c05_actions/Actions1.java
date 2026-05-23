package c05_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.pl/");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav-link-accountList']"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick()
				.build().perform();
		// Moves to specific element
		a.moveToElement(move).contextClick().build().perform();

	}

}
