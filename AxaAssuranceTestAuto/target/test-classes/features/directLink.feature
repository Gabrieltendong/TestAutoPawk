Feature: Direct link to the pages

#  Scenario: Redirection to another page
#    Given go to home trade insurance
#    When Click on Discover more products
#    Then verify link equipment rental
#
#  Scenario: Banner image not loaded
#    Given go to home retirement insurance
#    Then image banner not load
#
#  Scenario: Page Make a simulation not found
#    Given go to Home page mortgage insurance
#    Then verify link do a simulation
#
#  Scenario: Inconsistency in simulation and personal loan information
#    Given go to home page Personal loan
#    When Click on Make a simulation
#    Then Compare personal loan price page personal loan on simalation page
#
#  Scenario: file not found
#    Given go to stock Exchange page
#    When Scroll down to the Useful documents section and click on Conflict of interest prevention and management policy
#
#  Scenario: Non-functional links
#    Given go to advice page
#    When Click on the links on the right under Theme
#
#  Scenario Outline: image card not load
#    When user open <page>
#    Then image header not load
#
#    Examples:
#    |page|
#    |https://www.axa.fr/epargne-retraite/actualites.html|
#
#  Scenario: link pro not found
#    Given go to contact page
#    When Click on By making an appointment with an advisor
#    Then Click on Professionals in the footer

  Scenario: Simulation naming problem
    Given go to credit simulator page
    When Click on the plus + to create a new simulation
    And Delete simulation n ° 1
    Then Create two new simulations and compare name