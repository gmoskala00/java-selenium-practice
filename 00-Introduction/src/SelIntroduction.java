import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
	
		// Chrome launch
		System.setProperty("webdriver.chrome.driver", "C:/Users/moska/OneDrive/Dokumenty/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Firefox launch
		// webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver", "C:/Users/moska/OneDrive/Dokumenty/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		// Microsoft Edge driver
		//System.setProperty("webdriver.edge.driver", "C:/Users/moska/OneDrive/Dokumenty/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());	
		driver.quit();
		
	}

}
