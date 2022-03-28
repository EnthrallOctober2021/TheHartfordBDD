Feature: Auto Quote validation

Background: Initiate driver
# Given some common steps for all below scenarios/ scenario outline

@auto
  Scenario: Quote for a new Car Insurance
  	Given the title of the page 'Business, Home & Car Insurance Quotes | The Hartford Insurance' has 'auto'
    When user move cursor onto Auto tab
    Then title 'AUTO INSURANCE SOLUTIONS' menu opened
