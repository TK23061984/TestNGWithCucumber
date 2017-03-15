#Author:Thangakumar
#Sample Feature Definition Template
@checkout
Feature: Test cases for checkout functionality

  Scenario Outline: Verify checkout
    Given the user browses the site <site>
    When the user searches for <product>
    Then the current page will be the search result page
    When the user adds the first product in the search result to the cart
    Then the shopping cart has the added product

    Examples: 
      | site       | product |
      | amazon.com | watch   |
      | amazon.com | soap    |
