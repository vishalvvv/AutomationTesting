Feature: Adding one Employee
Scenario: Check after Employee added
Given application URL
Then check the title of the home page
When Title checks enter Username
Then Enter Password
And hit login button
Then mouseover in PIM
And click on Add Employee
Then move to the frame in add employee page