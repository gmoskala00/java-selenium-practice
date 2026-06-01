package c06_excercies;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutocompleteDropdownEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("Pol");
		Thread.sleep(3000);
		for (WebElement option: driver.findElements(By.cssSelector("#ui-id-1 li div"))) {
			if(option.getText().equalsIgnoreCase("Poland")) {
				option.click();
				//new Actions(driver).click(option).perform();
				break;
			}
		}

	}

}
