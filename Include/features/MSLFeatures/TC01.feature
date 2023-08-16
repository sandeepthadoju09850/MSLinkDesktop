
Feature: TC01_WI
 
  Scenario Outline: WI State
  
    Given Get Group and TC data <GROUP> - <TC>
    When Launch MSL Application - NewQuote
    Then Enter PI InsBilling Info details - NewQuote
    Then Enter PI Policy Discount Coverages - NewQuote
    Then Enter Auto details - NewQuote
    Then Enter Driver HH Member Details - NewQuote    
    Then Enter Driver Assignment details - NewQuote
   	Then Enter Home Dwelling details - NewQuote
   	Then Enter Umbrella details - NewQuote   	
   	Then Verify rate details - NewQuote
   	Then Enter Home Dwelling details - NewQuoteRedo
   	Then Verify rate details - NewQuoteRedo
   

    Examples: 
      | GROUP | TC | 
      | MSL   | TC01 | 