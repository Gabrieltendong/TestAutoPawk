Feature: retest automation

  @Bug_1283
  Scenario: Information link for "ORGANIZING A PROFESSIONAL AND BUSINESS TOURISM EVENT" returns a 403 error
    Given user in the home page
    And Click on the Service tab in the footer
    And Click on Contact us
    When In the Other contacts section under 'ORGANIZE A PROFESSIONAL AND BUSINESS TOURISM EVENT', click on the second 'click here'
    Then see the page 403

  @Bug_1118
  Scenario: The connection link to pay for your stay in several installments refers to an error page
    Given user in the home page
    And Click on "See all the advantages" in the "Book your stay with confidence" section
    And Click on the "Find out more" button in the "Pay in several installments, free of charge" section
    When In "Payment of the balance" under "On your Disney account: easy!" click on "Connect" or on "Create your own now!"
    Then see message error

  @Bug_1074
  Scenario: Harmonize behaviors
    Given user in the home page disney.fr
    When click in the link social network
    Then link does not redirect directly to the social network page

  @Bug_1051
  Scenario: Overlapping menu bar and page title
    Given user in the home page disney
    When In the footer, click on Privacy rules
    Then see Overlapping menu bar and page title

#  @Bug_1097
#  Scenario: Error when sending the contact form
#    Given user in the home page
#    When Click on Company Information in the About section of the footer
#    And Click on contact
#    Then Fill in the form and send

