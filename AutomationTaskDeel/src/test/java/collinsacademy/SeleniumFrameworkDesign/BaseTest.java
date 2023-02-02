package collinsacademy.SeleniumFrameworkDesign;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver driver;
	
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\main\\java\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.get("https://www-dev-l82lynmk07.deel.training/login");
		
		driver.manage().window().maximize();
	}

}
