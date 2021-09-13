import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstday {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Selenium\\Selenium server files latest\\Latest Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		((JavascriptExecutor) driver).executeScript("window.open('http://cricbuzz.com/')");
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 String handleName = tabs.get(0);
		 driver.switchTo().window(handleName);
		 driver.navigate().to("http://www.instagram.com/");
		 handleName = tabs.get(0);
		 driver.switchTo().window(handleName);
		 driver.navigate().to("http://www.cricbuzz.com/");
		 ((JavascriptExecutor) driver).executeScript("window.open('https://www.amazon.com/')");
		 driver.switchTo().window(tabs.get(0));
		 driver.get("https://www.zerodha.com/");
		 
		 
	}
} 
