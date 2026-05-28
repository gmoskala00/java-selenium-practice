package c06_excercies;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		String month = "6";
		String day = "15";
		String year = "2027";
		String[] expectedList = {month, day , year};
		
		/* from course
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
		        .get(Integer.parseInt(monthNumber) - 1)
		        .click();
		
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		 */
		
		driver.findElement(By.name("month")).click();
		WebElement navigationButton = driver.findElement(By.className("react-calendar__navigation__label"));
		navigationButton.click();
		navigationButton.click();
		
		for (WebElement yearTile: driver.findElements(By.className("react-calendar__decade-view__years__year"))) {
			if (yearTile.getText().equals(year)){
				yearTile.click();
				break;
			}
		}
		
		int monthIndex = Integer.parseInt(month) -1;
		driver.findElements(By.className("react-calendar__year-view__months__month")).get(monthIndex).click();
		
		for (WebElement tile : driver.findElements(By.className("react-calendar__month-view__days__day"))) {
			String tileText = tile.findElement(By.tagName("abbr")).getText();
			if (tileText.equals(day)) {
				tile.click();
				break;
			}
		}
	
		
		List<WebElement> actualList = driver.findElements(By.className("react-date-picker__inputGroup__input"));
		for (int i=0; i<actualList.size();i++) {
			Assert.assertEquals(expectedList[i], actualList.get(i).getAttribute("value"));
			System.out.println(expectedList[i].equals(actualList.get(i).getAttribute("value")));
		}
	}

}
