package c05_actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String email = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
	}

}
