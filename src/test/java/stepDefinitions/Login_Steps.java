package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Login_Page;
import utilities.Browser_Utils;
import utilities.Config_Reader;


public class Login_Steps {

    Login_Page loginPage = new Login_Page();


    @Then("Verify that login page is displayed")
    public void verify_that_login_page_is_displayed() {

        Browser_Utils.waitFor(2);
        Browser_Utils.verifyURL("https://demoqa.com/login");
        Assert.assertTrue(Browser_Utils.isElementPresent(loginPage.welcomeTitle,10));
        Assert.assertTrue(Browser_Utils.isElementPresent(loginPage.loginInBookStoreTitle,10));
        Browser_Utils.waitForVisibility(loginPage.newUserButton,10);
        Assert.assertEquals("New User", loginPage.newUserButton.getText());
    }


    @When("User enters a valid username")
    public void user_enters_a_valid_username() {

        Browser_Utils.waitForVisibility(loginPage.userNameInput,10);
        Browser_Utils.clickAndSendText(loginPage.userNameInput, Config_Reader.get("userName"));
    }


    @When("User enters a valid password")
    public void user_enters_a_valid_password() {

        Browser_Utils.waitForVisibility(loginPage.passwordInput,10);
        Browser_Utils.clickAndSendText(loginPage.passwordInput, Config_Reader.get("password"));
    }


    @When("User clicks login button on login page")
    public void user_clicks_login_button_on_login_page() {

        Browser_Utils.waitForVisibility(loginPage.loginButton, 10);
        Browser_Utils.clickOnElement(loginPage.loginButton);
        Browser_Utils.waitFor(2);
    }


    @Then("Verify that the user logged out successfully")
    public void verify_that_the_user_logged_out_successfully() {

        Browser_Utils.waitFor(2);
        Browser_Utils.verifyURL("https://demoqa.com/login");
        Assert.assertTrue(Browser_Utils.isElementPresent(loginPage.welcomeTitle,10));
        Assert.assertTrue(Browser_Utils.isElementPresent(loginPage.loginInBookStoreTitle,10));
    }


    @When("Enter an invalid {string} in the username input box")
    public void enter_an_invalid_in_the_username_input_box(String username) {

        Browser_Utils.waitForVisibility(loginPage.userNameInput,10);
        Browser_Utils.clickAndSendText(loginPage.userNameInput, username);
    }


    @When("Enter an invalid {string} in the password input box")
    public void enter_an_invalid_in_the_password_input_box(String password) {

        Browser_Utils.waitForVisibility(loginPage.passwordInput,10);
        Browser_Utils.clickAndSendText(loginPage.passwordInput, password);
    }


    @Then("Verify that the user cannot log in")
    public void Verify_that_the_user_cannot_log_in() {

        Browser_Utils.verifyElementDisplayed(loginPage.invalidMessage);
    }


    @Then("Verify that the user cannot log in with empty credentials")
    public void verifyThatTheUserCannotLogInWithEmptyCredentials() {

        Browser_Utils.verifyElementDisplayed(loginPage.invalidInputBox);
    }

}

