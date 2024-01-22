package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.interactions.Pause;

import base.TestBaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static common.CommonAction.*;

public class HomeLoansStepDef extends TestBaseClass {

	@Given("user is in the homePage")
	public void user_is_in_the_homepage() {
		Assert.assertEquals(driver.getTitle(), "Bank of America - Banking, Credit Cards, Loans and Merrill Investing");
	}

	@Given("user clicks on home loans")
	public void user_clicks_on_home_loans() {
		homepage.clickHomeLoan();
	}

	@Given("user clicks on mortgage")
	public void user_clicks_on_mortgage() {
		homepage.clickMOrtgage();
	}

	@When("user click apply now")
	public void user_click_apply_now() {
		homeloanspage.applyNow();
	}

	@When("user click i want to buy a home")
	public void user_click_i_want_to_buy_a_home() {
		homeloanspage.IWantToBuyAHome();
	}

	@When("user click yes, i am ready to apply")
	public void userClickYesIAmReadyToApply() {
		homeloanspage.iAmReadyToApply();

	}

	@When("user will click no")
	public void user_will_click_no() {
		pause(3);
		homeloanspage.clickNo();
		pause(3);

	}

	@When("user will click continue")
	public void user_will_click_continue() {
		pause(3);
		homeloanspage.clickContinue();
		
	}
	@When("user will enter his first name {string}")
	public void userWillEnterHisFirstName(String string) {
		homeloanspage.inputFirstName();
	}

	@When("user enter his middle name {string}")
	public void userEnterHisMiddleName(String string) {
		homeloanspage.inputMiddleName();
	}

	@When("user enter his last name {string}")
	public void userEnterHisLastName(String string) {
		homeloanspage.inputLastName();
	}

	@When("user enter his suffix {string}")
	public void userEnterHisSuffix(String string) {
		homeloanspage.selectSuffix();
	}

	@When("user enter his phone number {string}")
	public void userEnterHisPhoneNumber(String string) {
		homeloanspage.phoneNumber();
	}

	@When("user will select phone type")
	public void userWillSelectPhoneType() {
		homeloanspage.phoneType();
	}

	@When("user enter his email address {string}")
	public void userEnterHisEmailAddress(String string) {
		homeloanspage.emailAdress();
	}

	@When("user enter his street address {string}")
	public void userEnterHisStreetAddress(String string) {
		homeloanspage.streetAddress();
	}
	@When("user will select the address")
	public void userWillSelectTheAddress() {
		homeloanspage.selectAddress();
	}


	@When("user will select country {string}")
	public void userWillSelectCountry(String string) {
		homeloanspage.countrySelection();
	}

	@When("user enter his SSN number {string}")
	public void userEnterHisSSNNumber(String string) {
		homeloanspage.ssnNumber();
	}

	@When("user enter his date of birth {string}")
	public void userEnterHisDateOfBirth(String string) {
		homeloanspage.dateOfBirth();
	}

	@When("user enter years in school {string}")
	public void userEnterYearsInSchool(String string) {
		homeloanspage.schoolYear();
	}

	@When("user select marital status {string}")
	public void userSelectMaritalStatus(String string) {
		homeloanspage.maritalStatus();
	}

	@When("user will click no in any dependents")
	public void userWillClickNoInAnyDependents() {
		homeloanspage.dependencies();
	}

	@When("user will click no in lendingOfficerCheckBox")
	public void userWillClickNoInLeaderOfficerCheckBox() {
		homeloanspage.lendingOfficerCheckBox();
	}

	@When("user will click consentCheckBox")
	public void userWillClickConsentCheckBox() {
		homeloanspage.consent();
	}

	@When("user will click save and continue")
	public void userWillClickSaveAndContinue() {
		homeloanspage.saveAndContinue();
	}
}
