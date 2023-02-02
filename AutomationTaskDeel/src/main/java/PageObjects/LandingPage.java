package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
WebDriver driver;

public LandingPage(WebDriver driver)


{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath="//div[text()='Sign Up']")
WebElement signUp;
	
public DeelContractor clickSignUpButton() {
	signUp.click();
	DeelContractor deelContractor = new DeelContractor(driver);
	return deelContractor;
}

}
