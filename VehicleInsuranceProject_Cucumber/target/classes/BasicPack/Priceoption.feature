Feature:Select price option
Scenario:check whether the correct price is displayed
Given User gives application URL
Then the home page title should be displayed correctly
    When user enters vehicle data
    And clicks on next button to go to insurant data page
    And user enters the insurant details
    And clicks on next button to go to product data page
    And user enters the product details
    And clicks on next button to go to price option page
    Then the price option page should display the available prices correctly
    And clicks on the next button