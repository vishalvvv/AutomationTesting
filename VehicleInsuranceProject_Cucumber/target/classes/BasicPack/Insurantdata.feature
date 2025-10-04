Feature: Adding insurant data

  Scenario: Validating insurant data
    Given user opens the application URL
    Then the home page title should be displayed correctly
    When user enters vehicle data
    And clicks on next button to go to insurant data page
    Then the insurant data page title should be displayed correctly
    And user enters the insurant details
    And clicks on the next button
