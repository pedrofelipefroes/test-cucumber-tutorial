Feature: CucumberJava
  Scenario: Register functionality exists
    Given I have open the browser
    And I open QA Test website
    And Register button should exist
    When I click on the register button
    Then Register page should be displayed
    And Close browser

  Scenario: Register functionality its working
    Given I have open the browser
    And I open QA Test website
    When I click on the register button
    And Fill all the inputs
    And Submit the register
    Then Success Message should be displayed