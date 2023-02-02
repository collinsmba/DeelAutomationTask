package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public RegistrationPage(WebDriver driver)


	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id=":ra:")
	WebElement firstName;
	
	@FindBy(id=":rb:")
	WebElement lastName;
	
	@FindBy(id=":rc:")
	WebElement email;
	
	@FindBy(id=":re:")
	WebElement password;
	
	@FindBy(css=".css-1afc88d")
	WebElement activeButton;
	
	
	
		
	public void registerUser(String firstUserName,String lastUserName,String userEmail,String userPassword) throws InterruptedException {
		firstName.sendKeys(firstUserName);
		lastName.sendKeys(lastUserName);
		email.sendKeys(userEmail);
		password.sendKeys(userPassword);
		WebElement Element = driver.findElement(By.cssSelector(".css-1afc88d"));

		js.executeScript("arguments[0].scrollIntoView();", Element);
				
		driver.findElement(By.cssSelector(".css-jh0nka")).click();
		
		Thread.sleep(2000);

		List<WebElement> allAboutUs=driver.findElements(By.cssSelector(".css-4vwa5l"));

		String allAbout="Employee/Contractor";

		for(WebElement el:allAboutUs) {

		if(el.getText().contains(allAbout)) {el.click();
		
		
		
		}
		
		}
		
		
		}
	}

	



