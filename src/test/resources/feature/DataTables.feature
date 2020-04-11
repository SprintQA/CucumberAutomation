Feature: Data tables feature

  Scenario: First Feature
    Given step without datatable
    Then step with single datatables
      | Tv      |
      | Mobile  |
      | Laptop  |
      | Watches |
    And step without datatable

  @multipleData
  Scenario: Multiple column
    Given step without datatable
    Then step with multiple column datatables
      | admin    | admin123 | true  | active   |
      | abc      | abc123   | true  | inactive |
      | xyz      | xyz123   | false | active   |
      | demouser | demopass | false | active   |
    And step without datatable

  @headerDataTable
  Scenario: Data table with header
    Given step without datatable
    Then step with header datatables
      | Product | Stock      |
      | Tv      | outOFStock |
      | Mobile  | outOFStock |
      | Laptop  | outOFStock |
      | Watches | inStock    |
    And step without datatable
