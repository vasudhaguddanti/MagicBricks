Feature: BudgetMaxOption

Scenario Outline: Validate that the user is able to change the maxOption in Budget and navigate to that relavent Page

Given Browser should be open and url should be navigated
When user should be hover on location and click on BangloreLink
And user should be able to mouse hover on the Buy Link
And user should be able to click on BudgetHomes and navigated to the BudgetHomesPage
And user should be able to click on BudgetLink
And user should be able to select on the <Max value> in MaxOptions Dropdown
Then user should be navigate to that relavent Page

Examples:
    | Max value |
    | 1 |
    | 2 |
    | 3 |
    
    
    
    