Feature: Details Of Flat

Scenario: Validate that user is able to click on flatName and navigate to the details of the flat page

Given Browser should be open and url should be navigated
#And user should be able to logged in
When user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And user should be able to click on BudgetHomes and navigated to the BudgetHomesPage
And user should be click on the BHK link
And user should be click on the 1BHK link
And user should be able to remove the HouseOrVilla type in PropertyType
And user should be able to click on the flat link
Then user should be able to navigate the details of the flat page