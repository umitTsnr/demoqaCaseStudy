@login @smoke

Feature:Testing the functions of the login page

  Background:
    Given User navigates to books store page
    Then Verify that books store page is displayed
    And User clicks login button on books store page
    Then Verify that login page is displayed


  Scenario:User logs in successfully with valid credentials
    When User enters a valid username
    And User enters a valid password
    And User clicks login button on login page
    Then Verify that user logged in successfully

  Scenario:User logs out successfully
    When User enters a valid username
    And User enters a valid password
    And User clicks login button on login page
    Then Verify that user logged in successfully
    And User clicks logout button on books store page
    Then Verify that the user logged out successfully

  Scenario Outline: User can not log in with invalid credentials
    When Enter an invalid "<username>" in the username input box
    And Enter an invalid "<password>" in the password input box
    And User clicks login button on login page
    Then Verify that the user cannot log in

    Examples:
      | username    | password |
      | abcdef      | Test!!10 |
      | qa_engineer | 123456   |
      | <>*+$@      | AAbb1122 |
      | aa bb cc    | 11 22 33 |

  @wip
  Scenario Outline: User can not log in with empty credentials
    When Enter an invalid "<username>" in the username input box
    And Enter an invalid "<password>" in the password input box
    And User clicks login button on login page
    Then Verify that the user cannot log in with empty credentials

    Examples:
      | username    | password |
      |             | Test!!10 |
      | qa_engineer |          |
      |             |          |






















