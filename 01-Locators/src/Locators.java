import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// Chrome launch
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		WebElement input = driver.findElement(By.id("inputUsername"));
		input.sendKeys("test@test.pl");
		WebElement passwordInput = driver.findElement(By.name("inputPassword"));
		passwordInput.sendKeys("TEST");
		WebElement button = driver.findElement(By.className("signInBtn"));
		button.click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@test.pl");
		driver.findElement(By.xpath("//div[@class='form-container sign-up-container']//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("123456789");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String text = driver.findElement(By.cssSelector("form p[class=infoMsg]")).getText();
		System.out.println(driver.findElement(By.cssSelector("form p[class=infoMsg]")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		//driver.quit();

	}

}
