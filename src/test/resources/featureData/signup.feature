Feature: To SignUp

Scenario: Validate that the user can sign in to the application

Given Browser should be open and url should be navigated
When user should be able to hover on login link
And Click on main sign up link
And Enter the valid credentials
And Click on sign up button
And Enter the otp that is generated to the mobile number given
Then Click on continue button and user should be signed in