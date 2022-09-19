Feature: Feature to Calculator functionality


  Scenario: Dot button
    Given User Launch ChromeBrowser
    When User Open URL "https://www.online-calculator.com/full-screen-calculator/"
    Then The displayer should show  zero.
    
  
  Scenario: One divide by x button
    Given User Launch ChromeBrowser
    When User Open URL "https://www.online-calculator.com/full-screen-calculator/"
    And user click One divide by x button
    Then The displayer should show Error . 
    

  Scenario: Check if CE result the diplay back to zero
    Given User Launch ChromeBrowser
    When User Open URL "https://www.online-calculator.com/full-screen-calculator/"
    And User click three buttton
    And User click CE button
    Then The displayer should shows zero


  Scenario: Add two numbers
    Given User Launch ChromeBrowser
    When User Open URL "https://www.online-calculator.com/full-screen-calculator/"
    And User click three button
    And User click addition button
    And User click one button
    And User click equal button
    Then The displayer should shown four
 
    
   
   Scenario Outline: Subtract two numbers
    Given User Launch ChromeBrowser
    When User Open URL "https://www.online-calculator.com/full-screen-calculator/"
    And User click three button
    And User click substraction button
    And User click one button
    And User click equal button
    Then The displayer should shown two