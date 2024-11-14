Feature: Manage calls/Alerts

Background:

Given Browser should be open and url should be navigated
When user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And user should be click on Flat in Banglore and navigated to the FlatInBanglorePage
And user should be click on MenuBarIcon 
And user should be able to click on help link


Scenario: Validate that the user should be able to see the Manage Calls/Alerts answers

And user should be clicks on the Help Center link and navigates to the Help Center page
And user should be clicks on the Explore More link
And user should be clicks on the Manage CallsandAlerts link
Then user should be able to click on the questions and view the answers


Scenario: Validate that the user able to navigate the terms and conditions from Sales Enquiry Page

And user should be able click on sales Enquiry and sales Enquiry Page should be displayed
And user should be able to click on Terms and Conditions
Then user should be able to navigate to the terms and conditions page
