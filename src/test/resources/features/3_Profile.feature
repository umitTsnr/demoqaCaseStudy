@profile @smoke

Feature:Testing the functions of the book store page

  Background:
    Given User navigates to books store page
    Then Verify that books store page is displayed
    And User clicks login button on books store page
    Then Verify that login page is displayed

  Scenario:User can add and delete single book on the profile page
    When User enters a valid username
    And User enters a valid password
    And User clicks login button on login page
    Then Verify that user logged in successfully
    And Click on the first product
    Then Verify that the detail page for the product is displayed
    And Click the button to add the product to your collection
    Then Verify that the product added alert is displayed
    And Click okey button on the alert
    And Click on profile title
    Then Verify that the profile page is displayed
    Then Verify that the selected product has been added to your collection
    And User deletes product from the collection
    And User clicks ok button on the popup window
    Then Verify that book deleted Alert message is displayed
    And User clicks ok button on the alert
    Then Verify that all books are remove from the collection

  @wip
  Scenario:User can add and delete multiple books on the profile page
    When User enters a valid username
    And User enters a valid password
    And User clicks login button on login page
    Then Verify that user logged in successfully
    And Click on the first product
    Then Verify that the detail page for the product is displayed
    And Click the button to add the product to your collection
    Then Verify that the product added alert is displayed
    And Click okey button on the alert
    And User navigates to books store page
    And Click on the second product
    And Click the button to add the product to your collection
    Then Verify that the product added alert is displayed
    And Click okey button on the alert
    And Click on profile title
    Then Verify that the profile page is displayed
    #Then Verify that the selected product has been added to your collection
    And User deletes all product from the collection
    And User clicks ok button on the popup window
    Then Verify that all books deleted Alert message is displayed
    And User clicks ok button on the alert
    Then Verify that all books are remove from the collection


  Scenario:User can delete books from collection
    When User enters a valid username
    And User enters a valid password
    And User clicks login button on login page
    Then Verify that user logged in successfully
    And Click on a product of your choice
    Then Verify that the detail page for the product is displayed
    And Click the button to add the product to your collection
    Then Verify that the product added popup is displayed
    And Click on the okey button in the popup
    And Click on profile title
    Then Verify that the profile page is displayed
    Then Verify that the selected product has been added to your collection

  Scenario:User can change row number on profile page
    When User enters a valid username
    And User enters a valid password
    And User clicks login button on login page
    Then Verify that user logged in successfully
    And Scroll down the page to the profile section
    And Click on profile title
    Then Verify that the profile page is displayed
    Then Verify that 5 rows are displayed on the page
    And Click on the row per page icon
    And Click on the ten rows title
    And Scroll down the page until the row per page icon
    Then Verify that 10 rows are displayed on the page
    And Click on the row per page icon
    And Click on the twenty rows title
    And Scroll down the page until the row per page icon
    Then Verify that 20 rows are displayed on the page
    And Click on the row per page icon
    And Click on the fifty rows title
    And Scroll down the page until the row per page icon
    Then Verify that 50 rows are displayed on the page
    And Click on the row per page icon
    And Click on the five rows title
    And Scroll down the page until the row per page icon
    Then Verify that 5 rows are displayed on the page






