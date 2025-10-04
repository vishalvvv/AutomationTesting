Feature:Adding product data
Scenario:validating product data after adding
Given user gives application URL
Then check the title of home page
When user enters vehicle data
And clicks on next button to go to insurant data page
And user enters the insurant details
And clicks on next button to go to product data page
Then the product data page title should be displayed correctly
And user enters the product details
And clicks on the next button
