Feature: Search by keyword 2

  Scenario: Searching for a term 2
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"
