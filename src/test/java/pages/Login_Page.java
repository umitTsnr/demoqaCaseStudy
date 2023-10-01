package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Browser_Utils;
import utilities.Config_Reader;
import utilities.Driver;


public class Login_Page extends Base_Page {


    @FindBy(xpath = "//h2[text()='Welcome,']")
    public WebElement welcomeTitle;

    @FindBy(xpath = "//h5[text()='Login in Book Store']")
    public WebElement loginInBookStoreTitle;

    @FindBy(id = "userName")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(id = "newUser")
    public WebElement newUserButton;

    @FindBy(id = "name")
    public WebElement invalidMessage;

    @FindBy(xpath = "//input[@class='mr-sm-2 is-invalid form-control']")
    public WebElement invalidInputBox;




    public void navigateToBooksStorePage(){

        Driver.getDriver().get(Config_Reader.get("url"));
        Browser_Utils.waitFor(1);
    }


    public boolean checkForInvalidCredentials(){

        if (invalidMessage.isDisplayed() || invalidInputBox.getAttribute("class").equals("mr-sm-2 is-invalid form-control")) {
            return true;

        } else {
            return false;
        }
    }



}

