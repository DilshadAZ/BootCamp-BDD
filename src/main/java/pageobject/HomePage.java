package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.* ;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Home Loans']//parent::a[@id='navHomeLoans']")
	WebElement homeLoans;
	@FindBy(linkText = "Mortgage")
	WebElement mortage;

	public void clickHomeLoan() {

		click(homeLoans);
	}
	public void clickMOrtgage() {

		click(mortage);
}}