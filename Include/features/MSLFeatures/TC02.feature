
Feature: TC02

  Scenario Outline: MO State

    Given Get Group and TC data <GROUP> - <TC>
    When Launch MSL Application - NewQuote
    Then Enter PI InsBilling Info details - NewQuote
    Then Enter PI Policy Discount Coverages - NewQuote
    Then Enter Auto details - NewQuote
    Then Enter Auto details - NewQuoteTwo
    Then Enter Driver HH Member Details - NewQuote
    Then Enter Driver HH Member Details - NewQuoteTwo
    Then Enter Driver Assignment details - NewQuote
   	Then Enter Home Dwelling details - NewQuote
   	Then Enter Umbrella details - NewQuote
   	#Then Enter Other Info Auto details - NewQuote
   	Then Verify rate details - NewQuote


 

    Examples: 
      | GROUP | TC | 
      | MSL   | TC02 |