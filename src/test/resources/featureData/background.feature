Feature: Flat 

Background: 
Given Browser should be open and url should be navigated
When user should be able to hover on login link
And user should be able to click on login button and navigate to the login page
And user should be able to enter valid credentails and click on next button
And user should be able to click on continue
And user should be logged in
When user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And user should be able to click on BudgetHomes and navigated to the BudgetHomesPage
And user should be click on the BHK link
And user should be click on the 1BHK link

Scenario: Validate that user is able to add flat to the shortlist
And user should be able to click on the like button
And user should be able to click on the Shortlist button
And user should be able to click on the View your Shortlisted Properties link
Then user should be able see the flat in Shortlist page


#Scenario: Validate that user able to remove the flat from the shortlist
#And user should be able to click on the Shortlist button
#And user should be able to click on the View your Shortlisted Properties link
#And user should be able to click on the wrong button and click on yes
#Then user should be able to remove the flat from the shortlist

Scenario: Validate that user is able to navigate the details of the flat page
And user should be able to click on the flat link
Then user should be able to navigate the details of the flat page
