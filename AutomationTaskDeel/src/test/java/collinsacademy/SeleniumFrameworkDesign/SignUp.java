package collinsacademy.SeleniumFrameworkDesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp {
@Test
	public void contractRegistration() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\src\\main\\java\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.get("https://www-dev-l82lynmk07.deel.training/login");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
						
		driver.findElement(By.xpath("//div[text()='Sign Up']")).click();
		
		driver.findElement(By.xpath("//span[text()='I’m A Contractor']")).click();
		
		driver.findElement(By.cssSelector(".css-1afc88d")).click();
		
		driver.findElement(By.id(":ra:")).sendKeys("paul");
		
		driver.findElement(By.id(":rb:")).sendKeys("Charles");
		
		driver.findElement(By.id(":rc:")).sendKeys("gonnke202@gmail.com");
		
		driver.findElement(By.id(":re:")).sendKeys("Bonnke@20220");
		
		WebElement Element = driver.findElement(By.cssSelector(".css-1afc88d"));

		js.executeScript("arguments[0].scrollIntoView();", Element);
				
		driver.findElement(By.cssSelector(".css-jh0nka")).click();
		
		List<WebElement> allAboutUs=driver.findElements(By.cssSelector(".css-4vwa5l"));

		String allAbout="Employee/Contractor";

		for(WebElement el:allAboutUs) {

		if(el.getText().contains(allAbout)) {el.click();
		
		}
		
		Assert.assertTrue(driver.findElement(By.cssSelector(".css-1afc88d")).isEnabled());
		
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		


