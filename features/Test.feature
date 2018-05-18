Feature: As I enter my crendintials, I should be able to login.

  Scenario: As a editor I should be able to login the application
    Given I have firefox browser running
    When I go to  the website
    And I have enter the valid username
    And I have enter the valid password
    When I click the login button
    Then I should see a logout button

    Scenario: As a editor I should be able to login the application
    Given I have firefox browser running
    When I go the website
    And I have enter the valid username
    And I have enter the valid password
    When I click the login button
    Then I should see a logout button
    
    Scenario: As a editor I should be able to login the application
    Given I have chrome browser running
    When I go the website
    And I have enter the valid username
    And I have enter the valid password
    When I click the login button
    Then I should see a logout button