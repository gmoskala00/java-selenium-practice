package c06_excercies;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		System.out.println(driver.findElements(By.cssSelector("#gf-BIG a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement firstColumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> linkElements =  firstColumnDriver.findElements(By.tagName("a"));
		
		for(int i=1; i<linkElements.size();i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			linkElements.get(i).sendKeys(clickOnLinkTab);
		}
		
		Thread.sleep(Duration.ofSeconds(5));
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
