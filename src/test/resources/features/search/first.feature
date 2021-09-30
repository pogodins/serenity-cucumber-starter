Feature: Search by keyword 1

  Scenario: Searching for a term 1
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"

  Scenario: Searching for a term 2
    Given Daria is researching things on the internet
    When she looks up "Tomato"
    Then she should see information about "Tomato"
