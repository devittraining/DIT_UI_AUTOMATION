Feature: Search on Google

  Scenario: Search India
    Given Open Chrome and Open Google
    When I Search India
    Then I got India Information
    
  Scenario: Search Canada
    Given Open Chrome and Open Google
    When I Search Canada
    Then I got Canada Information    