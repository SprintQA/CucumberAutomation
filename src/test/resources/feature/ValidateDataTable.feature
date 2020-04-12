Feature: Validate data table

  Scenario: Validate data table in website
    Given user opens demo website
    Then verify table data in website
      | 1 | markino   | Zieko   | Samuels   |
      | 2 | jacobs    | Daniel  | Karano    |
      | 3 | larrypt   | Brigade | Swarroon  |
      | 4 | mikesali  | Byron   | Kathaniko |
      | 5 | chrisford | Rajano  | Dimarison |
