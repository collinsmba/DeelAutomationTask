package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeelContractor {
	
	WebDriver driver;

	public DeelContractor(WebDriver driver)


	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//span[text()='I’m A Contractor']")
	WebElement contractor;
	
	@FindBy(css=".css-1afc88d")
	WebElement next;
		
	public void clickContractor() {
		contractor.click();

	}
	
	public void clickNext() {
		next.click();

	}

}
