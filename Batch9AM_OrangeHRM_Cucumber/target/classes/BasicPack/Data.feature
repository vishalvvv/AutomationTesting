Feature: Checking Title after login 

Scenario: Validate the title after Login

Given User gives application URL
Then check the title of the home page
Then Enter username
And Enter Password
When after enter username and password and click on login button
Then check the title after login title
