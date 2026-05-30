package c06_excercies;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExcercise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.cssSelector(".left-align #product tr")).size();
		int columns = driver.findElements(By.cssSelector(".left-align #product tr th")).size();
		
		WebElement thirdRow = driver.findElement(By.cssSelector(".left-align #product tr:nth-child(3)"));
		List<WebElement> cells = thirdRow.findElements(By.tagName("td")); 
		
		for (WebElement cell: cells) {
			cell.getText();
		}

	}

}
