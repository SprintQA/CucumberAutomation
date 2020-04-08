Feature: Login functionality tests
  
  Here we will test all login related functionality
  We will not cover negative
  develper - Kamil
  Tested by - Chirag

  Scenario: Verify login successful with valid cred
    Given user open the website
    Then verify login page is displayed
    When user login with valid cred
    Then verify user is on homepage

