package c02_dropdowns;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int adultsCounter = Integer.parseInt(driver.findElement(By.id("spanAudlt")).getText());
		while (adultsCounter<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			adultsCounter++;
		}
		
//		or
//		for(int i=0; i<4;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
