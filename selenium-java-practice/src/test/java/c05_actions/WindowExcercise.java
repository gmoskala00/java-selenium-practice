package c05_actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExcercise {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div#content div.example a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector("div#content div.example h3")).getText());

	}

}
