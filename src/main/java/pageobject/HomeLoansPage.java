package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;
import static common.CommonActions.keyPress;
import static common.CommonActions.pause;
import static common.CommonActions.selectByVal;

import base.TestBaseClass;

public class HomeLoansPage extends TestBaseClass {
	public HomeLoansPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "applyNow")
	WebElement applyNow;
	@FindBy(id = "dmaFlowButton")
	WebElement iWantToBuyHome;
	@FindBy(id = "propertyContractYes")
	WebElement iAmReadyToApply;

	@FindBy(xpath = "//label[@for='isBofaCustomer-no']") // xpath =
															// "//input[@id='isBofaCustomer-no']/parent::div[@class='spa-input-options-wrapper']")
	WebElement no;
	@FindBy(id = "signInContinueButton")
	WebElement continueButton;
	@FindBy(xpath = "//input[@class='first-name-field spa-input-text']")
	WebElement firstNamee;
	@FindBy(id = "middleName")
	WebElement middleNamee;
	@FindBy(id = "lastName")
	WebElement lastNamee;
	@FindBy(id = "suffix")
	WebElement selectSuffix;
	@FindBy(xpath = "//option[text()='Sr']")
	WebElement selectSr;
	@FindBy(id = "phoneNumber")
	WebElement phoneNumberr;
	@FindBy(id = "phoneNumber_errorMessage")
	WebElement phoneErrorMessage;

	@FindBy(id = "phoneType")
	WebElement selectPhoneType;
//	@FindBy(xpath = "//option[text()='Mobile']")
//	WebElement mobile;
	@FindBy(id = "email")
	WebElement eMail;

	@FindBy(id = "locationField")
	WebElement locationFieldElement;
	@FindBy (id="countryOfResidence")
	WebElement residenceCountry;

	@FindBy(id = "ssn")
	WebElement ssnSelect;
	@FindBy(id = "dob")
	WebElement dateOfBirth;
	@FindBy(id = "yearsInSchool")
	WebElement yearInSchool;
	@FindBy(xpath = "//option[text()='18']")
	WebElement select18;
	@FindBy(id = "maritalStatus")
	WebElement maritalStatus;
	@FindBy(xpath = "//option[text()='Married']")
	WebElement married;
	@FindBy(id = "haveDependentsNo")
	WebElement dependenciesNo;
	@FindBy(id = "isMLOExistNo")
	WebElement leaderOfficerCheckBox;
	@FindBy(id = "consentToContact")
	WebElement consentCheckBox;
	@FindBy(id = "personalInformationContinueButton")
	WebElement saveAndContinue;

	public void applyNow() {
		click(applyNow);
	}

	public void IWantToBuyAHome() {
		click(iWantToBuyHome);
	}

	public void iAmReadyToApply() {
		click(iAmReadyToApply);
	}

	public void clickNo() {

		click(no);
	}

	public void clickContinue() {
		click(continueButton);
	}

	public void inputFirstName() {
		input(firstNamee, "Dilshad");
	}

	public void inputMiddleName() {
		input(middleNamee, "A");
	}

	public void inputLastName() {
		input(lastNamee, "Zannat");
	}

	public void selectSuffix() {
		click(selectSuffix);
	}

	public void selectSuffixSr() {
		click(selectSr);
	}
	public void phoneNumber() {
		input(phoneNumberr, "743090789");
	}
	public void phoneType() {
		selectByValue(selectPhoneType, "CellularPhone");
}
	public void emailAdress() {
		input(eMail, "shshsh@gmail.com");
	}
public void streetAddress() {
	input(locationFieldElement, "45 Southwest 9th Street");
	
}
public void selectAddress() {
	keyPress("down", locationFieldElement);
	keyPress("enter", locationFieldElement);
		
	}
public void countrySelection() {
	selectByValue(residenceCountry, "US");
}
public void ssnNumber() {
	input(ssnSelect, "989121234");
	
}
public void dateOfBirth() {
	input(dateOfBirth, "09132000");
	
}
public void schoolYear() {
	selectByValue(yearInSchool, "12");
}

public void maritalStatus() {
	
	selectByValue(maritalStatus, "Married");
}
public void dependencies() {
	click(dependenciesNo);
	
}
public void lendingOfficerCheckBox() {
	
	click(leaderOfficerCheckBox);
	
}
public void consent() {

	click(consentCheckBox);
	
}
public void saveAndContinue() {
	click(saveAndContinue);
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}