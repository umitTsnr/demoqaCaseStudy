@bookStore @smoke

Feature:Testing the functions of the book store page

  Background:
    Given User navigates to books store page
    Then Verify that books store page is displayed
    And User clicks login button on books store page
    Then Verify that login page is displayed


  Scenario:User searches and lists search results accurately
    When User enters a valid username
    And User enters a valid password
    And User clicks login button on login page
    Then Verify that user logged in successfully
    And User enters java text in the search bar
    Then Verify that the search results match the java text entered
    And Delete text in search bar
    And User enters design text in the search bar
    Then Verify that the search results match the design text entered
  @wip
  Scenario:Irrelevant search results are not listed
    When User enters a valid username
    And User enters a valid password
    And User clicks login button on login page
    Then Verify that user logged in successfully
    And User enters test text in the search bar
    Then Verify that irrelevant searches match no results







