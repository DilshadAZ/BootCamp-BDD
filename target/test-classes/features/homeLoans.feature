@homeloans
Feature: Bank of America Home Loans for Guest User

  @smoke
  Scenario: Guest Home Mortgage Loans verification
    Given user is in the homePage
    And user clicks on home loans
    And user clicks on mortgage
    When user click apply now
    When user click i want to buy a home
    When user click yes, i am ready to apply
    
    When user will click no
    And user will click continue
    When user will enter his first name "Dilshad"
    And user enter his middle name "DAZ"
    And user enter his last name "Zannat"
    And user enter his suffix "Sr"
    And user enter his phone number "743090789"
    And user will select phone type
    And user enter his email address "shshsh@gmail.com"
    And user enter his street address "45 Southwest 9th Street"
    And user will select the address
    And user will select country "US"
    And user enter his SSN number "989121234"
    And user enter his date of birth "09132000"
    And user enter years in school "12"
    And user select marital status "Married"
    And user will click no in any dependents
    And user will click no in lendingOfficerCheckBox
    And user will click consentCheckBox
    And user will click save and continue
