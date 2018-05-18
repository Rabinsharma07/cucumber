
Feature: As I enter my crendintials, I should be able to login.

  Scenario: As a editor I should be able to login the application
    Given I have Chrome browser running
    When I go to the website
    And I enter the valid username
    And I enter the valid password
    When I click the login
    Then I see a logout button
    
    
 

  