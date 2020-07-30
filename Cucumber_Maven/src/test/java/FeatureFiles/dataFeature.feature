Feature: Search on Google with Data

  Scenario Outline: Search Country
    Given Open Chrome and Open Google
    When I Search "<searchCountry>"
    Then I got "<countryInfo>" Information
    
    Examples: 
      | searchCountry	|	countryInfo	|
      |	USA						|	USA					|
