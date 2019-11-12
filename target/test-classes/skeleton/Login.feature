Feature: Login test


Scenario: Login with valid test data

Given user launches ChromeBrowser And navigates to application url
When user enters username as "mercury" in username field
When user enters password as "mercury" in password field
And Click Signin
