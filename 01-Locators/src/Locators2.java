import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		String name = "Grzegorz";		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		
		String welcomeText = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		System.out.println(welcomeText);
		Assert.assertEquals(welcomeText, "Hello " + name + ",");
		
		String logInText = driver.findElement(By.tagName("p")).getText();
		System.out.println(logInText);
		
		Assert.assertEquals(logInText, "You are successfully logged in.");
		
		driver.findElement(By.xpath("//*[text()='Log Out']"));
		driver.close();
		

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String text = driver.findElement(By.cssSelector("form p[class=infoMsg]")).getText();
		System.out.println(driver.findElement(By.cssSelector("form p[class=infoMsg]")).getText());
		
		String password = text.substring(text.indexOf("'") +1, text.indexOf("'", text.indexOf("'")+1));
//		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
//		Thread.sleep(1000);
		
		// course solution: String password2 = text.split("'")[1];
		return password;
		

	}

}
