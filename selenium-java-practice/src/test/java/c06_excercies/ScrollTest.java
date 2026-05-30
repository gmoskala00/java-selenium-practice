package c06_excercies;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(Duration.ofSeconds(2));
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=1000");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		for (int i=0; i<values.size();i++) {
			sum +=  Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		String actualText = driver.findElement(By.className("totalAmount")).getText();
		int actualValue = Integer.parseInt(actualText.split(": ")[1].trim());
		
		Assert.assertEquals(actualValue, sum);
		
	}

}
