Feature: Login functionality tests
  
  Here we will test all login related functionality
  We will not cover negative
  develper - Kamil
  Tested by - Chirag

  Background: 
    Given user open the website
    Then verify login page is displayed

  @positive @smoke @wip @kamil
  Scenario: Verify login successful with valid cred
    When user login with valid cred
    Then verify user is on homepage

  @negative @regression @chirag
  Scenario: Verify login unsuccessful with invalid cred
    When user login with invalid cred
    Then verify login is unsuccessful
    Then verify login page is displayed
