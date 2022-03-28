Feature: Home Quote Validation

@home
Scenario Outline: Homeowners Insurance happy path
    Given user move cursor on Home tab
    When user click on Homeowners Insurance
    Then the title of the page 'AARP Homeowners Insurance Program From The Hartford' has 'homeTitle'
    When zipCode <zip> enter
    Examples: 
      | zip  	|anotheField|
      | 11417 |'value1'|
      | 10473 |'value2'|

  @tageBased1
Scenario: Renter insurance
    Given user move cursor on Home tab
    When user click on Homeowners Insurance
    Then the title of the page 'AARP Homeowners Insurance Program From The Hartford' has 'homeTitle'
    When zipCode 11423 enter