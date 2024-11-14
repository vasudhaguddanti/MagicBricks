Feature: Add To ShortList

Scenario: Validate that the user is able to add flat to the shortList

Given Browser should be open and url should be navigated
And user should be able to logged in
When user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And user should be able to click on BudgetHomes and navigated to the BudgetHomesPage
And user should be click on the BHK link
And user should be click on the 1BHK link
And user should be able to click on the like button
And user should be able to click on the Shortlist button
And user should be able to click on the View your Shortlisted Properties link
Then user should be able see the flat in Shortlist page
