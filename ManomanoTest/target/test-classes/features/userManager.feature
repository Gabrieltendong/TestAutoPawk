Feature: user manager

  @Bug_204
  Scenario: Special characters accepted in the first and last name fields
    Given go to the login page
    And connect to account
    When click on My account settings
    And Go to My private information
    And Enter the underscore (_) and period (.) Characters in the Last name and First name fields
    Then Click on Validate