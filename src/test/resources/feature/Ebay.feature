Feature: ebay testing

  Scenario Outline: Test Ebay
    Given user open ebay website
    When user search with keyword "<Product>"
    And click on search button

    Examples: 
      | Product |
      | TV      |
      | Mobile  |
