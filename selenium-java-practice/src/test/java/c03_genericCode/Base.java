package c03_genericCode;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		String[] desiredProducts = {"Cucumber", "Brocolli", "Tomato"};
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
