package c04_synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Synchronization1 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		String[] desiredProducts = {"Cucumber", "Brocolli", "Tomato"};
		addItems(driver, desiredProducts);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector(".cart-preview .action-block button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		//Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");
		
		String promoText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")))
				.getText();
		System.out.println(promoText);
		Assert.assertEquals(promoText, "Code applied ..!");
	
	}
	
	public static void addItems(WebDriver driver, String[] desiredProducts) {
		List<String> desiredProductsList = Arrays.asList(desiredProducts);		
		List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
		
		int counter = 0;
		for (int i = 0; i < productNames.size(); i++) {
			String name = productNames.get(i).getText();
			String extractedName = name.split("-")[0].trim();
			if(desiredProductsList.contains(extractedName)) {
				counter ++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
			if (counter == desiredProductsList.size()) {
				break;
			}
		}
	}

}
