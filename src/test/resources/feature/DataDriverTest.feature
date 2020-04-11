Feature: Login functionality tests
  
  Here we will test all login related functionality
  We will not cover negative
  develper - Kamil
  Tested by - Chirag

  Background: 
    Given user open the website
    Then verify login page is displayed

  @negative @regression @chirag @datadriven
  Scenario Outline: Verify login unsuccessful with invalid cred
    When user login with username "<Username>" and password "<Password>"
    Then verify login is unsuccessful
    Then verify login page is displayed

    Examples: 
      | Username         | Password         |
      | valid.username   | invalid.password |
      | invalid.username | valid.password   |
      | invalid.username | invalid.password |
