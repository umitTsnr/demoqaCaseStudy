package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import pages.Book_Store_Page;
import pages.Login_Page;
import utilities.Browser_Utils;
import utilities.Config_Reader;
import utilities.Driver;


public class Book_Store_Steps {

    Book_Store_Page bookStorePage = new Book_Store_Page();

    @Given("User navigates to books store page")
    public void user_navigates_to_books_store_page() {

        bookStorePage.navigateToBooksStorePage();
    }


    @Then("Verify that books store page is displayed")
    public void verify_that_books_store_page_is_displayed() {

        Browser_Utils.verifyURL(Config_Reader.get("url"));
    }

    @And("User clicks login button on books store page")
    public void user_clicks_login_button_on_books_store_page() {

        Browser_Utils.waitForVisibility(bookStorePage.loginButton, 10);
        Browser_Utils.clickOnElement(bookStorePage.loginButton);
    }

    @Then("Verify that user logged in successfully")
    public void verify_that_user_logged_in_successfully() {

        Browser_Utils.waitForVisibility(bookStorePage.userName,10);
        Assert.assertEquals(Config_Reader.get("userName"), bookStorePage.userName.getText());
        Browser_Utils.waitForVisibility(bookStorePage.logOutButton,10);
        Assert.assertEquals("Log out", bookStorePage.logOutButton.getText());
        Browser_Utils.waitFor(2);
    }


    @And("User clicks logout button on books store page")
    public void user_clicks_logout_button_on_books_store_page() {

        Browser_Utils.waitForVisibility(bookStorePage.logOutButton, 10);
        Browser_Utils.clickOnElement(bookStorePage.logOutButton);
    }


    @Then("User enters java text in the search bar")
    public void user_enters_java_text_in_the_search_bar() {

        Browser_Utils.clickAndSendText(bookStorePage.searchBox, "java");
        Browser_Utils.waitFor(2);
    }


    @Then("Verify that the search results match the java text entered")
    public void verify_that_the_search_results_match_the_java_text_entered() {

        Assert.assertTrue(bookStorePage.verifySearchResults("java"));
    }


    @Then("Delete text in search bar")
    public void delete_text_in_search_bar() {

        bookStorePage.searchBoxClear(bookStorePage.searchBox);
    }


    @Then("User enters design text in the search bar")
    public void user_enters_design_text_in_the_search_bar() {

        Browser_Utils.clickAndSendText(bookStorePage.searchBox, "Design");
        Browser_Utils.waitFor(2);

    }


    @Then("Verify that the search results match the design text entered")
    public void verify_that_the_search_results_match_the_design_text_entered() {

        Assert.assertTrue(bookStorePage.verifySearchResults("Design"));
    }

    @Then("User enters test text in the search bar")
    public void user_enters_test_text_in_the_search_bar() {

        Browser_Utils.clickAndSendText(bookStorePage.searchBox, "test");
        Browser_Utils.waitFor(2);
    }


    @Then("Verify that irrelevant searches match no results")
    public void verify_that_irrelevant_searches_match_no_results() {

        Assert.assertTrue(Browser_Utils.isElementPresent(bookStorePage.noRowsFoundTitle,10));
    }


    @And("Click on the first product")
    public void clickOnTheFirstProduct() {

        Browser_Utils.clickOnElement(bookStorePage.product1);
        Browser_Utils.waitFor(2);
    }

    @Then("Verify that the detail page for the product is displayed")
    public void verifyThatTheDetailPageForTheProductIsDisplayed() {

        Browser_Utils.verifyURL("https://demoqa.com/books?book=9781449325862");
        System.out.println("xxx");
        Browser_Utils.waitFor(2);
    }


    @And("Click the button to add the product to your collection")
    public void clickTheButtonToAddTheProductToYourCollection() {

        Browser_Utils.scrollToElement(Driver.getDriver().findElement(By.xpath("//button[.='Add To Your Collection']")));
        Browser_Utils.clickOnElement(Driver.getDriver().findElement(By.xpath("//button[.='Add To Your Collection']")));
        Browser_Utils.waitFor(2);
    }


    @Then("Verify that the product added alert is displayed")
    public void verifyThatTheProductAddedAlertIsDisplayed() {

        Browser_Utils.waitFor(2);
        Alert alert = Driver.getDriver().switchTo().alert();
        Assert.assertEquals("Book added to your collection.", alert.getText());
    }

    @And("Click okey button on the alert")
    public void clickOkeyButtonOnTheAlert() {

        Driver.getDriver().switchTo().alert().accept();
    }

    @And("Click on the second product")
    public void clickOnTheSecondProduct() {

        Browser_Utils.clickOnElement(bookStorePage.product2);
    }
}