Feature: user profil

  Scenario Outline: Unable to validate the modification
    Given user in the home page
    When Log into your account <email> and <password>
    And Click on the account icon
    And Click on My information
    And Complete the form (first name; last name, nickname & date of birth, telephone & profession)
    And Supprimer tous les champs optionnels
    Then save information

    Examples:
    |email | password|
    |ArnouDavid@rhyta.com|Arnoudavid@1|

