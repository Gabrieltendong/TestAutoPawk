Feature: access direct link

  @Bug_173_176
  Scenario: The button "Become a partner" returns an error 404
    Given navigate to affiliate program
    When click to button Become a partner
    Then user redirect 404 page error

  @Bug_193
  Scenario: The FAQ contact form returns an error
    Given From the affiliate page
    When Fill out the form "You have a question"
    Then see message error

  @Bug_202
  Scenario: The "yes" and "no" buttons do not work
    Given On the Customer FAQ page
    And Select the article
    And Scroll to the "Was this article helpful?"
    Then Click either on "Yes" or "No"

  @Bug_225
  Scenario:Redirection to an error page when closing the login form from the FAQ page
    Given From the FAQ page
    When Select "Returns and Refunds"
    And Choose I changed my mind, I no longer want my product (withdrawal)
    And Click on Subscribe
    Then Close the login form using the cross


