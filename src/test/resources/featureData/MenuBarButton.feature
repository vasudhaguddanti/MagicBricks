Feature: MenuBar

Scenario: Validate that the user is able to click on the Sales Enquiry in BudgetHomes Page
 
Given Browser should be open and url should be navigated
When user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And user should be click on Flat in Banglore and navigated to the FlatInBanglorePage
And user should be click on MenuBarIcon 
And user should be able to click on help link
And user should be able click on sales Enquiry
Then sales Enquiry Page should be displayed


