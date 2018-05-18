Feature: As a valid user when i enter my credentials, I should be able to login

  
  Scenario: As an user i should be able to login to the application
    Given I have a Firefox browser running
    And i go to orangehrmlive Website
    When I enter the username and valid password
    |Admin|admin|
    When I click the login Button
    Then I should see WelcomeAdmin
    And I click on Recruitment button
    Then I click on Add Button
    And I enter Firstname,Middlename,Lastname 
     |Pravin|Kumar|Sharma|
    And I enter Email
    |Pravin@gmail.com|
    Then I click  on saveButton
  

 