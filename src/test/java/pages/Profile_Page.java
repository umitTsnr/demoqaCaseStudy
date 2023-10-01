package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Browser_Utils;
import utilities.Config_Reader;
import utilities.Driver;

import java.util.List;


public class Profile_Page extends Base_Page {

    @FindBy(xpath = "//span[text()='Profile']")
    public WebElement profileSectionTitle;

    @FindBy(id = "gotoStore")
    public WebElement goToBookStoreButton;

    @FindBy(xpath = "//button[text()='Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//button[text()='Delete All Books']")
    public WebElement deleteAllBooksButton;

    @FindBy(xpath = "//select[@aria-label='rows per page']")
    public WebElement rowPerPageIcon;

    @FindBy(xpath = "//option[@value='5']")
    public WebElement row5Title;

    @FindBy(xpath = "//option[@value='10']")
    public WebElement row10Title;

    @FindBy(xpath = "//option[@value='20']")
    public WebElement row20Title;

    @FindBy(xpath = "//option[@value='50']")
    public WebElement row50Title;

    @FindBy(id = "see-book-Git Pocket Guide")
    public WebElement product1;

    @FindBy(id = "delete-record-undefined")
    public WebElement deleteIcon;

    @FindBy(id = "closeSmallModal-ok")
    public WebElement deletePopupOkButton;

    @FindBy(xpath = "//div[text()='No rows found']")
    public WebElement noRowsFoundTitle;




    public int verifyRowCount() {

        List<WebElement> searchResultsLists = Driver.getDriver().findElements(By.xpath("//div[@class='rt-tr-group']"));
        return searchResultsLists.size();
    }











}

