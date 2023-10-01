package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Login_Page;
import pages.Profile_Page;
import utilities.Browser_Utils;
import utilities.Config_Reader;
import utilities.Driver;


public class Profile_Steps {

    Profile_Page profilePage = new Profile_Page();


    @Then("Scroll down the page to the profile section")
    public void scroll_down_the_page_to_the_profile_section() {

        Browser_Utils.scrollToElement(profilePage.profileSectionTitle);
        Browser_Utils.waitFor(2);
    }


    @Then("Click on profile title")
    public void click_on_profile_title() {

        Browser_Utils.clickWithJS(profilePage.profileSectionTitle);
        Browser_Utils.waitFor(2);
    }


    @Then("Verify that the profile page is displayed")
    public void verify_that_the_profile_page_is_displayed() {

        Browser_Utils.verifyURL("https://demoqa.com/profile");
        Assert.assertTrue(Browser_Utils.isElementPresent(profilePage.goToBookStoreButton,10));
        Assert.assertTrue(Browser_Utils.isElementPresent(profilePage.deleteAccountButton,10));
        Assert.assertTrue(Browser_Utils.isElementPresent(profilePage.deleteAllBooksButton,10));
    }

    @Then("Scroll down the page until the row per page icon")
    public void scroll_down_the_page_until_the_row_per_page_icon() {

        Browser_Utils.scrollToElement(profilePage.rowPerPageIcon);
        Browser_Utils.waitFor(2);
    }


    @Then("Click on the row per page icon")
    public void click_on_the_row_per_page_icon() {

        Browser_Utils.clickOnElement(profilePage.rowPerPageIcon);
        Browser_Utils.waitFor(2);
    }


    @Then("Click on the five rows title")
    public void click_on_the_five_rows_title() {

        Browser_Utils.clickOnElement(profilePage.row5Title);
        Browser_Utils.clickOnElement(profilePage.profileSectionTitle);
        Browser_Utils.waitFor(2);
    }


    @Then("Click on the ten rows title")
    public void click_on_the_ten_rows_title() {

        Browser_Utils.clickOnElement(profilePage.row10Title);
        Browser_Utils.waitFor(2);
    }


    @Then("Click on the twenty rows title")
    public void click_on_the_twenty_rows_title() {

        Browser_Utils.clickOnElement(profilePage.row20Title);
        Browser_Utils.waitFor(2);
    }


    @Then("Click on the fifty rows title")
    public void click_on_the_fifty_rows_title() {

        Browser_Utils.clickOnElement(profilePage.row50Title);
        Browser_Utils.waitFor(2);
    }


    @Then("Verify that {int} rows are displayed on the page")
    public void verify_that_rows_are_displayed_on_the_page(Integer int1) {

        Assert.assertEquals(profilePage.verifyRowCount(), Integer.parseInt(int1.toString()));
        Browser_Utils.waitFor(2);
    }


    @Then("Verify that the selected product has been added to your collection")
    public void verifyThatTheSelectedProductHasBeenAddedToYourCollection() {

        Browser_Utils.verifyElementDisplayed(profilePage.product1);
    }

    @And("User deletes product from the collection")
    public void userDeletesProductFromTheCollection() {

        Browser_Utils.clickOnElement(profilePage.deleteIcon);
    }

    @And("User clicks ok button on the popup window")
    public void userClicksOkButtonOnThePopupWindow() {

        Browser_Utils.clickOnElement(profilePage.deletePopupOkButton);
    }

    @Then("Verify that book deleted Alert message is displayed")
    public void verifyThatBookDeletedAlertMessageIsDisplayed() {

        Browser_Utils.waitFor(2);
        String deletedText = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals("Book deleted.", deletedText);

    }

    @And("User clicks ok button on the alert")
    public void userClicksOkButtonOnTheAlert() {

        Driver.getDriver().switchTo().alert().accept();



    }


    @And("User deletes all product from the collection")
    public void userDeletesAllProductFromTheCollection() {

        Browser_Utils.scrollToElement(profilePage.deleteAllBooksButton);
        Browser_Utils.clickOnElement(profilePage.deleteAllBooksButton);
    }

    @Then("Verify that all books deleted Alert message is displayed")
    public void verifyThatAllBooksDeletedAlertMessageIsDisplayed() {

        Browser_Utils.waitFor(2);
        String deletedText = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals("All Books deleted.", deletedText);
    }

    @Then("Verify that all books are remove from the collection")
    public void verifyThatAllBooksAreRemoveFromTheCollection() {

        Browser_Utils.verifyElementDisplayed(profilePage.noRowsFoundTitle);

    }
}