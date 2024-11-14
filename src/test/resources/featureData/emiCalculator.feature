Feature: EMI Calculator

Scenario: Validate that the user able to Calculate the Emi

Given Browser should be open and url should be navigated
When user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And user should be able to click on Premium Homes Link and navigate to the premium homes Page
And user should be able to mouse hover on HomeLoans Link
And user should be able to click on the SBIHomeLoanEMICalculator Link and navigate to the SBIHomeLoanEMICalculator Page
And user should be able to change the LoanTenure Years
Then user should be click on RecalculateYourEMI button and calculate EMI amount


